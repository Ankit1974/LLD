package SolidDesign.OCPPrinciple;

/*
             * Definition of OCP (Open/Closed Principle)
             
                 Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
*/


 /*
            * When we have to use the Interface and Abstract classes?

             - when we have to pass some character or behaviour from parent to child then we have to use abstract class.
             - When we don't have to pass any character or behaviour from parent to child then we have to use interface.
*/



/*
            * How we can follow the OCP Principle in React Native with JavaScript and TypeScript?

             - JavaScript (React Native) → No interfaces or abstract classes. You achieve OCP by composition, props, hooks, 
             and higher-order components.

             - TypeScript (React Native) → You can use interfaces and abstract classes to define contracts for components, props, or services,
                which makes your code more flexible and extendable without modifying existing code.
*/