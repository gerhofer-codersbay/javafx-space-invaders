# Space Invaders TODO 

## Add invaders 

Invaders move together as one so we need to create one Position for our invaders `Position invaderPosition = new Position(0, 0);`. 
We will show 3 lines á 10 invaders in order to be able to remove some of them later we will store their relative position to the invader position in an array: 
```java
// relative invaders positions to the invaderPosition
List<Position> invaders = List.of(
        new Position(0,0), new Position(0,1), new Position(0,2) ...
        new Position(1,0), new Position(1,2), new Position(1,2) ...
        new Position(2,0), ... new Position(2,8), new Position(2,9)
        )
```

