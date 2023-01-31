# Suite Syracuse et Programmation recursive en Java

La conjecture de Syracuse, encore appelée conjecture de Collatz, est l'hypothèse mathématique selon laquelle 
la suite de Syracuse de n'importe quel entier strictement positif atteint 1.
Une suite de Syracuse est une suite d'entiers naturels définie de la manière suivante : 
on part d'un nombre entier strictement positif ; s’il est pair, on le divise par 2 ; s’il est impair, on le multiplie par 3 et l'on ajoute 1. 
En répétant l’opération, on obtient une suite d'entiers strictement positifs dont chacun ne dépend que de son prédécesseur.

Par exemple, à partir de 14, on construit la suite des nombres : 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 4, 2… 
C'est la suite de Syracuse du nombre 14.

Après que le nombre 1 a été atteint, la suite des valeurs 1, 4, 2, 1, 4, 2… se répète indéfiniment en un cycle de longueur 3, appelé cycle trivial.
