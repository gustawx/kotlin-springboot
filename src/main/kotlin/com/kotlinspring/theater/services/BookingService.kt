package com.kotlinspring.theater.services

import com.kotlinspring.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {
    fun isSeatFree(seat: Seat): Boolean = true
}