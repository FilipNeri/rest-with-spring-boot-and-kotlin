package br.com.erudio.model

data class Person (
    //In a data class, don't use 'val' because it is meant for immutable variables.
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = "",
)