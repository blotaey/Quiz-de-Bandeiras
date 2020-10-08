package com.example.quiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Essa bandeira representa que pais?",
            R.drawable.argen,
            "Argentina",
            "El Salvador",
            "Barbados",
            "Maldivas",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Essa bandeira representa que pais?",
            R.drawable.bra,
            "Portugal",
            "República Dominicana",
            "Venezuela",
            "Brasil",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "Essa bandeira representa que pais?",
            R.drawable.jp,
            "Coreia do Sul",
            "Vietnã",
            "Japão",
            "Singapura",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "Essa bandeira representa que pais?",
            R.drawable.egi,
            "Irã",
            "Egito",
            "Libano",
            "Jordânia",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Essa bandeira representa que pais?",
            R.drawable.tai,
            "Nepal",
            "Tailândia",
            "Sri Lanka",
            "Butão",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Essa bandeira representa que pais?",
            R.drawable.guine,
            "Moçambique",
            "Gâmbia",
            "Guiné-Bissau",
            "Guiné",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "Essa bandeira representa que pais?",
            R.drawable.coreias,
            "Coreia do Sul",
            "China",
            "Austrália",
            "Nova Zelândia",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "Essa bandeira representa que pais?",
            R.drawable.fili,
            "Coreia do Norte",
            "Filipinas",
            "Singapura",
            "Colombia",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "Essa bandeira representa que pais?",
            R.drawable.que,
            "Malásia",
            "Brunei",
            "Quênia",
            "Timor-Leste",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "Essa bandeira representa que pais?",
            R.drawable.ind,
            "Paquistão",
            "India",
            "Bangladesh",
            "Timor-Leste",
            2
        )
        questionList.add(que10)
        return questionList
    }
}