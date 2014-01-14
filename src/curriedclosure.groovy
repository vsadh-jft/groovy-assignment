/**
 * Created by vivekmaster146 on 14/1/14.
 */
class curriedclosure {
    public static void main(String[] args) {

        def greeter = { greeting, name-> println "${greeting}, ${name}!" }

        def sayHello = greeter.curry("Hello")
      sayHello("Vivek") // Hello, Vamsi!
        def sayHi = greeter.curry("Hi")
        sayHi("BHaskar") // Hi, Vamsi!
    }
}
