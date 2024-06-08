package school.sptech.projetoestoque.dominio

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Especie(
    @field:Id @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id:Long,
    private var nome: String,
    private var peso:Double,
    private var altura:Double,
    @field:ManyToOne
    private var nivelEvolucao:NivelEvolucao,
    @field:ManyToOne
    private var nivelKarma: NivelKarma,
    @field:ManyToOne
    private var linhaEvolucao: LinhaEvolucao,
    @field:ManyToOne
    private var tipoEvolucao:TipoEvolucao,
    @field:ManyToOne
    private var grupo: Grupo,
    @field:ManyToOne
    private var campo: Campo,
    @field:ManyToOne
    private var atributo: Atributo,
    @field:ManyToOne
    private var tipoDigimon: TipoDigimon
) {

    fun getId(): Long {
        return id
    }

    fun getNome(): String {
        return nome
    }

    fun getPeso(): Double {
        return peso
    }

    fun getAltura(): Double {
        return altura
    }

    fun getNivelEvolucao(): NivelEvolucao {
        return nivelEvolucao
    }

    fun getNivelKarma(): NivelKarma {
        return nivelKarma
    }

    fun getLinhaEvolucao(): LinhaEvolucao {
        return linhaEvolucao
    }

    fun getTipoEvolucao(): TipoEvolucao {
        return tipoEvolucao
    }

    fun getGrupo(): Grupo {
        return grupo
    }

    fun getCampo(): Campo {
        return campo
    }

    fun getAtributo(): Atributo {
        return atributo
    }

    fun getTipoDigimom(): TipoDigimon {
        return tipoDigimon
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun setNome(nome: String) {
        this.nome = nome
    }

    fun setPeso(peso: Double) {
        this.peso = peso
    }

    fun setAltura(altura: Double) {
        this.altura = altura
    }

    fun setNivelEvolucao(nivelEvolucao: NivelEvolucao) {
        this.nivelEvolucao = nivelEvolucao
    }

    fun setNivelKarma(nivelKarma: NivelKarma) {
        this.nivelKarma = nivelKarma
    }

    fun setLinhaEvolucao(linhaEvolucao: LinhaEvolucao) {
        this.linhaEvolucao = linhaEvolucao
    }

    fun setTipoEvolucao(tipoEvolucao: TipoEvolucao) {
        this.tipoEvolucao = tipoEvolucao
    }

    fun setGrupo(grupo: Grupo) {
        this.grupo = grupo
    }

    fun setCampo(campo: Campo) {
        this.campo = campo
    }

    fun setAtributo(atributo: Atributo) {
        this.atributo = atributo
    }

    fun setTipoDigimon(tipoDigimon: TipoDigimon) {
        this.tipoDigimon = tipoDigimon
    }

}