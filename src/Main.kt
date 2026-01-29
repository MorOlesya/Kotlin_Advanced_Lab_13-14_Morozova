fun main() {
//    println(question1.answer)
//    println(question2.answer)
//    println(question3.answer)
//
//    println()
//    println(question1.toString())
//    println()
//
//    println("${StudentProgress.answered} of ${StudentProgress.total} answered")
//    println("${Quiz.answered} of ${Quiz.total} answered")
//    println(Quiz.progressText)
//    Quiz.printProgressBar()
//    Quiz().PrintProgressBar()
//
//    Quiz().apply { PrintQuiz() }

//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//
//    println(newSolarSystem[8])

    val solarSystem = mutableListOf(
        "Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"
    )

    println(solarSystem.size)

    println(solarSystem[2])
    println(solarSystem.get(3))

    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }

    solarSystem.add("Pluto")
    solarSystem.add(3, "Sun")

    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    solarSystem.remove("Uranus")

    println(solarSystem.contains("Pluto"))
    println("Uranus" in solarSystem)
}

