fun main() {
    val person = Human("Meg",20,50.67F)
    (person.eat(3))
    (person.speak("Lake Turkana"))
    (person.birthday())

    val user1 = User("Bob","Marley","bobmarley@gmail.com","0722334455","bob2424")
    println(user1.email)
    println(user1.lastName)
}
class Human(var name:String,var age:Int,var weight:Float){
    fun eat (foodWeight: Int){
        println("i am eating $foodWeight kgs of food")
    }

    fun speak (speech:String){
        println( "$speech")
    }

    fun birthday(){
        age++
        println(age)
    }

}
data class User (var firstName: String,var lastName: String,var email:String,var phoneNumber: String,var password:String)