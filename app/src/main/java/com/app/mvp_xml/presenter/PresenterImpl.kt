package com.app.mvp_xml.presenter

import androidx.lifecycle.MutableLiveData
import com.app.mvp_xml.view.ViewInterface

class PresenterImpl(
    private val currentDate: String = "15/17/2020",
    private val view: ViewInterface
) : PresenterInterface {

    override fun save(text: String) {
        view.showResults(text = text)
    }

    override fun load() {
        view.showResults(text = currentDate)
    }
}