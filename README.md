## Exercici 1 – Instruments musicals
#### Objectiu
En aquest exercici treballarem els conceptes d’**herència i polimorfisme**, dues peces clau de la programació orientada a objectes. També aprendrem com funciona la càrrega de classes a Java i descobrirem els blocs estàtics, que són útils per entendre com s’inicialitzen les classes en temps d’execució.

L’objectiu és entendre com podem compartir característiques comunes entre diferents objectes i, al mateix temps, fer que cadascun es comporti de manera específica.


#### Enunciat
Estem dissenyant un programa per gestionar instruments musicals d’un grup de música. En aquest grup, hi ha tres tipus d’instruments:

* Instruments de **vent**

* Instruments de **corda**

* Instruments de **percussió**

Tots aquests instruments tenen dues característiques en comú: un nom i un preu. A més, tots poden tocar-se, però ho fan de maneres diferents.

#### Passos a seguir

*Fes un commit explicatiu per a cada punt, seguint l’estàndard de Conventional Commits.*

1. Crea una classe abstracta anomenada Instrument, amb:
Dos atributs: name i price
Un mètode abstracte anomenat play()

2. Crea tres subclasses que heretin de Instrument:
    - WindInstrument
    - StringInstrument
    - PercussionInstrument

3. A cada subclasse, implementa el mètode play() perquè mostri per consola un missatge específic:
    - "Està sonant un instrument de vent" per a WindInstrument

    - "Està sonant un instrument de corda" per a StringInstrument

    - "Està sonant un instrument de percussió" per a PercussionInstrument

4. Afegeix una classe Main amb un mètode main() on:
    - Es creï un objecte de cada tipus d’instrument

    - Es cridi el mètode play() de cadascun per veure el comportament polimòrfic

#### Càrrega de classes i blocs estàtics
El procés de càrrega d’una classe en Java només es produeix una sola vegada durant l’execució del programa.

Demostra que aquesta càrrega es pot provocar de dues maneres:

- Quan es crea la **primera instància** de la classe.

- Quan s’accedeix a un membre estàtic de la classe (com **un mètode o atribut static**).

Per comprovar-ho, afegeix un **bloc estàtic** dins la classe i observa quan s’executa.

A més, **investiga i documenta per tu mateix**:

- Què és un **bloc d’inicialització** (sense static)?
- Quan s’executa?
- Quina diferència hi ha entre aquest i un bloc static?


## Exercici 2 – Classe Cotxe
#### Objectiu
Amb aquest exercici aprendràs la diferència entre els modificadors *static i final* aplicats a atributs i mètodes. Veuràs com es comporten aquestes paraules clau i en quins casos un atribut pot o no pot ser inicialitzat al constructor. També entendràs la diferència entre mètodes estàtics i no estàtics, i com s’invoquen correctament des del main().

#### Enunciat
Has de crear una classe que representi un cotxe amb algunes particularitats que et permetran entendre com funciona la memòria i la inicialització en Java.

#### Passos a seguir
Fes un commit explicatiu per a cada punt, seguint l’estàndard de Conventional Commits.

1. Crea una classe anomenada Car amb els següents atributs:
    - **brand**: ha de ser static final
    - **model**: ha de ser static
    - **power**: ha de ser final
2. Reflexiona, comprova i documenta al teu **Readme**:
    - Quin d’aquests atributs pot ser inicialitzat des del constructor?
    - Quin no es pot modificar mai?
    - Quin afecta **totes les instàncies** de la classe?
3. Afegeix dos mètodes:
    - Un mètode **estàtic** anomenat `brake()` que mostri per consola:
`"El vehicle està frenant"`
    - Un mètode **no estàtic** anomenat `accelerate()` que mostri per consola:
`"El vehicle està accelerant"`
4. Crea una classe Main amb el mètode `main()` i:
    - Crida el mètode `brake()` **sense crear cap objecte**.
    - Crea una instància de Car i crida el mètode `accelerate()` des d’aquesta instància.
Et pot ajudar a entendre millor el comportament de `static` fer servir `System.out.println()` per imprimir valors i comprovar quan canvien i quan no. Pots provar a crear diversos cotxes i veure si els canvis en el model afecten a tots, o només a un. Documenta les teves descobertes.
