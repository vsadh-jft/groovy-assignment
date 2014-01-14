/**
 * Created by vivekmaster146 on 14/1/14.
 */
class Person
{
    def firstname
    def city


}
class test2 {
    public static void main(String[] args) {
        Person p = new Person(firstname: "vivek",city: "delhi")
        Person p2 = new Person(firstname: "bhasar",city: "mumbai")
        Person p3 = new Person(firstname: "tarun",city: "delhi")
        def map =
                ["1":[p],"2":[p2], "3":[p3]]

        def usersBylname = map.groupBy({a,b ->  b.city })
        usersBylname.each    {lname,item ->
           println(lname + "-> ")
            item.each { println it.value.firstname + " " + it.value.city}



        }


//        def map =
//                [1:[firstName:'John', city:"Smith"],
//                        2:[firstName:'Amy',  city:'Madigan'],
//                        3:[firstName:'Lucy', city:'B'],
//                        4:[firstName:'Ella', city:'B'],
//                        5:[firstName:'Pete', city:'Dog']]
    }
}
