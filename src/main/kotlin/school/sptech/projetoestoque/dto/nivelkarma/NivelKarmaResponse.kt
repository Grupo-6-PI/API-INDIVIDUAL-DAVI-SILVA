package school.sptech.projetoestoque.dto.nivelevolucao

class NivelKarmaResponse(
    private var id:Long,
    private var nivel:String
) {

    fun getId():Long{
        return id
    }

    fun getNivel():String{
        return nivel
    }

    fun setNivel(nivel:String){
        this.nivel = nivel
    }

    fun setId(id:Long){
        this.id = id
    }

}