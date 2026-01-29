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
    Quiz().PrintProgressBar()

    Quiz().apply { PrintQuiz() }
}

