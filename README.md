# Feature Envy and Duplicate Code

## Trainer Guide

* Fork this repository to Trainee's GitLab group
* Remove the trainer's refactor reference branch
* Update the README git clone link
* Delete this section of the README

## Trainee Guide

For this exercise, you are looking to refactor TWO code smells:
* Feature Envy
* Duplicate Code

Research the code smell and fix it in the code.
Present it back to the team by explaining:
* What are the code smells?
* What is the effect? Why is it bad to leave them?
* How did you fix it? Show us the before and after.

## Starting Refactoring Techniques Exercise

##### Clone the project
```shell
git clone <link to repo>
```

##### Checkout and update the master
```shell
git pull -r
```

##### Create a new branch with TWU Number, Team Number and Pair Name:
```shell
git checkout -b refactoring-techniques-<TWU_TERM>-<TEAM>-<PAIR_NAME>
```

##### After finishing the exercise, submit your changes
```shell
git fetch origin master && \
git add . && \
git commit -m "WIP - Refactoring Techniques Session" && \
git push origin refactoring-techniques-<TWU_TERM>-<TEAM>-<PAIR_NAME> --no-verify
```

## About this Application

This is a command line application to operate a simple drivethrough.
User is prompted to add cars to a queue (via coordinates) for the Drivethrough.
One the queue is ready, the Drivethrough can call next to move the cars along the queue.

Example run:

```
==========
Add car to queue (x,y)
>> 4,5
==========
Add more cars? (y/n)
>> y
==========
Add car to queue (x,y)
>> 1,2
==========
Add more cars? (y/n)
>> n
==========
Call Next!
>> Next!

Car at: 5, 6
Car at: 2, 3
==========
Call Next!
>> Next!

Car at: 6, 7
Car at: 3, 4
==========
Call Next!
```