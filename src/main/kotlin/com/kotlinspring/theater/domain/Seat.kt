package com.kotlinspring.theater.domain

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Seat(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                var id: Long,
                val roww: Char,
                val num: Int,
                val price: BigDecimal,
                val description: String) {
    override fun toString(): String = "Seat $roww-$num $$price ($description)"
}
