class customer
{

  
 var custid=101
 var custname="Chaitanya"
 var orderid=348474
 var orderamount=300.56
  def show()={
   println("Order ID: "+orderid)
   println("Order Amount: "+orderamount)
   
  }
  
}

object custdetails
{
  def main(args:Array[String])
  {
    var c = new customer
    c.show()
  }
}