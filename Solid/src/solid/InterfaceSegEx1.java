/*
 * S - Single Responsibility Principle - A class should have one and only one reason to change.
 * O - Open Closed Principle- Objects or entities should be open for extensions but closed for modification.
 * L - Liskov Substitution Principles
                  Objects of super class shall be replaced with objects of subclasses.
 * I - Interface Segregation Principle
                  A client never be forced to implement an interface that it does not use.
 */

package solid;
interface VegRestaurant{
    void vegMeals();
}
interface NonVegRestaurant{
    void nonVegMeals();
}
class ABCVegRestaurant implements VegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("provide veg meals");
    }
}
class XYZRestaurant implements VegRestaurant,NonVegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("provide veg meals");
    }

    @Override
    public void nonVegMeals() {
        System.out.println("provide non-veg meals");
    }
}
public class InterfaceSegEx1 {
    public static void main(String[] args) {

    }
}
