package com.example.view.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn_toast:Button
    private lateinit var iv_1:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_1=findViewById(R.id.iv_1)
        btn_toast=findViewById(R.id.btn_toast)


        btn_toast.setOnClickListener{
            iv_1.setImageResource(R.drawable.android) //이미지 뷰에 새로운 item 이미지 등록
            Toast.makeText(this@MainActivity,"버튼이 클릭 되었습니다.",Toast.LENGTH_SHORT).show()
        }

    }
}