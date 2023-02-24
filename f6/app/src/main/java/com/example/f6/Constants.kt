package com.example.f4

import android.util.Log
import com.example.f6.Question
import com.example.f6.R

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.f_eng, "Turkey", "Iceland", "England", "Pakistan", 3
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.f_iceland, "Turkey", "Iceland", "England", "Pakistan", 2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.f_latvia, "Latvia", "Iceland", "England", "Pakistan", 1
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.f_mongolia, "Mongolia", "Iceland", "England", "Pakistan", 1
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.f_pakistan, "Turkey", "Iceland", "Pakisran", "Pakistan", 3
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.f_qatar, "Turkey", "Iceland", "England", "Qatar", 5
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.f_turkey, "Turkey", "Iceland", "England", "Pakistan", 1
        )
        questionList.add(que7)
        return questionList

    }
}