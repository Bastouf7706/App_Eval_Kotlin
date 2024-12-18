//Création du ViewModel pour récupérer l'image du café
package fr.bastien.app_eval.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import fr.bastien.app_eval.data.repositories.CoffeeRepo

//Création du ViewModel
class CoffeeVM : ViewModel() {
    private val coffeeRepo = CoffeeRepo //Déclaration du repo
    private val _state = MutableStateFlow(CoffeeState())
    val state: StateFlow<CoffeeState> get() = _state.asStateFlow()

    init {
        viewModelScope.launch(context = Dispatchers.IO) {
            try {
                val res = coffeeRepo.getCoffeeImage()// Récupère l'image du café
                _state.value = CoffeeState(image = res)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    data class CoffeeState(
        val image: String = ""
    )
}
