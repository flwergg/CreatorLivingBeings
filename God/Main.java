package God;

import java.util.Scanner;

import EarthBeing.Elephant;
import EarthBeing.Human;
import EarthBeing.Spider;
import SkyBeing.Angel;
import SkyBeing.Archangel;
import SkyBeing.Dragon;

class Main extends LivingBeingCreator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // creamos una objeto de cada clase para que se ejecute el metodo de cada clase
        Object Asrael = LivingBeingCreator.createBeing("sky", "Asrael", "Angel");
        Object Miguel = LivingBeingCreator.createBeing("sky", "Miguel", "Archangel");
        Object Drogon = LivingBeingCreator.createBeing("sky", "Drogon", "Dragon");
        Object Dumbo = LivingBeingCreator.createBeing("earth", "Dumbo", "Elephant");
        Object Morgan_freeman = LivingBeingCreator.createBeing("earth", "Morgan freeman", "Human");
        Object Charlotte = LivingBeingCreator.createBeing("earth", "Charlotte", "Spider");

        System.out.println(
                "hello Michi,\n what type of being would you like to see?\n 1. Angel\n 2. Archangel\n 3. Dragon\n 4. Elephant\n 5. Human\n 6. Spider\n 7. Exit\n");
        int type = Sc.nextInt();
        while (true) {
            switch (type) {
                case 1:
                    System.out.println("there are the methods of the Angel");
                    showCreatedBeingsMethods(Asrael);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    int method = Sc.nextInt();
                    System.out.println("----------------------");
                    switch (method) {
                        case 1:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).fly();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 2:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).planear();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 3:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).changeDimension();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 4:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).walk();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 5:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).eat();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 6:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).sleep();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 7:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).born();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 8:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).grow();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 9:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).reproduce();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 10:
                            if (Asrael instanceof Angel) {
                                String message = ((Angel) Asrael).die();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 11:
                            if (Asrael instanceof Angel) {
                                System.out.println(Asrael);
                            }
                            System.out.println("----------------------");
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("there are the methods of the Archangel");
                    showCreatedBeingsMethods(Miguel);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    method = Sc.nextInt();
                    switch (method) {
                        case 1:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).fly();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 2:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).planear();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 3:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).changeDimension();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 4:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).walk();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 5:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).eat();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 6:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).sleep();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 7:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).born();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 8:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).grow();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 9:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).reproduce();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 10:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).die();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 11:
                            if (Miguel instanceof Archangel) {
                                System.out.println(Miguel);
                            }
                            System.out.println("----------------------");
                            break;
                        case 12:
                            if (Miguel instanceof Archangel) {
                                String message = ((Archangel) Miguel).sing();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("there are the methods of the Dragon");
                    showCreatedBeingsMethods(Drogon);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    method = Sc.nextInt();
                    switch (method) {
                        case 1:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).fly();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 2:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).planear();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 3:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).changeDimension();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 4:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).walk();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 5:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).eat();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 6:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).sleep();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 7:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).born();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        case 8:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).grow();
                                System.out.println(message);
                            }
                            System.out.println("----------------------");
                            break;
                        default:
                            break;
                        case 9:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).reproduce();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 10:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).die();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 11:
                            if (Drogon instanceof Dragon) {
                                System.out.println(Drogon);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 12:
                            if (Drogon instanceof Dragon) {
                                String message = ((Dragon) Drogon).Dracaris();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 13:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("there are the methods of the Elephant");
                    showCreatedBeingsMethods(Dumbo);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    method = Sc.nextInt();
                    switch (method) {
                        case 1:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).walk();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 2:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).eat();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 3:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).sleep();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 4:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).born();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 5:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).grow();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 6:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).reproduce();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 7:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).die();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 8:
                            if (Dumbo instanceof Elephant) {
                                System.out.println(Dumbo);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 9:
                            if (Dumbo instanceof Elephant) {
                                String message = ((Elephant) Dumbo).balancear();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("there are the methods of the Human");
                    showCreatedBeingsMethods(Morgan_freeman);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    method = Sc.nextInt();
                    switch (method) {
                        case 1:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).fly();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 2:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).planear();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 3:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).changeDimension();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 4:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).walk();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 5:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).eat();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 6:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).sleep();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 7:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).born();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 8:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).grow();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 9:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).reproduce();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 10:
                            if (Morgan_freeman instanceof Human) {
                                String message = ((Human) Morgan_freeman).die();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 11:
                            if (Morgan_freeman instanceof Human) {
                                System.out.println(Morgan_freeman);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.out.println("there are the methods of the Spider");
                    showCreatedBeingsMethods(Charlotte);
                    System.out.println("13.exit");
                    System.out.println("please select a method");
                    method = Sc.nextInt();
                    switch (method) {
                        case 1:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).walk();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 2:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).eat();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 3:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).sleep();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 4:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).born();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 5:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).grow();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 6:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).reproduce();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 7:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).die();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 8:
                            if (Charlotte instanceof Spider) {
                                System.out.println(Charlotte);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 9:
                            if (Charlotte instanceof Spider) {
                                String message = ((Spider) Charlotte).sting();
                                System.out.println(message);
                                System.out.println("---------------------------------");
                            }
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
}