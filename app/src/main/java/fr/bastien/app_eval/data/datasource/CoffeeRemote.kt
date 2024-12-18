package fr.bastien.app_eval.data.datasource

import fr.bastien.app_eval.network.Api

object CoffeeRemote {
    suspend fun getCoffeeImage() : String {
        return Api.retrofitService.getCoffeeImage()
    }
}
