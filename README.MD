# Inleiding

In deze oefening gaan we een klas en een les modelleren in Java. De klas bestaat uit een aantal studenten en een docent. De docent geeft een college. Iedere keer als hij wat zegt, noteren de studenten dit in hun logboek.

De docent heeft geen notie van zijn studenten. Hij geeft college en op ieder moment kan een nieuwe student de les binnenkomen en mee gaan luisteren.

Dit probleem vraagt om het toepassen van het Observer Pattern. In deze opdracht gaan we dit uitwerken.

## Stap 1 Project aanmaken

Maak met Maven een nieuw project aan. Gebruik een simpel Archetype, zoals bijvoorbeeld: 

```
maven-archetype-quickstart
```

## Stap 2 Modelleren

Het Domein is al gemodelleerd. We komen uit om twee Java Klassen, een `Teacher` en een `Student`.