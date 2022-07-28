Creational Patterns
===
> Los patrones creacionales proporcionan varios mecanismos de creación de objetos que incrementan la
> flexibilidad y la reutilización del código existente.

- ### Factory Method:

```
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos
en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

|- Interfaces: Product
|- Others: Creator
```

- ### Abstract Factory

```
Abstract Factory es un patrón de diseño creacional que nos permite producir familias de objetos
relacionados sin especificar sus clases concretas.

|- Interfaces: Abstract Factory, ProductA, ProductB, ProductZ
```

- ### Builder

```
Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso.
El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo
código de construcción.

|- Interfaces: Builder
|- Others: Director is like an orchestrator, concrete builders implements getProduct
```

- ### Prototype

```
Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el
código dependa de sus clases.

|- Interfaces: Prototype (Shape) 
```

- ### Singleton

```
Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una
única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
```
____
Structural Patterns
===
> Los patrones estructurales explican cómo ensamblar objetos y clases en estructuras más grandes, a la
> vez que se mantiene la flexibilidad y eficiencia de estas estructuras

- ### Adapter
```
Adapter es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces
incompatibles.

Adapter pensado para app's  existentes, dificil implementar Bridge en una ya existente

|- Interfaces: Adapter
```

- ### Bridge
```
Bridge es un patrón de diseño estructural que te permite dividir una clase grande, o un grupo de
clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e implementación) que
pueden desarrollarse independientemente la una de la otra.

|- Bridge pensado para el diseño, una app desde cero
|- Bridge + AbstractFactory (Implementacion/Interfaces)
|- Bridge + Builder -> Abstraction/ConcreteBaseClass (Director) + Implementation/Interfaces (Builders) 
|- Abstraction - Implementation = ConcreteBaseClass - Interfaces
```

- ### Composite
```
Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol
y trabajar con esas estructuras como si fueran objetos individuales.

Sinergia
    |- Composite 
    |- Builder
    |- Chain of responsabilities
    |- Iterators
    |- Visitor
    |- Flyweights
    |- Decorator
    |- Prototype 
```

- ### Decorator
```
Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos
colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas
funcionalidades.

|- Interfaces: BaseDecorator
```

- ### Facade
```
Facade es un patrón de diseño estructural que proporciona una interfaz simplificada a una
biblioteca, un framework o cualquier otro grupo complejo de clases.

|- Interfaces: Facade, AditionalFacade 
```

- ### Flyweight
```
Flyweight es un patrón de diseño estructural que te permite mantener más objetos dentro de la
cantidad disponible de RAM compartiendo las partes comunes del estado entre varios objetos en lugar
de mantener toda la información en cada objeto.

Este patron sugiere separar el estado extrinseco del objeto

>>  Informacion constante de un objeto se le llama estado intrinseco. objetos pueden leerla y no
    cambiarla, hablamos de inmutabilidad (flyweight)

>>  El resto del estado del objeto alterado desde el exterior por otros objetos se le llama estado
    extrinseco
    
|- Refactorizacion de objetos pesados
|- Interfaces: 
    FlyweightFactory
    Flyweight(intrinseco)
    Component(extrinseco)
    Director/Orquestador (Opcional)
```

- ### Proxy
```
Proxy es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador de
posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo
antes o después de que la solicitud llegue al objeto original.
```
____
Behavioral Patterns
===
> Los patrones de comportamiento tratan con algoritmos y la asignación de responsabilidades entre
> objetos.

- ### Chain of Responsibility
```
Chain of Responsibility es un patrón de diseño de comportamiento que te permite pasar solicitudes a
lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa
o si la pasa al siguiente manejador de la cadena.
```

- ### Command
```
Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto
independiente que contiene toda la información sobre la solicitud. Esta transformación te permite
parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una
solicitud y soportar operaciones que no se pueden realizar.

|- Interfaces:
    Command
    History
```

- ### Iterator
```
Iterator es un patrón de diseño de comportamiento que te permite recorrer elementos de una colección
sin exponer su representación subyacente (lista, pila, árbol, etc.).

|- Interfaces:
    Iterator
    Collection
```

- ### Mediator
```
Mediator es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas
entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a
colaborar únicamente a través de un objeto mediador.

|- Interfaces: Mediator
```

- ### Memento
```
Memento es un patrón de diseño de comportamiento que te permite guardar y restaurar el estado previo
de un objeto sin revelar los detalles de su implementación.
|- Interfaces:
    Originator
    Memento
    Caretaker (Commands)
```

- ### Observer
```
Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción
para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.

|- Suejeto-Notificador-Publicador, estado interesante
|- Suscriptores, objetos que quieren ser notificados
```

- ### State
```
State es un patrón de diseño de comportamiento que permite a un objeto alterar su comportamiento
cuando su estado interno cambia. Parece como si el objeto cambiara su clase.

|- Interfaces: 
    Context, State
```

- ### Strategy
```
Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos,
colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.

|- Interfaces:
    Context, Strategy
```

- ### Template Method
```
Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en
la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su
estructura.

|- Interfaces: Template Method

```


- ### Visitor
```
Visitor es un patrón de diseño de comportamiento que te permite separar algoritmos de los objetos
sobre los que operan
```
___
> Mas detalle en: **[Patrones de Diseño](https://sourcemaking.com/design_patterns)**.