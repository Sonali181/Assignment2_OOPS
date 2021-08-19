class Person(val name: String, val age: Int) extends Ordered {
  def crosscheck(person_Two: Person): Unit = {
    if(this.name.equals(person_Two.name)){
      if (this.age>person_Two.age){
        println("True")
      }
      else{
        println("False")
      }
    }
    else{
      if (this.name.length>person_Two.name.length) {
        println("True")
      }
      else
      {
        println("False")
      }
    }
  }
}
