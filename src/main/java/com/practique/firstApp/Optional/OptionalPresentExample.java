package com.practique.firstApp.Optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

      Optional<String> optionalString =   Optional.ofNullable(null);

      //optional.isPresent
      if (optionalString.isPresent()){
            System.out.println(optionalString.get());
        };

      //optional.ifPresent
        optionalString.ifPresent(s-> System.out.print(s));
    }
}
