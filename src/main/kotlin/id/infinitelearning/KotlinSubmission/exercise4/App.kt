package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val pulauBesar = arrayOf("Jawa", "Sumatera", "Kalimantan", "Sulawesi", "Papua")
    print("Masukkan nama pulau besar di Indonesia : ")
    val inputPulau = readLine()!!
    if (pulauBesar.contains(inputPulau)){
        println("Pulau $inputPulau adalah pulau besar di Indonesia")
    } else {
        try {
            println(pulauBesar[6])
        } catch (ex: ArrayIndexOutOfBoundsException){
            println("Pulau tersebut tidak tercatat sebagai pulau besar")
        }
    }
}