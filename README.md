# Taller POO • Grupo 2 (3 Integrantes): Plataforma de Comercio Electrónico y Pagos

**Dominio:** Procesador de pagos y facturas electrónicas desacoplados mediante interfaces (`MetodoPago`, `Exportable` y `Persistible`).

## Flujo Obligatorio en GitHub (60 min)
1. Subir esta plantilla a `main` y crear **3 Issues** (uno por integrante).
2. Cada alumno crea su rama desde `main`: `git checkout -b feat/<nombre-apellido>`.
3. Completar únicamente los `TODO` de su Issue, hacer `push` y abrir un **Pull Request** con `Closes #<num>`.
4. Revisar cruzadamente y fusionar todo en `main` antes de los 10 minutos de sustentación.

## Reparto de Issues
- **Issue #1 (Integrante 1):** Completar `PagoTarjeta.java` implementando `MetodoPago`.
- **Issue #2 (Integrante 2):** Completar `PagoTransferencia.java` (`MetodoPago`) y `FacturaCompra.java` (`Exportable`, `Persistible`).
- **Issue #3 (Integrante 3):** Completar `ProcesadorCheckout.java` (desacoplado por interfaces) y las pruebas en `Main.java`.

## Compilación y Ejecución

```bash
javac -d out src/interfaces/*.java src/modelos/*.java src/servicios/*.java src/app/Main.java
java -cp out app.Main
```
