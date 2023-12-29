# jUnit: Small Example Project
This was a project for the _Verification and Validation of Software_ (_Verificación y Validación de Software_) lecture at the _Universidad Nacional del Sur_ in Argentina.

## Goal
The goal was to create a simple practical Unit Testing example.

## What you will find here
The module I developed for testing was a simple String Toolbox with operations on Strings. For instance, the method:

- repeat(word, times) -> String : returns a string containing the given word, repeated the given times.


- countOccurences(c, word) -> LongInt : returns the number of occurences of the character c in the given word.


- startsWithVowel(word) -> Bool : returns True if the word starts with a vowel (a,e,i,o,u). Otherwise it returns False.

## Unit Tests
These tests are pretty simple and were implemented using jUnit and can be found in the [Tests directory](/src/test/java).