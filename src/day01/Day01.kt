package day01

import Day
import readInput

class Day01 : Day {
    private fun part1(input: List<String>): Int {
        return 0
    }

    private fun part2(input: List<String>): Int {
        return 0
    }

    override fun play() {
        val testInput = readInput("day01/Day01_test")
        check(part1(testInput) == 0)
        check(part2(testInput) == 0)

        val input = readInput("day01/Day01")
        println("Day 01")
        println("- Part 1 result: ${part1(input)}")
        println("- Part 2 result: ${part2(input)}")
    }
}
