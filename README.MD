# Inleiding

In deze oefening gaan we een klas en een les modelleren in Java. De klas bestaat uit een aantal studenten en een docent. De docent geeft een college. Iedere keer als hij wat zegt, noteren de studenten dit in hun logboek.

De docent heeft geen notie van zijn studenten. Hij geeft college en op ieder moment kan een nieuwe student de les binnenkomen en mee gaan luisteren.

Dit probleem vraagt om het toepassen van het Observer Pattern. In deze opdracht gaan we dit uitwerken.

## Stap 1 Snappen van de opzet
Bekijk de code en voer het uit. Wat opvalt is dat de Teacher zijn wijsheden doceert, zonder dat zijn studenten zich hier bewust van zijn.

## Stap 2 Zorg ervoor dat de studenten de docent gaan observeren
Zorg ervoor dat je de Java Interface Observer en de Java Klasse Observable op de juiste manier toepast. Iedere keer als de docent nu iets zegt, moeten de Studenten dit te horen krijgen en vervolgens de methode makeNote() aanroepen.

## Stap 3 Volgorde van Observers aanpassen
Wat nu opvalt is dat de Observers steeds in dezelfde volgorde worden aangeroepen. Pas dit aan. Zorg ervoor dat deze volgorde iedere keer anders is (Random dus).