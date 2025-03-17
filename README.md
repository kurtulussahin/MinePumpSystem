# Mine Pump System - True Object-Oriented Design

[![EO principles respected here](http://www.elegantobjects.org/badge.svg)](http://www.elegantobjects.org)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/fabriciofx/rockpaperscissors/blob/master/LICENSE.txt)

## Overview
This project is a Java implementation of the *Mine Pump* system, following the *Real Object-Oriented* (OO) approach described by Carlo Pescio. Instead of using a centralized controller, the design distributes responsibilities across collaborating objects, allowing for better modularity, testability, and maintainability.

## Problem Description
The *Mine Pump* system is responsible for managing water levels in a mine while ensuring safety from gas hazards. The system consists of:

- **Water Level Sensors:** Determines when to pump water out of the sump.
- **Gas Sensors:** Monitors carbon monoxide, methane, and airflow.
- **Pump:** Removes water when necessary but cannot operate under unsafe conditions.
- **Siren:** Triggers warnings when gas levels become critical or the pump fails.

The challenge is to implement this system without a monolithic controller, ensuring that each object encapsulates its own behavior.

## Implementation
The project is structured into several key classes:

- **`BasicSumpProbe`** – Determines when pumping is required.
- **`GasSensor`** – Evaluates gas safety levels.
- **`SafeEngine`** – Ensures the pump operates only when conditions are safe.
- **`GasAlarm`** – Triggers alerts when hazardous conditions arise.
- **`SumpPump`** – Manages the actual pumping process.
- **`MinePlant`** – Acts as a factory/builder to configure and instantiate the system.

## Class Diagram
- ![image](https://github.com/user-attachments/assets/10e8719e-232f-4a79-821c-b78ee80949fc)


## Running the Project
To run the project, compile the Java files and execute the main entry point. Since this implementation focuses on a true OO design, it can be easily extended to integrate with actual hardware or simulations.

## References
- Carlo Pescio’s article on *Life without a Controller*: [Original Post](http://www.carlopescio.com/)

## What does *true object-oriented* means?

This application follows these four fundamental principles:

* No `null` ([why?](http://www.yegor256.com/2014/05/13/why-null-is-bad.html))
* No code in constructors ([why?](http://www.yegor256.com/2015/05/07/ctors-must-be-code-free.html))
* No getters and setters ([why?](http://www.yegor256.com/2014/09/16/getters-and-setters-are-evil.html))
* No mutable objects ([why?](http://www.yegor256.com/2014/06/09/objects-should-be-immutable.html))
* No `static` methods, not even `private` ones ([why?](http://www.yegor256.com/2017/02/07/private-method-is-new-class.html))
* No `instanceof`, type casting, or reflection ([why?](http://www.yegor256.com/2015/04/02/class-casting-is-anti-pattern.html))
* No implementation inheritance ([why?](http://www.yegor256.com/2016/09/13/inheritance-is-procedural.html))
* No public methods without `@Override`
* No statements in test methods except `assertThat` ([why?](http://www.yegor256.com/2017/05/17/single-statement-unit-tests.html))

If you want to know more about true object-oriented programming, I recommend
these books:

- [Elegant Objects (Volume 1)](https://www.amazon.com/Elegant-Objects-1-Yegor-Bugayenko/dp/1519166915) by
  [Yegor Bugayenko](http://www.yegor256.com)
- [Elegant Objects (Volume 2)](https://www.amazon.com/Elegant-Objects-2-Yegor-Bugayenko/dp/1534908307) by
  [Yegor Bugayenko](http://www.yegor256.com)
- [Object Thinking](https://www.amazon.com/Object-Thinking-Developer-Reference-David/dp/0735619654)
  by [David West](http://davewest.us)
