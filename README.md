# Bowling Game

## Descripción

Bowling Game es un kata de programación cuyo objetivo es implementar un sistema de puntuación para una partida de bolos siguiendo las reglas oficiales del juego.

El programa debe ser capaz de registrar los lanzamientos de una partida y calcular la puntuación final teniendo en cuenta strikes, spares y lanzamientos normales.

## Reglas del juego

Una partida de bolos consta de 10 frames. En cada frame el jugador tiene hasta dos lanzamientos para derribar 10 bolos, excepto en el último frame, donde pueden existir lanzamientos adicionales si se consigue un strike o spare.

### Puntuación

- **Strike**: derribar los 10 bolos en el primer lanzamiento del frame.
  - Puntuación: 10 + suma de los dos siguientes lanzamientos.

- **Spare**: derribar los 10 bolos en dos lanzamientos del frame.
  - Puntuación: 10 + el siguiente lanzamiento.

- **Open frame**: no se derriban los 10 bolos.
  - Puntuación: suma de los bolos derribados.

## Ejemplo

```text
X | 7 / | 9 - | X | - 8 | 8 / | - 6 | X | X | X 8 1
```

Resultado final: puntuación total calculada según reglas anteriores.

## Conceptos trabajados

- Programación en Java
- Diseño de clases
- Lógica de negocio
- Control de flujo
- Manejo de arrays o listas
- Refactorización
- TDD (Test Driven Development)

## Funcionalidades

- Registrar lanzamientos de una partida.
- Detectar strikes.
- Detectar spares.
- Calcular la puntuación por frame.
- Calcular la puntuación total de la partida.
- Gestionar el décimo frame con reglas especiales.

## Reglas de implementación

El sistema debe:

- Procesar los rolls uno a uno.
- Mantener el estado de la partida.
- Calcular la puntuación final correctamente según los bonos.
- Ser fácilmente testeable.

## Casos de ejemplo

### Partida perfecta

```text
X X X X X X X X X XXX
```

Resultado:

```text
300
```

### Partida sin strikes ni spares

```text
9- 9- 9- 9- 9- 9- 9- 9- 9- 9-
```

Resultado:

```text
90
```

### Todos spares

```text
5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5
```

Resultado:

```text
150
```

## Objetivo

El objetivo del kata es practicar:

- Modelado de dominio
- Gestión de estados complejos
- Implementación de reglas acumulativas
- Diseño orientado a test

## Autor

Ejercicio realizado como parte de las prácticas de Cyber Dojo utilizando Java.
