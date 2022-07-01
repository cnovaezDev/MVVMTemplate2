package com.example.mvvmtemplate.model

import com.example.mvvmtemplate.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City(CitiesNames.LONDON.getName(), R.drawable.london, 2_000_000))
        cities.add(City(CitiesNames.MOSCOW.getName(), R.drawable.moscow, 6_000_000))
        cities.add(City(CitiesNames.NEWYORK.getName(), R.drawable.newyork, 8_400_000))
        cities.add(City(CitiesNames.PARIS.getName(), R.drawable.paris, 3_500_000))
    }
    fun getCities() = cities;
}