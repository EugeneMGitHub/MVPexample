package com.app.mvp_xml.view

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import com.app.mvp_xml.R
import com.app.mvp_xml.databinding.ActivityMainBinding
import com.app.mvp_xml.presenter.PresenterImpl

class MainActivity : AppCompatActivity(), ViewInterface {

    private val presenter = PresenterImpl(view = this)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSend.setOnClickListener {
            presenter.save("This is message from MainActivity")
        }

        binding.buttonRecieve.setOnClickListener {
            presenter.load()
        }

    }

    override fun showResults(text: String) {
        binding.textViewMessage.text = text
    }
}