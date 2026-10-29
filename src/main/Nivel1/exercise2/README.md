# Reflexió i Comprovació: Atributs `static` i `final` en Java

Aquest document analitza el comportament dels modificadors `static` i `final` en Java prenent com a referència una classe `Car` amb els atributs:
* `brand` (`static final`)
* `model` (`static`)
* `power` (`final`)

---

## 🔹 Quin d’aquests atributs pot ser inicialitzat des del constructor?

* **Atribut:** `power` (`final`)

* **Explicació:** Els atributs `final` d'instància (no estàtics) es poden inicialitzar directament en la seva declaració o bé **dins del constructor** de la classe. Cal que quedin inicialitzats abans que la creació de l'objecte finalitzi.

* *Nota:* L'atribut `brand` (`static final`) s'ha d'inicialitzar en la mateixa declaració o en un bloc d'inicialització estàtic (`static { ... }`), però **mai** des d'un constructor, ja que el constructor s'executa per a cada instància i un valor `static final` només es pot assignar una vegada a nivell de classe.

---

## 🔹 Quin no es pot modificar mai?

* **Atributs:** `brand` (`static final`) i `power` (`final`)

* **Explicació:** La paraula clau `final` impedeix que el valor d'una variable sigui reassignat o modificat posteriorment un cop ha estat inicialitzat:

  * `brand` es defineix una sola vegada a nivell de classe i **mai** podrà canviar el seu valor durant l'execució del programa.

  * `power` s'assigna un cop (generalment al constructor per a cada objecte) i **tampoc no es pot modificar mai més** per a aquella instància en concret.

---

## 🔹 Quin afecta totes les instàncies de la classe?

* **Atributs:** `brand` (`static final`) i `model` (`static`)

* **Explicació:** La paraula clau `static` indica que l'atribut pertany a la **classe** i no a una instància concreta (objecte).

  * Tots els objectes creats a partir de la classe `Car` comparteixen el mateix espai de memòria per als atributs estàtics.

  * Si el valor de `model` es modifica en qualsevol moment, **el canvi afectarà immediatament totes les instàncies** de la classe.