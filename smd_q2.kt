abstract class Person (
    val ID: Int, val name: String, val address: String, val Phone: Int, val Profession: String) {
    abstract fun Register(UID: String): String
    abstract fun Perform(Duty: String): String
    abstract fun Include(Service: String): String
    abstract fun like(item: String): String

}

open class Student(
    ID: Int,
    name: String,
    address: String,
    phone: Int,
    profession: String,
    val studentID: String,
    val major: String,
    val year: Int): Person(ID, name, address, phone, profession) {
    override fun Register(UID: String): String {
        return "Registered Course: $UID"
    }

    override fun Perform(Duty: String): String {
        return "Course: $Duty"
    }

    override fun Include(Service: String): String {
        return "Service: $Service"
    }

    override fun like(item: String): String {
        return "Item: $item"
    }

    fun getGrade(Course: String): Int {
        return 34
    }

    fun Attent(Class: String): Int
    {
        return 9
    }

    fun Learn() : String {
        return ""
    }
}

fun main()
{
    println("Welcome")
}