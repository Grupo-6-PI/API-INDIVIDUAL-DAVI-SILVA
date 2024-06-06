package school.sptech.projetoestoque.dominio

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Atributo(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nome: String
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

}