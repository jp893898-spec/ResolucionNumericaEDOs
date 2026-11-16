# Resolución Numérica de EDOs: Método de Euler y Runge-Kutta 4 (RK4)

Implementación modular en Java de los métodos numéricos de **Euler** y **Runge-Kutta de 4to Orden (RK4)** para resolver Ecuaciones Diferenciales Ordinarias (EDOs) de primer orden con valores iniciales, incluyendo criterio de paro formal ($N$) y análisis experimental del tamaño de paso ($h$).

* **Asignatura:** SCC-1017 Métodos Numéricos
* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
* **Carrera:** Ingeniería en Sistemas Computacionales
* **Docente:** Víctor Hugo Vásquez Herrera
* **Alumno:** Juan Pablo Fernández Sangabriel (227o01746)

---

## Estructura del Proyecto

```text
ResolucionNumericaEDOs/
├── README.md
└── src/
    ├── MetodoEuler.java         # Resuelve y' = x - y, y(0) = 1 hasta x = 0.3
    └── MetodoRungeKutta.java    # Resuelve y' = x + y, y(0) = 1 hasta x = 0.3
```

---

## Instrucciones de Clonación, Compilación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/JP893898-especificacion/ResolucionNumericaEDOs.git](https://github.com/JP893898-especificacion/ResolucionNumericaEDOs.git)
   cd ResolucionNumericaEDOs
   ```

2. **Compilar los archivos fuente:**
   ```bash
   javac -d out src/*.java
   ```

3. **Ejecutar el Método de Euler:**
   ```bash
   java -cp out MetodoEuler
   ```

4. **Ejecutar el Método de Runge-Kutta de 4to Orden (RK4):**
   ```bash
   java -cp out MetodoRungeKutta
   ```