interface ProgressPrintable {
    var progressText: String
    fun PrintProgressBar()
}

class Quiz : ProgressPrintable {
    override var progressText: String
        get() = "${answered} of ${total} answered"
        set(value) {}

    val question1 = Question<String>(
        "Речка спятила с ума – По домам пошла сама. ____",
        "водопровод",
        Difficulty.MEDIUM
    )

    val question2 = Question<Boolean>(
        "Небо зелёное. Правда или ложь",
        false,
        Difficulty.EASY
    )

    val question3 = Question<Int>(
        "Сколько дней между полнолуниями?",
        28,
        Difficulty.HARD
    )

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override fun PrintProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    fun PrintQuiz(){
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

//val Quiz.StudentProgress.progressText: String
//    get() = "${answered} of ${total} answered"

//fun Quiz.StudentProgress.printProgressBar() {
//    repeat(Quiz.answered) { print("▓") }
//    repeat(Quiz.total - Quiz.answered) { print("▒") }
//    println()
//    println(Quiz.progressText)
//}