package me.dio.repositories.data.services

import retrofit2.http.GET
import me.dio.repositories.data.model.Repo
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}