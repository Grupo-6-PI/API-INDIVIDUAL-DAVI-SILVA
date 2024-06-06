package school.sptech.projetoestoque.dominio

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class NivelKarma(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nivel:String
) {

    fun getId(): Long {
        return id
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getNivel(): String {
        return nivel
    }

    fun setNivel(nivel: String) {
        this.nivel = nivel
    }

}