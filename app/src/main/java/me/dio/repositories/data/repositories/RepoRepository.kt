package me.dio.repositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.repositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}