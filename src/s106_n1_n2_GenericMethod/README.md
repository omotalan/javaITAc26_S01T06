# GenericMethod
**Descripció**: Sprint 1, Tasca 6, Nivells 1 i 2

## 📌 Nivells 1 al 2, tots els exercicis
```
En aquest nivell t’introduiràs als conceptes fonamentals dels genèrics. Aprendràs a crear classes i mètodes que treballin amb qualsevol tipus de dades, i observaràs com Java gestiona la tipificació flexible però segura.
Exercici 1 — Classe sense genèrics

Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus, juntament amb:

    un constructor que els inicialitzi,
    i mètodes getElement1(), getElement2(), getElement3() per accedir-hi.

Comprova que pots passar els arguments en qualsevol ordre al constructor.

Aquest exercici serveix per comparar després el comportament amb una versió genèrica.
Exercici 2 — Mètode genèric amb paràmetres diversos

Crea una classe Person amb els atributs name, surname i age. Després, crea una classe anomenada GenericMethods amb un mètode genèric anomenat printElements() que accepti tres arguments de tipus genèric i els imprimeixi per pantalla.

Al main() de la classe principal, crida aquest mètode amb diferents tipus de paràmetres (per exemple: un objecte Person, un String i un valor numèric primitiu).

Amb aquest exercici verificaràs que els mètodes genèrics poden acceptar qualsevol combinació de tipus i en qualsevol ordre.

Nivell 2

Aquest nivell se centra a refinar l’ús de genèrics, aprenent a combinar paràmetres genèrics amb tipus concrets, i a utilitzar varargs de manera segura amb genèrics.
Exercici 1 — Genèric parcial

Modifica l’exercici anterior per fer que un dels arguments del mètode genèric no sigui genèric, sinó d’un tipus fix, com ara String. Els altres dos arguments han de continuar sent genèrics.
Exercici 2 — Varargs genèrics

Adapta l’exercici anterior per fer que el mètode accepti un nombre variable d’arguments genèrics (varargs). El nom del mètode pot ser printAll().

Important

Recorda que l’ús de varargs amb genèrics pot generar advertències en compilació (unchecked warnings). Informa’t sobre com afecta això a la seguretat de tipus.


```

## ✨ Funcionalitats (si és aplicable)
He demonstrat ambdos exercicis dins el mateix Main, per simplicitat, però ells son
degudament separats.

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T06`
2. Execució dels tests des del terminal:
   2.1. `javac -d out src/s106_n1_n2_GenericMethod/*.java`
   2.2. `java -cp out s106_n1_n2_GenericMethod.Main`


## 📸 Demo
```bash
 Exercici 1:
Elemento 1, Elemento 2, Elemento 3
Elemento 2, Elemento 1, Elemento 3

 Exercici 2:
Element 1: Person{name='Tsubasa', surname='Ozora', age=12}
Element 2: Elemento 2
Element 3: 30
----------------------------------------
Element 1: Elemento 2
Element 2: Person{name='Tsubasa', surname='Ozora', age=12}
Element 3: 30
----------------------------------------
Element1 : 30
Element2 : Person{name='Tsubasa', surname='Ozora', age=12}
Element3 : Elemento 2
----------------------------------------
```