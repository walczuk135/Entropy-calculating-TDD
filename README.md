# Entropy Calculating
> Calculation of entropy of sentences, words. The project was developed based on TDD methodology.


## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
Shannon entropy was introduced by Claude E. Shannon in his 1948 paper "A Mathematical Theory of Communication". Somewhat related to the physical and chemical concept entropy, the Shannon entropy measures the uncertainty associated with a random variable, i.e. the expected value of the information in the message (in classical informatics it is measured in bits). This is a key concept in information theory and has consequences for things like compression, cryptography and privacy, and more.

The Shannon entropy H of input sequence X is calculated as -1 times the sum of the frequency of the symbol i times the log base 2 of the frequency:
```

          __ N                  count(i)            /count(i)\ 
H(X)  =  \            - 1 times -------- times log  |--------| 
         /__ i  =  1                N             2 \    N   / 

```
This design calculates entropy (Shannon algorithm, other entropy algorithms in the future) containing text messages based on symbol frequency.

The project was created about the TDD methodology.


## Technologies
* Java - version 8+
* Swing
* Maven

## Status
Project is: _finished

## Inspiration
Willingness to learn TDD

## Contact
Created by [@walczuk135](walczuk135@gmail.com) - feel free to contact me!
