# Guía del Taller Colaborativo en Equipos y GitHub — Sesión 14 POO (`CDS-0201`)

**Institución:** Escuela Superior Politécnica Agropecuaria de Manabí Manuel Félix López (ESPAM MFL)  
**Asignatura:** Programación Orientada a Objetos (`CDS-0201`) — Miércoles 25/11/2026 (`19:00 – 22:00`)  
**Docente:** Ing. Luiggi Alexander Jalca Saltos

---

## 1. Organización de Equipos y Tiempos

Los 10 estudiantes activos se dividirán **aleatoriamente** mediante **Breakout Rooms de Microsoft Teams** en 3 equipos:

| Equipo (Room Teams) | Integrantes | Tema Asignado | Plantilla Base |
| :--- | :---: | :--- | :--- |
| **`Grupo1`** | 3 alumnos | **Sistema de Gestión Académica** (`Exportable`, `Persistible`) | `clase14u2_taller_grupo1_base/` |
| **`Grupo2`** | 3 alumnos | **Plataforma de Comercio Electrónico y Pagos** (`MetodoPago`, `Exportable`, `Persistible`) | `clase14u2_taller_grupo2_base/` |
| **`Grupo3`** | 4 alumnos | **Sistema Clínico y Telemedicina** (`Exportable`, `Persistible`, `Notificable`) | `clase14u2_taller_grupo3_base/` |

### Cronograma Estricto del Taller
- **Desarrollo en Salas (60 minutos exactos):** `20:10 – 21:10`
- **Sustentaciones (10 minutos por equipo):**
  - `Grupo1`: `21:10 – 21:20`
  - `Grupo2`: `21:20 – 21:30`
  - `Grupo3`: `21:30 – 21:40`

---

## 2. Estructura Obligatoria del Repositorio en GitHub

```text
taller-poo-clase14-grupoX/
├── README.md          (Nombres de integrantes, Issue asignado y comandos de ejecución)
├── .gitignore         (*.class, out/, .vscode/, .idea/)
└── src/
    ├── interfaces/    (Contratos de comportamiento)
    ├── modelos/       (Clases de dominio con implementación múltiple)
    ├── servicios/     (Servicio desacoplado que solo depende de interfaces)
    └── app/
        └── Main.java  (Ejecución integrada verificada desde main)
```

---

## 3. Flujo de Trabajo Obligatorio en GitHub

### Paso 1 — Configuración Inicial (Minutos 0–10)
1. Un integrante crea el repositorio público en GitHub (ej. `taller-poo-s14-grupo1`), agrega a los demás compañeros como **Collaborators** y sube la plantilla base en la rama `main`.
2. En la pestaña **Issues**, el equipo crea **1 incidencia por cada integrante** (`#1`, `#2`, `#3` y `#4` en Grupo 3) y asigna cada Issue al alumno responsable.

### Paso 2 — Desarrollo en Ramas Individuales (Minutos 10–45)
Cada alumno clona el repositorio y **nunca edita directamente en `main`**:

```bash
git clone https://github.com/<usuario>/taller-poo-s14-grupoX.git
cd taller-poo-s14-grupoX
git checkout -b feat/nombre-apellido
```

Luego completa los bloques `TODO` de su Issue, compila y prueba localmente:

```bash
javac -d out src/interfaces/*.java src/modelos/*.java src/servicios/*.java src/app/Main.java
java -cp out app.Main
```

Confirma sus cambios y sube su rama:

```bash
git add .
git commit -m "feat: completar Issue #1 - implementacion de interfaces"
git push -u origin feat/nombre-apellido
```

### Paso 3 — Pull Request, Revisión Cruzada y Fusión a `main` (Minutos 45–60)
1. En GitHub, cada alumno abre un **Pull Request (PR)** desde `feat/nombre-apellido` hacia `main`.
2. En la descripción del PR escribe `Closes #<numero-de-issue>` y explica brevemente qué completó.
3. Otro compañero del equipo revisa el código, deja un comentario/aprobación y realiza el **Merge Pull Request** hacia `main`.
4. Al finalizar la hora (`21:10`), **todo el proyecto debe estar integrado, compilando y ejecutándose desde la rama `main`**, con todas las incidencias cerradas.

---

## 4. Guion de Sustentación (10 Minutos por Equipo)

1. **Evidencia GitHub (3 min):** Mostrar en pantalla la pestaña **Issues** (cerrados), **Branches** (ramas con el nombre de cada alumno), **Pull Requests** (merged) y el código actualizado en `main`.
2. **Diseño POO e Interfaces (4 min):** Explicar las interfaces creadas, dónde ocurre la implementación múltiple y por qué el servicio (`ServicioAcademico`, `ProcesadorCheckout` o `ServicioClinico`) está desacoplado.
3. **Ejecución en Vivo (3 min):** Compilar y ejecutar `app.Main` desde la rama `main` respondiendo una pregunta rápida del docente.
