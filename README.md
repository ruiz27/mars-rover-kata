# Mars Rover Kata

Link: https://kata-log.rocks/mars-rover-kata

# Requirements
- You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
- The rover receives a character array of commands.
- Implement commands that move the rover forward/backward (f,b).
- Implement commands that turn the rover left/right (l,r).
- Implement wrapping at edges. But be careful, planets are spheres.
- Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point, aborts the sequence and reports the obstacle.

# Rules

- Hardcore TDD. No Excuses!
- Change roles (driver, navigator) after each TDD cycle.
- No red phases while refactoring.
- Be careful about edge cases and exceptions. We can not afford to lose a mars rover, just because the developers overlooked a null pointer.


# Solution

- Patterns: command and state

## Assumptions

- The planet is plane
- use command and state patterns
  https://refactoring.guru/design-patterns/state
  https://refactoring.guru/design-patterns/command

![img_1.png](img_1.png)

