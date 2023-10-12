# AssignmentThree


Personal Details:

Enrolment/Student No: 7219530 	 		
Name: Syed Muhammad Haider Ali Sherazi

Environment:

I have created a project on Eclipse Version 4.29.0 and used Java version 17.0.8.1 on Macbook pro.

Github Link:

https://github.com/haidersherazi/AssignmentThree.git

Task Details:

Car Class: Initially I have created a class Car with the attributes of id, Make, Model, Year of manufacture, Color, Price, Registration number. In this class, I have created default and parameterized constructors. Moreover, this class contains all the getter setters of the attributes because I made them private.

Engine Class and subclasses: There is another class created with the name of Engine and added the attributes, constructor and getter setters in it. After that I have created three subclasses of engine with the names of Combustion Engine, Electric Engine and Hybrid Engine with the specific properties in each class along with getter setters and constructor.

Manufacture Class: A class named Manufacture has been created with the attributes of name and country. Also created its getter setters.

Vehicle Class and subclasses: Then I have created a class named Vehicle that contains the objects of Manufacture, Engine and Car along with the constructor and the getter setters. Vehicle class has one abstract function named “showCharacteristics” that makes the class abstract as well. After that I have created three subclasses of vehicles with the names of ICEV, BEV and HybridV respectively and provided the definition of the showCharacteristics function in all the extended subclasses.


Vehicle Manager: Main caller function is written in the Vehicle Manager class that initializes the objects of Car, Engine and Manufacture. It also contains the object array of Vehicle that is obviously an abstract class and can not be instantiated directly. Hence, Vehicle objects are initiated by their subclasses and I have also used a for loop to print the data shown in the showCharacteristics function. 
