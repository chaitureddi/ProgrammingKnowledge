object stringinterpolation
{
  def main(args:Array[String])
  {
  println("This is for string interpolation")
  val name="Chaitanya"
  val age=26
  println(name+" age is "+age)
  println(s"$name age is $age")
  println(f"$name%s age is $age%f")
  println(s"Chaitanya \n Reddi")
  println(raw"Chaitanya \n Reddi")
  }
}