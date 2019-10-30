package com.riadhmnasri.algorithm.exercises

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

data class Person(val firstname: String,
                  val lastname: String,
                  val birthDate: LocalDate)

fun Person.age(): Long {
    return YEARS.between(birthDate, LocalDate.now())
}
