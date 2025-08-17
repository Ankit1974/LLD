package UMLDigram;

/*
          1. Structural Diagram:

          A structural diagram is a type of diagram in Unified Modeling Language (UML) (and software/system design in general) 
          that represents the static (structural) aspects of a system — meaning how different parts of the 
          system are organized, related, and connected rather than how they behave over time.

                                                                  or

          It shows the “blueprint” of the system — the building blocks (classes, components, objects, nodes, etc.) and their relationships.
*/
  

/*
           Types of Structural Diagrams in UML:

              1. Class Diagram – shows classes, attributes, methods, and relationships (inheritance, associations).
              2. Object Diagram – snapshot of objects and their relationships at a particular time.
              3. Component Diagram – shows how software components (modules, services) are connected.
              4. Composite Structure Diagram – shows internal structure of a class or component.
              5. Deployment Diagram – shows how software is deployed on hardware (nodes, devices, servers).
              6. Package Diagram – shows system organization into packages and dependencies between them.
              7. Profile Diagram – extends UML with stereotypes and custom elements.
*/

/*
              Example of Structural Diagrams in UML Digram:

                   In a banking system:

                        . Class Diagram may show Account, Customer, and Transaction classes with relationships.
                        . Deployment Diagram may show that the banking app is deployed on a mobile device, 
                        which connects to a web server, which talks to a database server.
*/


/*
         In class Digram access modifiers are reperesented as:
            1. Public -   +
            2. Private -  -
            3. Protected -  #
            4. Abstract - Then we have to write <<abstract>> on top of the box 
*/


/*
        1. Aggregation ("Has-a" + Shared Ownership)

              . Definition: If the parent is destroyed, the child can still exist independently.
              . It’s a weaker form of association.


         2. Composition ("Has-a" + Strong Ownership)

              . Definition: If the parent is destroyed, the child cannot exist.
              . It’s a part–whole relationship with lifecycle dependency.
*/



     //  Example  of Composition , aggregation and association in UML Digram

/*
      // Engine class (part of Car)
        class Engine {
             private String type;

        Engine(String type) {
            this.type = type;
    }

        public void start() {
        System.out.println(type + " engine starting...");
       }
    }

      // Car class (composed of Engine)
        class Car {
           private Engine engine; // Composition

         Car(String engineType) {
               // Car creates and owns Engine (lifecycle bound)
               this.engine = new Engine(engineType);
      }

         public void drive() {
               engine.start();  // Delegating functionality
             System.out.println("Car is driving...");
        }
      }

            // Test class
               public class Main {
               public static void main(String[] args) {
                         Car car = new Car("V8");
                           car.drive();
                         }
    }

*/