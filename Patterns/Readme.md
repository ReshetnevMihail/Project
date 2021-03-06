# Паттерны проектирования

Паттерн проектирования — это часто встречающееся решение определённой проблемы при проектировании архитектуры программ. В отличие от готовых функций или библиотек, паттерн нельзя просто взять и скопировать в программу. Паттерн представляет собой не какой-то конкретный код, а общую концепцию решения той или иной проблемы, которую нужно будет ещё подстроить под нужды вашей программы.

## Одиночка (Singleton)

Одиночка — это порождающий паттерн проектирования, который гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа. В данном проекте этим классом является MainActivity. Он являеться связующей точкой всех классов. 

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Screenshots/screenshot1.png)

## Декоратор (Decorator)

Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки». Класс MyRandom является оберткой для класса Main.

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Screenshots/screenshot2.png)
![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Screenshots/screenshot3.png)

## Команда (Command)

Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь, логировать их, а также поддерживать отмену операций. Обработчик события класс Main позволяет управлять обьектом класса MyRandom. Он позволяет запускать или отменять работу методов класса MyRandom.

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Screenshots/screenshot4.png)

# Структура паттернов

## Одиночка

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Diagrams/Diagram1.png)

## Декоратор

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Diagrams/Diagram2.png)

## Команда

![](https://github.com/ReshetnevMihail/Project/blob/master/Patterns/Diagrams/Diagram3.png)
