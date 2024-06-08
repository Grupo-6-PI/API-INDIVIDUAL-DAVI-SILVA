package school.sptech.projetoestoque.service

import org.modelmapper.ModelMapper
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import school.sptech.projetoestoque.dominio.NivelEvolucao
import school.sptech.projetoestoque.dominio.NivelKarma
import school.sptech.projetoestoque.dto.nivelevolucao.NivelKarmaRequest
import school.sptech.projetoestoque.dto.nivelevolucao.NivelKarmaResponse
import school.sptech.projetoestoque.repository.NivelKarmaRepository

@Service
class NivelKarmaService(
    private val nivelKarmaRepository: NivelKarmaRepository,
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

        if (!nivelKarmaRepository.existsById(id)){
            throw ResponseStatusException(
                HttpStatusCode.valueOf(404)
            )
        }

    }

    fun getListaNivelKarma(): List<NivelKarma> {

        val lista:MutableList<NivelKarma> = nivelKarmaRepository.findAll()

        validateLista(lista)

        val resposta = lista.map {
            modelMapper.map(
                it,
                NivelKarma::class.java
            )
        }

        return resposta

    }

    fun getNivelKarma(id: Long): NivelKarmaResponse {
        validateId(id)
        val nivelKarma:NivelKarma = nivelKarmaRepository.findById(id).get()

        val response:NivelKarmaResponse = modelMapper.map(
            nivelKarma,
            NivelKarmaResponse::class.java
        )

        return response

    }

    fun postNivelKarma(nivelKarmaRequest: NivelKarmaRequest): NivelKarmaResponse {

        val entity:NivelKarma = modelMapper.map(
            nivelKarmaRequest,
            NivelKarma::class.java
        )

        val nivelSalvo = nivelKarmaRepository.save(entity)

        val response:NivelKarmaResponse = modelMapper.map(
            nivelSalvo,
            NivelKarmaResponse::class.java
        )

        return response

    }

    fun deleteNivelEvolucao(id: Long):NivelKarmaResponse {
        validateId(id)

        val entity:NivelKarmaResponse = getNivelKarma(id)

        nivelKarmaRepository.deleteById(id)

        return entity

    }

}