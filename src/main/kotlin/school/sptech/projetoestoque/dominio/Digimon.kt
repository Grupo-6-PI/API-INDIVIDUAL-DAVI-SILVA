package school.sptech.projetoestoque.dominio

import jakarta.persistence.*

@Entity
class Digimon(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nome:String,
    private var personalidade:String,
    @field:ManyToOne
    private var especie: Especie,
    @field:ManyToOne
    private var treinador: Treinador
) {

    fun getId(): Long {
        return id
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getNome(): String {
        return nome
    }

    fun setNome(nome: String) {
        this.nome = nome
    }

    fun getPersonalidade(): String {
        return personalidade
    }

    fun setPersonalidade(personalidade: String) {
        this.personalidade = personalidade
    }

    fun getEspecie(): Especie {
        return especie
    }

    fun setEspecie(especie: Especie) {
        this.especie = especie
    }

    fun getTreinador(): Treinador {
        return treinador
    }

    fun setTreinador(treinador: Treinador) {
        this.treinador = treinador
    }

}