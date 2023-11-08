package org.example;



public interface superJump {
    default boolean superJump(String name,int height) {
        Cat.superJumpCount--;
        System.out.println("Кот " + name + " переперыгнул с суперпрыжком " + height + " м");
        return true;

    }
}
