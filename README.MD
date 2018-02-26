# Inleiding

In deze oefening gaan we een klas en een les modelleren in Java. De klas bestaat uit een aantal studenten en een 
docent. De docent geeft een college. Iedere keer als hij wat zegt, noteren de studenten dit in hun logboek.

De docent heeft geen notie van zijn studenten. Hij geeft college en op ieder moment kan een nieuwe student de les 
binnenkomen en mee gaan luisteren.

Dit probleem vraagt om het toepassen van het Observer Pattern. In deze opdracht gaan we dit uitwerken.

## Stap 1 Snappen van de opzet
Bekijk de code en voer het uit. Wat opvalt is dat de `Teacher` zijn wijsheden doceert, zonder dat zijn studenten 
zich hier bewust van zijn.

## Stap 2 Zorg ervoor dat de studenten de docent gaan observeren
Zorg ervoor dat je de Java Interface `Observer` en de Java Klasse `Observable` op de juiste manier toepast. Iedere 
keer als de docent nu iets zegt, moeten de Studenten dit te horen krijgen en vervolgens de methode `makeNote()` 
aanroepen.

## Stap 3 Studenten verantwoordelijk maken voor het registeren 
Wat opvalt in de JAVA API is dat de Observable een lijst van Observers heeft. Nieuwe Studenten worden nu vanuit de 
`CourseApp` geregistreerd bij de `Teacher`. Pas dit zodanig aan, dat een `Student` een `setTeacher(teacher)` 
methode heeft. Wanneer deze wordt aangeroepen, registreerd de student zichzelf bij de Teacher.

## Stap 4 Studenten verlaten de les
Studenten zullen ook soms de klas tussentijds verlaten. Dit gaan we nu inbouwen.

* Zorg ervoor dat zo wanneer `setTeacher(teacher)` wordt aangeroep er een teller wordt geinstantieerd met een 
willekeurig getal tussen de 0 en 20. Hoe je een willekeurig getal tussen de 0 en 20 moet krijgen, kun je terug vinden 
in de klasse `Teachings.java`.
* Zorg ervoor dat studenten bijhouden hoeveel notities ze gemaakt hebben (verlaag de teller met 1 wanneer `makeNotes()` wordt aangeroepen).
* Zorg ervoor dat als de teller op 0 staat, de Student zichzelf deregistreerd als `Observable`.
* Zorg ervoor dat de docent stop met doceren wanneer er geen studenten meer naar hem luisteren. Merk hiervoor op dat een `Observable` de methode `countObservers()` heeft.

## Stap 5
De huidige implementatie kent nog behoorlijk wat problemen. Ten eerste kunnen nu alleen maar `Students` de les bijwonen. Dit zouden we graag willen veralgemeniseren. Voor de `Teacher` is het namelijk alleen relevant dat zijn/haar toehoorders `Observers` zijn. Daarbij heeft en `Student` nu kennis van de `Teacher`. We willen juist dat dit niet zo is. De `Observable` notificeert zijn `Observers`, maar de `Observers` hebben geen kennis van de `Observable`.
* Check de Branch `4-start-improve-solid` uit. Dit doe je middels het gitcommand
```
    git checkout 4-start-improve-solid
```
* Instantieer in de main methode van de `CourseApp` een nieuwe `Course` en voeg hieraan enkele `Students`
en een `Teacher` toe.
* Pas de `Student` zo aan, dat hij nu in de constructor de `Course` meekrijgt. En dat hij de `Course` verlaat, wanneer hij zijn aantal notities heeft gemaakt. Kijk of de applicatie het weer doet.
* Implementeer de methode `startCourse()`, zodanig dat eerst de `Observers` aan de `Observable` worden toegevoegd en daarna de `Teacher` begint met doceren.

Wat nu nog niet netjes is is de methode `addStudent()`. Deze verwacht een Student, terwijl het enige relevante is, dat het een `Observer` is. 

* Generaliseer de `addStudent()` methode. Refactor hem zodanig dat hij de volgende signature heeft

```
 addAttendee(Obsever attendee)
```

* Pas de `Teacher` zodanig aan dat ook hij een les kan bijwonen. 
* Voeg vanuit de `CourseApp` ook een `Teacher` te als bijwoner (attendee) van de `Course`.

Wanneer `startCourse()` wordt aangeroepen is het nog denkbaar dat er geen  `Teacher` is of dat niemand de 
 `Course` bijwoont.  Zorg ervoor dat deze situaties op een nette manier worden afgehandeld.



