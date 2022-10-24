package id.infinitelearning.KotlinSubmission.exercise3



    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    fun main() {
    val score: Int
    val result: Char
    print("Masukkan skor : ")
    val scoreInput = readLine()!!
    score = scoreInput.toInt()

    if (score >= 90) {
        result = 'A'
        println("Selamat! Anda mendapatkan nilai $result")
    } else if (score in 80..89){
        result = 'B'
        println("Anda mendapatkan nilai $result")
    } else if (score in 70..79){
        result = 'C'
        println("Anda mendapatkan nilai $result")
    } else if (score in 60..69){
        result = 'D'
        println("Anda mendapatkan nilai $result")
    } else {
        result = 'E'
        println("Anda mendapatkan nilai $result")
    }
}