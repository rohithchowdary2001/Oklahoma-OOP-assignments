package DiceRollerPD;

//In die.java

//public class die {
// private int faces;
// private String description;
//
// public die(int faces, String description) {
//     this.faces = faces;
//     this.description = description;
// }
//
// public int getFaces() {
//     return faces;
// }
//
// public String getDescription() {
//     return description;
// }
//}
//In die.java


//
//
//import java.util.Random;
//
//public class die {
// private int faces;
// private String description;
//
// public die(int faces, String description) {
//     this.faces = faces;
//     this.description = description;
// }
//
// public int roll() {
//     Random random = new Random();
//     return random.nextInt(faces) + 1;
// }
//
// public int getFaces() {
//     return faces;
// }
//
// public String getDescription() {
//     return description;
// }
//}




//In DiceRollerPD.die.java


public class die {
 private int numberOfFaces;
 private String name;

 public die(int numberOfFaces, String name) {
     this.numberOfFaces = numberOfFaces;
     this.name = name;
 }

 public int roll() {
     return (int) (Math.random() * numberOfFaces) + 1;
 }

 public String getName() {
     return name;
 }
}


