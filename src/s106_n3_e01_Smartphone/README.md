# Smartphone
**Descripció**: Sprint 1, Tasca 6, Nivell 3, Exercici 1

## 📌 Genèrics amb tipus acotats ('bounded types')
```
En aquest nivell combinaràs genèrics avançats amb interfícies, limitacions de tipus (bounded types) i polimorfisme. Simularàs un exemple real amb dispositius que poden fer trucades i fotos.
Exercici 1 — Genèrics amb tipus acotats ('bounded types')

Crea una interfície anomenada Phone amb el mètode call().

Després, crea tres classes:

    Smartphone, que implementa Phone i afegeix el mètode takePhoto().
    GenericUtils, amb dos mètodes genèrics:
        El primer, anomenat usePhone(), accepta un argument limitat per la interfície Phone (T extends Phone) i crida el mètode call().
        El segon, anomenat useSmartphone(), accepta un argument limitat per la classe Smartphone (T extends Smartphone) i crida tant call() com takePhoto().
    Main, amb el mètode main(), on es crea un objecte de tipus Smartphone i es passa a tots dos mètodes de la classe GenericUtils.

```

## ✨ Funcionalitats (si és aplicable)
HAquí he afegit la classe Landline per demonstrar que el mètode limitat per la interfície Phone,
dins GenericUtils, _no_ pot cridar takePhoto().

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T06`
2. Execució dels tests des del terminal:
   2.1. `javac -d out src/s106_n3_e01_Smartphone/*.java`
   2.2. `java -cp out s106_n3_e01_Smartphone.Main`


## 📸 Demo
```bash
--- Calling usePhone from Smartphone instance ---
Making a phone call from the smartphone...

--- Calling useSmartphone ---
Making a phone call from the smartphone...
Taking a photo with the smartphone camera!
```