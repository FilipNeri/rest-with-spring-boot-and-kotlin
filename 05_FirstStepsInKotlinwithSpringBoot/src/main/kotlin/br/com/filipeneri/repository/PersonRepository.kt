package br.com.filipeneri.repository

import br.com.filipeneri.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<Person, Long?> {//this long is type of id
}