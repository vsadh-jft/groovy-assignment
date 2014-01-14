/**
 * Created by vivekmaster146 on 14/1/14.
 */
import java.util.Arrays;

class Person1{

    def firstname;
    def lastname;

}
class test {
    public static void main(String[] args) {
    def list = []

        Person1 p = new Person1(firstname: "vivek",lastname: "sadh")
        Person1 p2 = new Person1(firstname: "bhaskar",lastname: "kandiyal")
        Person1 p3 = new Person1(firstname: "shruti",lastname: "sagar")
        list.add(p)
        list.add(p2)
        list.add(p3)
        list = list.sort{ it.lastname
        }
       list.reverse(true)
       list.each {
          println it.firstname + " " + it.lastname

       }



    }


}
