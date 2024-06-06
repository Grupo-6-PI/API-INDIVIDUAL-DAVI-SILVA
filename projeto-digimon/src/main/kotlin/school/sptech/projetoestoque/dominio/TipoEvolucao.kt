package school.sptech.projetoestoque.dominio

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TipoEvolucao(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var tipo:String
) {

    fun getId(): Long {
        return id
    }

    fun getTipo(): String {
        return tipo
    }

    fun setId(id: Long){
        this.id = id
    }

    fun setTipo(tipo: String){
        this.tipo = tipo
    }

}