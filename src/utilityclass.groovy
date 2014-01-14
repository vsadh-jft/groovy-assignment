/**
 * Created by vivekmaster146 on 14/1/14.
 */

class manager
{
def salary

}


class developer
{
    def salary

}

class teamlead{
    def salary

}

class managersalarycalculate{

int calculate(manager m)
{
        m.salary=40000;


    }

}

class developersalarycalculate{
    int calculate(developer deve)
    {
        deve.salary=20000;




    }


}

class teamleadsalarycalculate{
    int calculate(teamlead team)
    {
       team.salary=10000;




    }



}
class utilityclass {
    public static void main(String[] args) {
def man  = new manager()
        def dev = new developer()
        def tl = new teamlead()

        def closure = { Object ->

       if(Object.getClass().toString()=="class developer")
       {
           def ds  = new developersalarycalculate()
           ds.calculate(dev)
           return  dev.salary

       }


            if(Object.getClass().toString()=="class teamlead")
            {
                def ts  = new teamleadsalarycalculate()
                ts.calculate(tl)
                return  tl.salary
            }
            if(Object.getClass().toString()=="class manager")
            {
                def ms  = new managersalarycalculate()
                ms.calculate(man)
                return man.salary
            }

        }

        println closure(man)
      println  closure(tl)
      println  closure(dev)


    }

}
