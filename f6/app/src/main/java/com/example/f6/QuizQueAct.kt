//package com.example.f6
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.provider.SyncStateContract
//import android.util.Log
//import com.example.f4.Constants.getQuestions
//import com.example.f6.databinsing.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_quiz_que.*
//
//class QuizQueAct : AppCompatActivity() {
//    private lateinit var binding: Activity
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = .inflate(layoutInflater)
//
//        val view = binding.root
//        setContentView(view)
//        setContentView(R.layout.activity_quiz_que2)
//
//        val questionList = SyncStateContract.Constants.getQuestions()
//        Log.i("Size", "${questionList}")
//        val curPos = 1
//        val question: Question? = questionList[curPos - 1]
//
//        progressBar.progress = curPos
//        tv_progress.text = "$curPos" + '/' + progressBar.max
//
//        tv_question.text = question!!.question
//        iv_image.setImageResource(question.image)
//        tv_option_one.text = question.optionOne
//        tv_option_two.text = question.optionTwo
//        tv_option_three.text = question.optionThree
//        tv_option_four.text = question.optionFour
//    }
//}