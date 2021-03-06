# **Servant**

[![Build Status](https://travis-ci.org/ucpdh23/Servant.svg?branch=master)](https://travis-ci.org/ucpdh23/Servant)

**My Smart Home System**

     Servant is a home automation platform based on vertx V3 and 100% pure JVM.
     

## **Introduction**
 

The main goal of Servant is to provide a generic software architecture to integrate in just one place any kind of sensor or actuator you want. 

     The key words of Servant are extensibility, integration and smart.

**Extensibility**

Servant provides a extensible framework, implemented in Java and Kotlin, that allows the integration of new elements like sensors and actuators.

Integration of any kind of device into the Internet of Things technology is easy. Thanks to a distributed messaging system and Java, interfacing with any system in order to send or receive data from/to the cloud never will be a hard work. Integration with systems like IFTTT 


**Interaction**
Human or machine interactions with Servant are possible thanks to the pre built-in interfaces:

* Servant provides a restful api and integration to its messaging system through websockets. You can use these interfaces and build your own data consumer or data tracker agents in your preferred programming language.

* Web interface that allows the creation of a web application.

* Includes a Jabber (XMPP) chatbot.

* Google Calendar integration in order to schedule and run operations.


**Smart**
* Based on a events and actions systems. It is easy to create advanced algorithms interacting devices together (sensors and/or actuators) or with external systems.

* Natural language processing in order to a better human/system interaction.

* Scheduler for automatic actions and events triggering.

**Extra functionalities**

* Includes mongodb integration
* Easy json <=> java transformation.


**Implementation Details**

* In order to simplify development, a [Conventions over configurations](https://en.wikipedia.org/wiki/Convention_over_configuration) policy has been adopted. This project implement abstract some concepts, providing a mini-framework to simplify development:
       - Providing almost a 99% object oriented friendly static way to map and use jsons.
       - communication between verticles based on java enums values.
       - State machines based on enums.
       - Mixing java with kotlin code.

* Java and Kotlin project, based on Vertx as the basement for all the system

* Vertx event bus can become a nightmare rapidly. In order to keep all the communications under control, a small layer has been created over Vertx. Actions and Events provide a easy way to interchange information between verticles. Further details, please visit the javadoc documentation of this project.

