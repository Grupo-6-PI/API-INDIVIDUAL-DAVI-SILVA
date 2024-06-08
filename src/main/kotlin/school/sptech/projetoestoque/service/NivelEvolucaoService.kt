package school.sptech.projetoestoque.service

import org.modelmapper.ModelMapper
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import school.sptech.projetoestoque.dominio.NivelEvolucao
import school.sptech.projetoestoque.dto.nivelevolucao.NivelEvolucaoRequest
import school.sptech.projetoestoque.dto.nivelevolucao.NivelEvolucaoResponse
import school.sptech.projetoestoque.repository.NivelEvolucaoRepository

@Service
class NivelEvolucaoService(
    private val nivelEvolucaoRepository: NivelEvolucaoRepository,
    private val modelMapper: ModelMapper
) {

    fun validateLista(lista:List<*>){
        if (lista.isEmpty()){
            throw ResponseStatusException(
                HttpStatusCode.valueOf(204)
            )
        }
    }

    fun validateId(id:Long){

        if (!nivelEvolucaoRepository.existsById(id)){
            throw ResponseStatusException(
                HttpStatusCode.valueOf(404)
            )
        }

    }

    fun getListaNivelEvolucao(): List<NivelEvolucao> {

        val lista:MutableList<NivelEvolucao> = nivelEvolucaoRepository.findAll()

        validateLista(lista)

        val resposta = lista.map {
            modelMapper.map(
                it,
                NivelEvolucao::class.java
            )
        }

        return resposta

    }

    fun getNivelEvolucao(id: Long): NivelEvolucaoResponse {
        validateId(id)
        val nivelEvolucao:NivelEvolucao = nivelEvolucaoRepository.findById(id).get()

        val response:NivelEvolucaoResponse = modelMapper.map(
            nivelEvolucao,
            NivelEvolucaoResponse::class.java
        )

        return response

    }

    fun postNivelEvolucao(nivelEvolucaoRequest: NivelEvolucaoRequest): NivelEvolucaoResponse {

        val entity:NivelEvolucao = modelMapper.map(
            nivelEvolucaoRequest,
            NivelEvolucao::class.java
        )

        val nivelSalvo = nivelEvolucaoRepository.save(entity)

        val response:NivelEvolucaoResponse = modelMapper.map(
            nivelSalvo,
            NivelEvolucaoResponse::class.java
        )

        return response

    }

    fun deleteNivelEvolucao(id: Long):NivelEvolucaoResponse {
        validateId(id)

        val entity:NivelEvolucaoResponse = getNivelEvolucao(id)

        nivelEvolucaoRepository.deleteById(id)

        return entity

    }

}