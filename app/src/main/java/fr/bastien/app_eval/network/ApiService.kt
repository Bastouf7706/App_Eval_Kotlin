//Création pour implémenter l'API

package fr.bastien.app_eval.network
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://coffee.alexflipnote.dev/RGyE-UZkIr0_coffee.jpg"

//Permet de récupérer la réponse en JSON
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

//Interface pour communiquer avec le serveur
interface ApiService {
    @GET()//Création de la requête GET
    suspend fun getCoffeeImage(): String
}

object Api {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}