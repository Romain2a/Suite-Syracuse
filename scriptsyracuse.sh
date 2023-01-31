javac Main.java
# suppression des 2 fichier suivants :
rm altmax.dat
rm dureevol.dat

# boucle pour parcourir les fichiers créer à partir du fichier Main.java qui eecute la fonction syracuse
for i in `seq $1 $2 `; do
# on peut aussi ecrire for i in $(seq 1 2)
java Main $i

# tail -n2 > on récupère les 2 dernieres ligne 
# | pipe on renvoie le resultat a ce qui se trouve apres le pipe 
# head -n1 > on récupère la premiere ligne
# | pipe on renvoie le resultat a ce qui se trouve apres le pipe 
# cut -d > pour utiliser le délimiteur et -f2 > pour le n° de champ à extraire ici le 2eme
# on envoie les données dans le fichier duréévol.dat il sera créer s'il n'existe pas  
tail -n2 f$i.txt | head -n1 | cut -d = -f2 >> dureevol.dat | 
# tail -n1 > on récupère la dernieres ligne
# on envoie les données dans le fichier altmax.dat il sera créer s'il n'existe pas 
tail -n1 f$i.txt |cut -d = -f2 >> altmax.dat 
done
