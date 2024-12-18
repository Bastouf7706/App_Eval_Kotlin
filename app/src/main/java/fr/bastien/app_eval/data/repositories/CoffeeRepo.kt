package fr.bastien.app_eval.data.repositories

import fr.bastien.app_eval.network.Api

object CoffeeRepo {
    suspend fun getCoffeeImage() : String {
        return Api.retrofitService.getCoffeeImage()
    }
}