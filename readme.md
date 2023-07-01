#CONTENU DU DOSSIER :Exercice jeux java : polymorphisme, interface et classes abstraites

Une interface se fait quand il y a une pertinence entre deux objets donc avec la flèche "pertinence", c'est qu"il y a une interface à faire, interface donc notion de polymorphisme (qd il y a l héritage et que tu redéfinis une méthode, même méthode mais qu'on va redéfinir, car il y a une logique, une pertinence donc il va y avoir le même rôle mais pas de la même manière dc pas la même fonction)
Quand il y a pertinence, il y a polymorphisme.

#COURS Diagrammes de classes UML
UML est une norme complexe de description de programmes informatiques développée par un consortium d'entreprises et de laboratoires, l'OMG. La norme officielle 1.5 est disponible sur leur site. Une nouvelle norme 2.0 est aussi en développement. Ces spécifications sont particulièrement techniques et indigestes.


##classes
La représentation contient trois compartiments :

le nom contient le nom de la classe et d'autres informations de documentation telles que vous les mettriez dans la javadoc. Les guillemets identifient des stéréotypes comme « abstract ». Le + est un modificateur d'accès :
-+ public
-#protégé
-- privé
les attributs peuvent aussi être représentés à l'aide d'une relation d'aggrégation. Est-il nécessaire de rappeler que tous les attributs à l'exception des constantes doivent être privés ?
les opérations sont les définitions des méthodes : nomDeMéthode (paramètres): typeDeRetour. Les opérations abstraites apparaissent en italiques.

##associations
Une association est une relation entre deux classes. On la décrit à l'aide :

de rôles d'un objet d'une classe dans un objet de l'autre (omis si évidents) ;
de cardinalités, c'est-à-dire de nombres d'objets d'une classe dans un objet de l'autre classe ; on utilise pour cela les notations :
1 habituellement omis si 1 pour 1
n inconnu au moment de la compilation, mais borné
-0..n entre 0 et n
-1..* 1 ou plus
-* 0 ou plus
une communication orientée si nécessaire par < ou >, ou bien avec des flèches sur les traits ;
un type de relation orientée : un des grands types d'association décrits par la suite : aggrégation, héritage, ... si utile ;
optionnellement des contraintes sur l'association entre accolades, exprimées normalement en OCL, mais que vous pouvez exprimer simplement en français.

##héritage
Une flèche triangulaire vide décrit une dérivation. La classe dérivée est la classe de base, mais avec des propriétés additionnelles ou modifiées. Elle spécialise ou étend la superclasse plus générale.

##héritage d'interface

Une flèche d'héritage en tirets indique qu'une classe raffine ou implémente une interface.

L'interface elle-même est indiquée soit en précisant le stéréotype « interface » dans le nom de la classe, soit en utilisant des coins arrondis.

##dépendance
Une classe utilise une autre classe, mais sans que la ressource soit un membre de l'utilisateur. Si la classe de ressource est modifiée, il y a peut-être des méthodes à modifier dans l'utilisateur. La ligne est souvent stéréotypée par « crée » ou « modifie ».

##agrégation
La destruction du tout ne détruit pas les parties.

##composition
La destruction du tout détruit les parties. Rare en Java.




