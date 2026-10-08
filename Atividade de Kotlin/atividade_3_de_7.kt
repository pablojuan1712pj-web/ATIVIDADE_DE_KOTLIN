fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Olá! Eu adoro desenhos e videogames.")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia muito longa que ultrapassa os cinquenta caracteres permitidos.")
}