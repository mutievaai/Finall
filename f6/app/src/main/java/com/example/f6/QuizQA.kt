package com.example.f6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f4.Constants
import kotlinx.android.synthetic.main.activity_quiz_qa.*
import kotlinx.android.synthetic.main.activity_quiz_qa.view.*

class QuizQA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_qa)

        val questionList = Constants.getQuestions()
        Log.i("S", "${questionList}")


        val curPos = 1
        val question: Question? = questionList[curPos-1]

        progressBar.progress = curPos
        tv_progress.text = "$curPos" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }
}