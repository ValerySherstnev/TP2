package org.example;

public class Main {

    public static void main(String[] args) {
       Member[] members = {
//               new Human("Gregory", 2, 350),
//               new Robot("Chappy", 7, 900),
               new Cat("Tuzik", 4,100),
               new Cat("Kenny", 3, 100),
               new Cat("Jison", 2, 100),
       };
      Challenge[] challenges = {
              new Wall(WallHeight.LOW),
              new Wall(WallHeight.HIGH),
              new RunningRoad(RoadLenght.LOW),
              new Wall(WallHeight.MEDIUM),
              new RunningRoad(RoadLenght.MEDIUM),
              new RunningRoad(RoadLenght.HIGH),
      };
      for(Member m: members) {
          for (Challenge c: challenges) {
              if (!c.challenge(m)) break;
          }
      }
    }
}