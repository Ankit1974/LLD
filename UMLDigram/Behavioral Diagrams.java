package UMLDigram;

/*
             1. Behavioral diagrams

                  Behavioral diagrams show the dynamic behavior of a system — i.e., how the system works, interacts, and changes over time.
*/



/*
               Types of Behavioral Diagrams in UML:

               1. Use Case Diagram
                    . Shows the system’s functionality from the user’s perspective.
                    . Actors (users or other systems) interact with use cases (functionalities).

               2. Sequence Diagram
                    . A Sequence Diagram in UML is specifically meant to show how multiple objects (or components) interact with each other over time.
                    . Example: Login process → User → Login Page → Server → Database.

               3. Activity Diagram
                    . Similar to a flowchart, shows workflow of activities and decisions.
                    . Example: "Place Order" process (Add item → Make payment → Confirm order).

               4. State Machine Diagram (Statechart)
                    . Shows the states of an object and transitions based on events.
                    . Example: Order object → New → Shipped → Delivered.

               5. Communication Diagram
                    . Focuses on interactions between objects, but emphasizes the links/relationships rather than time.

               6. Interaction Overview Diagram
                    . A high-level view that combines activity diagram + interaction diagrams.

               7. Timing Diagram
                    . Shows changes in state/conditions over time (like a timeline).
                    . Useful in real-time systems (e.g., sensor data, hardware communication).
*/



 /*
       . Before Creating the Squence Diagram : - 

          * we need to Draw the use Case Digram ( flow of the system ).
          * We need to identify the objects that are involved in the use case.
*/



/*
          . Some of the Important Termonology in Sequence Diagram:

             1. alt (Alternative fragment)

                 . Represents a choice / if–else condition.
                 . Only one block executes depending on the condition.
                 . Shown with a dashed rectangle split into two or more sections labeled with conditions.

                 Example:

                       . alt [password correct] → Show Home Page
                       . else [password incorrect] → Show Error Message

             2. opt (Optional fragment)

                 . Represents a single conditional block (like an if without else).
                 . Executes only if the condition is true, otherwise it’s skipped.

                 Example:
                 . opt [user is admin] → Show "Admin Dashboard"

             3. loop (Loop fragment)

                 . Represents a repetition (like a for loop or while loop).
                 . The condition specifies how many times or under what condition the block repeats.
                 
                 Example:
                 . loop [for each item in cart] → Display item details
 */


