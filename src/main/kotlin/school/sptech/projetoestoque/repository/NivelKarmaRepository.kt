package school.sptech.projetoestoque.repository

import org.springframework.data.jpa.repository.JpaRepository
import school.sptech.projetoestoque.dominio.NivelKarma

interface NivelKarmaRepository: JpaRepository<NivelKarma,Long> {
}