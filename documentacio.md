
## Generar la documentació HTML

1. Obre una terminal i situa’t a la carpeta on tens el fitxer `Calculator.java`.

2. Executa el següent comandament per generar la documentació dins el directori `docs/`:
   ```bash
   javadoc -d ../../../docs com/treball_entorns/Calculator.java
   ```

## Com accedir a la documentació generada

Un cop executat el comandament per generar la documentació (`javadoc`), es crea una carpeta `docs/` dins del projecte amb diversos fitxers HTML.

### 📁 Passos per obrir la documentació:

1. Obre l’explorador de fitxers del teu sistema operatiu.
2. Navega fins a la ruta del projecte:  
   `treballEntorns/docs/`
3. Obre el fitxer `index.html` amb un navegador.
4. Dins d’aquest índex, podràs accedir a:
   - **Totes les classes documentades** (`All Classes`)
   - La documentació específica de la classe `Calculator`, a través del paquet `com.treball_entorns`.

### 🔗 Accés directe a la classe

També pots obrir directament aquest fitxer per veure la documentació de la classe `Calculator`:
   ```bash
   docs/com/treball_entorns/Calculator.html
   ```

### ℹ️ Què inclou la documentació de la classe `Calculator`?

La documentació HTML generada mostra:

- Una descripció general de la classe
- Informació sobre l’autor
- Detalls dels mètodes següents:
  - `calculate(...)`: operacions bàsiques com suma, resta, multiplicació i divisió
  - `esParell(int num)`: comprova si un nombre és parell
  - `potencia(int base, int exponent)`: calcula una potència amb exponents positius
