# notes

- `digitizeV1` was my first iteration
- what `digitize` improves (_imho_ 😅) is line 34
  - I pull out `(numOfChars - 1) - 1` which is not immediately obvious or intuitive as to what it's doing
  - I replace it with `position--` which
    - tells you the purpose of the value and
    - that after each iteration of the loop, it will move back one position
