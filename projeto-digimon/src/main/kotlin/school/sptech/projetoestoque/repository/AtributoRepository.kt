package school.sptech.projetoestoque.repository

import org.springframework.data.jpa.repository.JpaRepository
import school.sptech.projetoestoque.dominio.Atributo

interface AtributoRepository: JpaRepository<Atributo,Long> {
}