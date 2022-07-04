package com.example.mvvmtemplate.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
            val position: Int = (0..(quote.size - 1)).random()
            return quote[position];
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Sin análisis de requisitos o sin diseño, programar es el arte de crear errores en un documento de texto vacío",
                author = "Louis Srygley"
            ),
            QuoteModel(
                quote = "Antes de que un software pueda ser reusable, primero ha de ser usable.",
                author = "Ralph Johnson"
            ),
            QuoteModel(
                quote = "Creo que la razón por la que Microsoft lo llamó .NET es para que no apareciera en la lista de directorios de Unix.",
                author = "Oktal"
            ),
            QuoteModel(
                quote = "Si los constructores construyeran edificios como los programadores programan aplicaciones, un pájaro carpintero podría destruir toda la civilización.",
                author = "Gerald Weinberg"
            ),
            QuoteModel(
                quote = "Hay dos formas de escribir programas sin errores; sólo la tercera funciona..",
                author = "Alan J. Perlis"
            )
        );
    }

}