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

//val solarSystem = mutableListOf(
//        "Mercury", "Venus", "Earth", "Mars",
//        "Jupiter", "Saturn", "Uranus", "Neptune"
//    )
//
//    println(solarSystem.size)
//
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//
//    for (planet in solarSystem) {
//        println(planet)
//    }
//
//    solarSystem.add("Pluto")
//    solarSystem.add(3, "Sun")
//
//    solarSystem[3] = "Future Moon"
//    println(solarSystem[3])
//    println(solarSystem[9])
//
//    solarSystem.removeAt(9)
//    solarSystem.remove("Uranus")
//
//    println(solarSystem.contains("Pluto"))
//    println("Uranus" in solarSystem)

//    val solarSystem = mutableSetOf(
//        "Mercury", "Venus", "Earth", "Mars",
//        "Jupiter", "Saturn", "Uranus", "Neptune"
//    )
//
//    println(solarSystem.size)
//
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//
//    println(solarSystem.contains("Pluto"))
//    println("Pluto" in solarSystem)
//
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))

//    val solarSystem = mutableMapOf(
//        "Mercury" to 0,
//        "Venus" to 0,
//        "Earth" to 1,
//        "Mars" to 2,
//        "Jupiter" to 79,
//        "Saturn" to 82,
//        "Uranus" to 27,
//        "Neptune" to 14
//    )
//
//    println(solarSystem.size)
//
//    solarSystem["Pluto"] = 5
//    println(solarSystem.size)
//
//    println(solarSystem["Pluto"])
//    println(solarSystem["Theia"])
//
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//
//    solarSystem["Jupiter"] = 78
//    println(solarSystem["Jupiter"])

//    cookies.forEach {
//        println("Пункт меню: ${it.name}")
//    }
//
//    val fullMenu = cookies.map { "${it.name} - ${it.price}$" }
//    println("Полное меню:")
//    fullMenu.forEach { println(it) }
//
//    val softBakedMenu = cookies.filter { it.softBaked }
//    println("Мягкое печенье:")
//    softBakedMenu.forEach { println("${it.name} - ${it.price}$") }
//
//    val groupedMenu = cookies.groupBy { it.softBaked }
//    val softBakedMenu = groupedMenu[true] ?: emptyList()
//    val crunchyMenu = groupedMenu[false] ?: emptyList()
//    println("Soft cookies:")
//    softBakedMenu.forEach { println("${it.name} - ${it.price}$") }
//    println("Crunchy Menu:")
//    crunchyMenu.forEach { println("${it.name} - ${it.price}$") }

    val totalPrice = cookies.fold(0.0) { total, cookie -> total + cookie.price }
    println("Total price: ${totalPrice}$")


}

