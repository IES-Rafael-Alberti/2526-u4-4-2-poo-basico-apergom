# Título de la Actividad: Programación Orientada a Objetos (POO)

## Identificación de la Actividad
- **ID de la Actividad:** 4.1 POO
- **Módulo:** Programación
- **Unidad de Trabajo:** Unidad 4 - Introducción a la Programación Orientada a Objetos
- **Fecha de Creación:** 18-01
- **Fecha de Entrega:** 19-01

## Alumno(s)
- **Nombre y Apellidos:** Antonio Manuel Pérez Gómez
- **Correo electrónico:** apergom459w@g.educaand.es
- **Iniciales del Alumno/Grupo:** AMPG

---

## Descripción de la Actividad
Esta actividad tiene como objetivo desarrollar una serie de ejercicios prácticos para introducir los conceptos básicos de la programación orientada a objetos. A través de estas actividades, los estudiantes aprenderán a crear clases, aplicar encapsulación, usar herencia y polimorfismo, y gestionar excepciones en programas sencillos.

### Objetivos:
1. Comprender los principios fundamentales de la POO.
2. Aplicar diseño de clases y métodos en un entorno realista.
3. Implementar y probar módulos que reflejen problemas cotidianos.

### Lista de Ejercicios
Los ejercicios desarrollados incluyen:
1. **Clase Cuenta Bancaria:** Gestión de saldos con validaciones.
2. **Clase Vehículo:** Registro de kilómetros y detalles del vehículo.
3. **Clase Libro:** Almacenamiento y visualización de datos de libros y control de excepciones.
4. **Clase Estudiante:** Validación de notas y uso del modificador `toString`.
5. **Clase Producto:** Gestión de inventarios con validaciones para atributos.

---

## Instrucciones de Compilación y Ejecución

### Requisitos Previos
- **Lenguaje:** Kotlin (versión [versión recomendada])
- **Entorno de desarrollo:** Intellij IDEA u otro IDE compatible.
- **Dependencias:** Ninguna adicional.

### Compilación del Proyecto
Para compilar el proyecto, ejecuta el siguiente comando en el terminal:
```bash
kotlinc src -include-runtime -d programa.jar
```

### Ejecución del Programa
Ejecuta el archivo generado con el comando:
```bash
java -jar programa.jar
```

### Ejecución de Pruebas
Si hay pruebas incluidas, usa el siguiente comando como referencia:
```bash
./gradlew test
```

---

## Desarrollo de la Actividad

### Descripción del Desarrollo
Cada ejercicio se ha implementado como una clase independiente con métodos y atributos específicos. Se han aplicado principios de encapsulación, validación de datos y gestión de excepciones según los requerimientos de los ejercicios mencionados.

- **Enlace a la documentación de ejercicios:**
  - [Ejercicio 1 - Clase Cuenta Bancaria](./EjerciciosSencillosPOO.md#L5-L24)
  - [Ejercicio 2 - Clase Vehículo](./EjerciciosSencillosPOO.md#L54-L69)
  - [Ejercicio 3 - Clase Libro](./EjerciciosSencillosPOO.md#L93-L112)
  - [Ejercicio 4 - Clase Estudiante](./EjerciciosSencillosPOO.md#L167-L179)
  - [Ejercicio 5 - Clase Producto](./EjerciciosSencillosPOO.md#L187-L204)

---

## Ejemplos de Ejecución

### Entrada 1
**Ejemplo:** Creación de un libro.
```text
Título del libro: "Programar es divertido"
Autor: "Juan Pérez"
Número de páginas: 300
```

### Salida Esperada 1
**Resultado:**
```text
Libro: Programar es divertido por Juan Pérez, Páginas: 300, Leído: No
```

---

## Referencias y Fuentes
- [Documentación oficial de Kotlin](https://kotlinlang.org/docs/home.html)
- Recursos suplementarios utilizados durante la actividad.

## Conclusiones
El desarrollo de los ejercicios ha permitido afianzar conocimientos sobre la programación orientada a objetos, poniendo en práctica conceptos como encapsulación y validación. Estas destrezas tienen aplicaciones directas al resolver problemas de la vida real dentro del ámbito tecnológico.
