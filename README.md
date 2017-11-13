# Project de TAA 
Cette partie représente la partie serveur du projet de TAA/GLI qui consiste a créer une application qui signale aux utilisateurs si ils peuvent pratiquer leurs activités en fonction de la météo du secteur géographique.

Cette partie est constituée d'une Web API et d'un accès à une Base de donnée (HSQLDB). Le dévelopement est fait à l'aide de SpringBoot.

L'api est sécurisée à l'aide d'un token (utilisation de JWT).
Seules les API de connection et d'enregistrement d'un utilisateur sont accéssible publiquement pour le moment.

Nous avons rencontré des problèmes d'intégration pour Spring batch et Docker.
La mécanique de Spring batch est en place et servira à automatiser la mise à jour de la météo.
La partie Docker n'est pas implémentée mais nous y sommes presque... 

# Mise en place :
  - Récupération du projet.
  - Lancement d'un serveur de base de donnée HSQLDB.
  - Lancement de l'application.
  - Execution du script sql (script.sql) sur le serveur de base de donnée afin de peupler la base
 
