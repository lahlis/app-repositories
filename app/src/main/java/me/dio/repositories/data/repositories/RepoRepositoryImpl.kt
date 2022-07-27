package me.dio.repositories.data.repositories


import kotlinx.coroutines.flow.flow
import me.dio.repositories.core.RemoteException
import me.dio.repositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca")
        }

    }
}