package school.sptech.projetoestoque.dominio

import jakarta.persistence.*
import java.time.LocalDate
@Entity
class Treinador(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nome:String,
    private var dataNascimento:LocalDate,
    @field:OneToMany(mappedBy = "treinador")
    private var digimons:MutableList<Digimon>,
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

    fun getDataNascimento(): LocalDate {
        return dataNascimento
    }

    fun setDataNascimento(dataNascimento: LocalDate) {
        this.dataNascimento = dataNascimento
    }

    fun getDigimons(): MutableList<Digimon> {
        return digimons
    }

    fun setDigimons(digimons: MutableList<Digimon>) {
        this.digimons.addAll(digimons)
    }

}