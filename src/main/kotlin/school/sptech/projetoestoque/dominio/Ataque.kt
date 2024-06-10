package school.sptech.projetoestoque.dominio

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Ataque(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nome:String,
    private var dano:Double
) {
}