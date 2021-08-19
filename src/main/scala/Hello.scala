object demo {
  def main(args: Array[String]): Unit = {
    var person_One = new Person("testAgain", 24)
    var person_Two = new Person("test", 25)
    //var person_One =new Person( name="test", age=24)
    //var person_Two=new Person(name="testAgain",age=25)
    person_One.crosscheck(person_Two)
  }
}
