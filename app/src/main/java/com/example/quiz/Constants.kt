package com.example.quiz

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Essa bandeira representa que pais?",
            R.drawable.ba,
            "Argentina",
            "Bahamas",
            "Barbados",
            "Maldivas",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Essa bandeira representa que pais?",
            R.drawable.br,
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
            R.drawable.leba,
            "Irã",
            "Líbano",
            "Egito",
            "Jordânia",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Essa bandeira representa que pais?",
            R.drawable.ne,
            "Nepal",
            "Tailândia",
            "Sri Lanka",
            "Butão",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Essa bandeira representa que pais?",
            R.drawable.gui_bui,
            "Moçambique",
            "Gâmbia",
            "Guiné-Bissau",
            "Guiné",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "Essa bandeira representa que pais?",
            R.drawable.s_ko,
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
            R.drawable.phi,
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
            R.drawable.n_ko,
            "Malásia",
            "Brunei",
            "Coreia do Norte",
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