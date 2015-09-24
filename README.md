# Cluj.scala meetup - Problem solving by learning Scala

Meetup page: http://www.meetup.com/cluj-scala/events/225092732/
on September 23, 2015 @ ClujHub, Cluj Napoca

This is a project to help us get started at our meetup. It will install Scala & SBT for you, and it contains some examples of solved problems with unit tests.

## Problems

1. [Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/)
2. [Project Euler](https://projecteuler.net/archives)

## Installation

This project is based on [Typesafe Activator](https://www.typesafe.com/activator/docs).

In order to install Scala, the SBT build system, and the project dependencies (Scala Test) you just need to execute the following command:

```bash
./activator
```

After the console is loaded you can

* run the tests by typing `test` inside the console
* run a class by typing `runMain E001`, where `E001` is the name of the object with a main method
* run a class by typing `run`, and then choosing the class you want to run

