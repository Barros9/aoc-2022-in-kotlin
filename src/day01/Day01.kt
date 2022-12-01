package day01

import Day
import readInput

class Day01 : Day {
    private fun part1(input: List<String>): Int {
        return input
            .asSequence()
            .flatMapIndexed { index, value ->
                when {
                    index == 0 || index == input.lastIndex -> listOf(index)
                    value.isEmpty() -> listOf(index - 1, index + 1)
                    else -> emptyList()
                }
            }
            .windowed(size = 2, step = 2) { (from, to) -> input.slice(from..to) }
            .maxOfOrNull { elf -> elf.sumOf { it.toInt() } } ?: 0
    }

    private fun part2(input: List<String>): Int {
        return input
            .asSequence()
            .flatMapIndexed { index, value ->
                when {
                    index == 0 || index == input.lastIndex -> listOf(index)
                    value.isEmpty() -> listOf(index - 1, index + 1)
                    else -> emptyList()
                }
            }
            .windowed(size = 2, step = 2) { (from, to) -> input.slice(from..to) }
            .map { elf -> elf.sumOf { it.toInt() } }
            .sortedDescending()
            .take(3)
            .sum()
    }

    override fun play() {
        val testInput = readInput("day01/Day01_test")
        check(part1(testInput) == 24000)
        check(part2(testInput) == 45000)

        val input = readInput("day01/Day01")
        println("Day 01")
        println("- Part 1 result: ${part1(input)}")
        println("- Part 2 result: ${part2(input)}")
    }
}
