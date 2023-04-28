package br.com.erudio.model

import jakarta.persistence.*

@Entity
@Table(name="person")
data class Person (
    //In a data class, don't use 'val' because it is meant for immutable variables.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)// required
    var firstName: String = "",

    @Column(name = "last_name", nullable = false,length = 80)
    var lastName: String = "",

    @Column( nullable = false,length = 100)
    var address: String = "",

    @Column( nullable = false, length = 6)
    var gender: String = "",
)