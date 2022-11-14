package com.example.app

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnAllclr.setOnClickListener {
            binding.input.text=""
            binding.answer.text=""
        }

        binding.btn0.setOnClickListener {
            binding.input.append("0")
        }

        binding.btn1.setOnClickListener {
            binding.input.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.input.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.input.append("3")
        }

        binding.btn4.setOnClickListener {
            binding.input.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.input.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.input.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.input.append("7")
        }

        binding.btn8.setOnClickListener {
            binding.input.append("8")
        }

        binding.btn9.setOnClickListener {
            binding.input.append("9")
        }

        binding.btnDot.setOnClickListener {
            binding.input.append(".")
        }

        binding.btnDvd.setOnClickListener {
            binding.input.append(" / ")
        }

        binding.btnMinus.setOnClickListener {
            binding.input.append(" - ")
        }

        binding.btnPlus.setOnClickListener {
            binding.input.append(" + ")
        }

        binding.btnMul.setOnClickListener {
            binding.input.append(" * ")
        }

        binding.startBrckt.setOnClickListener {
            binding.input.append("(")
        }

        binding.closeBrckt.setOnClickListener {
            binding.input.append(")")
        }

        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.input.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.answer.text = longresult.toString()
            } else {
                binding.answer.text = result.toString()
            }

        }


    }

}