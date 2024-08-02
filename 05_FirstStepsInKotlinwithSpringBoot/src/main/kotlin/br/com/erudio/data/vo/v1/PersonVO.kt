package br.com.erudio.data.vo.v1

import jakarta.persistence.*


data class PersonVO
(
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = "",
)