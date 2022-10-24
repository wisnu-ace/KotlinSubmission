package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Wisnu"
    val lastName = "Aryo"
    val age: Number = 20
    val status = true
    if (!status){
        println("$firstName $lastName berumur $age single")
    } else if (status == true){
        println("$firstName $lastName berumur $age tidak single")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Micro Challenge Group $groupId beranggotakan $groupMember pada sesi $session")
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val anggotaGrup: List<String> = listOf("Wisnu", "Anggi", "Aqil", "Clinton", "Akmal", "Briyan")
    return anggotaGrup.elementAt(0)
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 6
    return mentor.size + countOfGroup
}

fun main() {

    myProfile()
    println()

    val myName = myName()
    println("My Name is : $myName")
    println()

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")
    println()
    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(2, listOf("Wisnu", "Anggi", "Aqil", "Clinton", "Akmal", "Briyan"), "Morning")

}