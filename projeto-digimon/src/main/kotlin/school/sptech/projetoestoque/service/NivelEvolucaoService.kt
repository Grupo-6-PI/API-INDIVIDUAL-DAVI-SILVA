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

        var lista:MutableList<NivelEvolucao> = nivelEvolucaoRepository.findAll()

        validateLista(lista)

        var resposta = lista.map {
            modelMapper.map(
                it,
                NivelEvolucao::class.java
            )
        }

        return resposta

    }

    fun getNivelEvolucao(id: Long): NivelEvolucaoResponse {
        validateId(id)
        var nivelEvolucao:NivelEvolucao = nivelEvolucaoRepository.findById(id).get()

        var response:NivelEvolucaoResponse = modelMapper.map(
            nivelEvolucao,
            NivelEvolucaoResponse::class.java
        )

        return response

    }

    fun postNivelEvolucao(nivelEvolucaoRequest: NivelEvolucaoRequest): NivelEvolucaoResponse {

        var entity:NivelEvolucao = modelMapper.map(
            nivelEvolucaoRequest,
            NivelEvolucao::class.java
        )

        var nivelSalvo = nivelEvolucaoRepository.save(entity)

        var response:NivelEvolucaoResponse = modelMapper.map(
            nivelSalvo,
            NivelEvolucaoResponse::class.java
        )

        return response

    }

    fun deleteNivelEvolucao(id: Long):NivelEvolucaoResponse {
        validateId(id)

        var entity:NivelEvolucaoResponse = getNivelEvolucao(id)

        nivelEvolucaoRepository.deleteById(id)

        return entity

    }

}