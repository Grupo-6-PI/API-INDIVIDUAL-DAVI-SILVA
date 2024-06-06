package school.sptech.projetoestoque.repository

import org.springframework.data.jpa.repository.JpaRepository
import school.sptech.projetoestoque.dominio.LinhaEvolucao

interface LinhaEvolucaoRepository: JpaRepository<LinhaEvolucao,Long> {
}