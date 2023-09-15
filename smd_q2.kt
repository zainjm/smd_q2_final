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
    val year: Int,
    val College: Int,
    val grade: String,
    val Semester: Double
): Person(ID, name, address, phone, profession) {
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

    fun Attent(Class: String): String
    {
        return "Class: $Class has been attended"
    }

    fun Learn() : String {
        return ""
    }
}

open class Staff(

    ID: Int,
    name: String,
    address: String,
    phone: Int,
    profession: String,

    val Emp_ID: Int,
    val Emp_Role: String,
    val Emp_Dept: Int,
    val Emp_Salary: String,
    val Emp_Experience: String,

    ): Person(ID, name, address, phone, profession) {
    override fun Register(UID: String): String {
        return "Registered Course: $UID"
    }

    override fun Perform(Duty: String): String {
        return "${this.name} will $Duty"
    }

    override fun Include(Service: String): String {
        return "Service: $Service"
    }

    override fun like(item: String): String {
        return "${this.name} liked: $item"
    }

    fun Attend(Duty: String): String {
        return "Attend"
    }

    fun getPromotion(): String
    {
        return "${this.name} got promoted"
    }

    fun getSalary() : Int
    {
        return 130000
    }
}

class PGStudent(
    val rollNumber: String,
    val Specialization: String,

    ID: Int,
    name: String,
    address: String,
    phone: Int,
    profession: String,
    studentID: String,
    major: String,
    year: Int,
    semester: Int,
    College: String,
    Grade: Double,

    ): Student(ID, name, address, phone, profession, studentID, major, year, semester, College, Grade)

{
    fun submitThese(){
        println("Thesis has been submitted by ${this.name}")
    }
}

class Faculty(

    ID: Int,
    name: String,
    address: String,
    phone: Int,
    profession: String,
    Emp_ID: Int,
    Emp_Role: String,
    Emp_Dept: Int,
    Emp_Salary: String,
    Emp_Experience: String,

    val facultySpecialization: String,
    val section: String,
    val noOfStudents: Int,
    val qualification: String

) : Staff(ID, name, address, phone, profession, Emp_ID, Emp_Role, Emp_Dept, Emp_Salary, Emp_Experience)
{
    fun teach(course: String): String {
        return "${this.name} is teaching $course"
    }

    fun assess(studentGrade: Int): String {
        return "${this.name} assessed student with grade: $studentGrade"
    }
}

class Technician(

    ID: Int,
    name: String,
    address: String,
    phone: Int,
    profession: String,
    Emp_ID: Int,
    Emp_Role: String,
    Emp_Dept: Int,
    Emp_Salary: String,
    Emp_Experience: String,

    val techType: String


) : Staff(ID, name, address, phone, profession, Emp_ID, Emp_Role, Emp_Dept, Emp_Salary, Emp_Experience)
{
    fun install(system: String) : String
    {
        return "${this.name} is installing $system"
    }
}

fun main()
{
    val pgStudent = PGStudent(
        ID = 1,
        name = "John Doe",
        address = "123 Street",
        phone = 1234567890,
        profession = "Postgraduate Student",
        studentID = "S12345",
        major = "Computer Science",
        year = 2,
        rollNumber = "R12345",
        Specialization = "Artificial Intelligence" ,
        semester = 3,
        College = "XYZ University",
        Grade = 3.60
    )
    println(pgStudent.Register("CS101"))
    println(pgStudent.Attent("Machine Learning"))
    pgStudent.submitThese()

    // Creating a Faculty
    val faculty = Faculty(
        ID = 2,
        name = "Dr. Smith",
        address = "456 Avenue",
        phone = 987643210,
        profession = "Professor",
        Emp_ID = 1001,
        Emp_Role = "Senior Professor",
        Emp_Dept = 101,
        Emp_Salary = "$100,000",
        Emp_Experience = "10 years",
        facultySpecialization = "Data Science",
        section = "A",
        noOfStudents = 30,
        qualification = "PhD"
    )
    println(faculty.teach("Data Structures"))
    println(faculty.assess(85))

    // Creating a Technician
    val technician = Technician(
        ID = 3,
        name = "Alice",
        address = "789 Lane",
        phone = 1122334455,
        profession = "Lab Technician",
        Emp_ID = 2001,
        Emp_Role = "Tech Support",
        Emp_Dept = 102,
        Emp_Salary = "$50,000",
        Emp_Experience = "5 years",
        techType = "Hardware"
    )

    println(technician.Perform("Maintain Computers"))
    println(technician.like("New Equipment"))
}
