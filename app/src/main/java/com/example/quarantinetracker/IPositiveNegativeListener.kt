package com.example.quarantinetracker

@FunctionalInterface
interface IPositiveNegativeListener {

    fun onPositive()

    fun onNegative() {

    }
}