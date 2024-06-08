package school.sptech.projetoestoque.dto.nivelevolucao

class NivelKarmaRequest(
    private var nivel: String
) {

    fun getNivel():String{
        return nivel
    }

    fun setNivel(nivel:String){
        this.nivel = nivel
    }

}