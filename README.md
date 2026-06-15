# Bowling Game

## Description

Bowling Game is a programming kata whose objective is to implement a scoring system for a bowling game following the official rules of the sport.

The program must be able to record the rolls of a game and calculate the final score, taking into account strikes, spares, and normal rolls.

## Game Rules

A bowling game consists of 10 frames. In each frame, the player has up to two rolls to knock down 10 pins, except in the last frame, where additional rolls may be awarded if a strike or spare is scored.

### Scoring

- **Strike**: knocking down all 10 pins on the first roll of the frame.
  - Score: 10 + the sum of the next two rolls.

- **Spare**: knocking down all 10 pins in two rolls of the frame.
  - Score: 10 + the next roll.

- **Open frame**: not all 10 pins are knocked down.
  - Score: sum of the pins knocked down.

## Example

```text
X | 7 / | 9 - | X | - 8 | 8 / | - 6 | X | X | X 8 1
```

Final result: total score calculated according to the rules above.

## Concepts Covered

- Java programming
- Class design
- Business logic
- Control flow
- Array or list handling
- Refactoring
- TDD (Test Driven Development)

## Features

- Record game rolls.
- Detect strikes.
- Detect spares.
- Calculate frame score.
- Calculate total game score.
- Handle the 10th frame with special rules.

## Implementation Rules

The system must:

- Process rolls one by one.
- Maintain the game state.
- Correctly compute the final score including bonuses.
- Be easily testable.

## Example Cases

### Perfect Game

```text
X X X X X X X X X XXX
```

Result:

```text
300
```

### No strikes or spares

```text
9- 9- 9- 9- 9- 9- 9- 9- 9- 9-
```

Result:

```text
90
```

### All spares

```text
5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5
```

Result:

```text
150
```

## Objective

The goal of this kata is to practice:

- Domain modeling
- Complex state management
- Implementation of cumulative rules
- Test-driven design

## Author

Exercise completed as part of Cyber Dojo practice sessions using Java.
