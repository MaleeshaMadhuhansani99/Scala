object q3 extends App {
    var accountList:List[Account] = List()

    def accCreate(nic:String, accId: Int):Unit = {
        val acc = new Account(nic, accId)
        accountList = accountList :+ accl
        println(accountList)
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))

    accCreate("1",1)
    accCreate("2",2)

    find(1, accountList)(0).deposit(1000)
    println(find(1, accountList)(0))

    find(1, accountList)(0).transfer(2, 100.0)
    println(find(2, accountList)(0))
}

class Account(id:String, a: Int, b: Double = 0.0){

  val nic:String=id
  val accId: Int =a
  var balance: Double = b

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        val transferAcc = q3.find(account, q3.accountList)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "["+nic+":"+accId +":"+ balance+"]"
}
