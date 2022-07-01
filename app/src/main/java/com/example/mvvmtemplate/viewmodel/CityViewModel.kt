package com.example.mvvmtemplate.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmtemplate.model.City
import com.example.mvvmtemplate.model.CityDataProvider

class CityViewModel : ViewModel() {

    private val cityData = MutableLiveData<City>();
    private val cities = CityDataProvider().getCities();
    private var currentIndex = 0;
    private val delay = 2000L;

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({updateCity()}, delay)
    }

    init {
        loop();
    }

    fun getCityData(): LiveData<City> = cityData;

    private fun updateCity() {
        currentIndex++;
        currentIndex %= cities.size;

        cityData.value =cities[currentIndex];

        loop()
    }


}