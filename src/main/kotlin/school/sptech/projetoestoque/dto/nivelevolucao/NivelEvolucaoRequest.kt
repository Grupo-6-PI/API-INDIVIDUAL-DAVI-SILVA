package school.sptech.projetoestoque.dto.nivelevolucao

class NivelEvolucaoRequest(
    private var nivel: String
) {

    fun getNivel():String{
        return nivel
    }

    fun setNivel(nivel:String){
        this.nivel = nivel
    }

}