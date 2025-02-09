package fr.unica.snicolas.pizzapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform