package br.com.erudio.unittests.mapper.mocks

import br.com.erudio.data.vo.v1.PersonVO
import java.util.ArrayList
import br.com.erudio.model.Person
class MockPerson {
    fun mockEntity(): Person {
        return mockEntity(0)
    }

    fun mockVO(): PersonVO {
        return mockVO(0)
    }

    fun mockEntityList(): ArrayList<Person> {
        val persons: ArrayList<Person> = ArrayList<Person>()
        for (i in 0..13) {
            persons.add(mockEntity(i))
        }
        return persons
    }

    fun mockVOList(): ArrayList<PersonVO> {
        val persons: ArrayList<PersonVO> = ArrayList()
        for (i in 0..13) {
            persons.add(mockVO(i))
        }
        return persons
    }

    fun mockEntity(number: Int): Person {
        val person = Person()
        person.address = "Address Test$number"
        person.firstName = "First Name Test$number"
        person.gender = if (number % 2 == 0) "Male" else "Female"
        person.id = number.toLong()
        person.lastName = "Last Name Test$number"
        return person
    }

    fun mockVO(number: Int): PersonVO {
        val person = PersonVO()
        person.address = "Address Test$number"
        person.firstName = "First Name Test$number"
        person.gender = if (number % 2 == 0) "Male" else "Female"
        person.id = number.toLong()
        person.lastName = "Last Name Test$number"
        return person
    }
}