package SolidDesign.OCPPrinciple;

/*
 * Open/Closed Principle (OCP)

            * Definition:

                 * Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 
            * Meaning:

                 * Open for extension → We should be able to add new behavior to an entity without touching its existing source code.
                 * Closed for modification → Once a class is tested and stable, we should not modify its existing code, since changes may
                   introduce bugs in already working functionality.

            * Example:
                 * If we need to add new functionality, we don't change the existing class directly. Instead, we extend it (inheritance), or use
                   interfaces/abstractions to create new classes that add the behavior.
 */



 /*
            * When we have to use the Interface and Abstract classes?

             - Use an abstract class when you want to inherit both behavior and characteristics from a parent.
             - Use an interface when you just want to define a capability/contract that can be applied across unrelated classes.
*/


/*
            * How we can follow the OCP Principle in React Native with JavaScript and TypeScript?

             - JavaScript (React Native) → No interfaces or abstract classes. You achieve OCP by composition, props, hooks, 
             and higher-order components.

             - TypeScript (React Native) → You can use interfaces and abstract classes to define contracts for components, props, or services,
                which makes your code more flexible and extendable without modifying existing code.
*/