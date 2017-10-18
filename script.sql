drop table activite cascade;
drop table user cascade;
drop table faire cascade;
drop table spot cascade;
drop table condition cascade;
drop table niveau cascade;

insert into user (nom,prenom,login,password) values ('TEST','test','test','test');
insert into user (nom,prenom,login,password) values ('Carter','Jimmy','jimmy','jimmy');
insert into user (nom,prenom,login,password) values ('Reagan','Ronald','ronald','ronald');
insert into user (nom,prenom,login,password) values ('Nixon','Richard','richard','richard');
insert into user (nom,prenom,login,password) values ('Johnson','Lyndon','lyndon','lyndon');
insert into user (nom,prenom,login,password) values ('Picsou','Balthazar','piscou','picsou');
insert into user (nom,prenom,login,password) values ('Trouvetou','Géo','geo','geo');
insert into user (nom,prenom,login,password) values ('Flagada','Jones','jones','jones');

insert into activite (libelle) values ('Roller','Escalade','Surf','Running','VTT','Randonnée','Plonger','Planche à voile','Parachute','Pêche');

insert into faire (PERSONNE_ID,ACTIVITE_ID) values (1,1);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (1,2);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (2,1);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (2,2);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (3,3);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (4,4);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (5,3);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (6,4);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (7,5);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (7,6);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (7,7);
insert into faire (PERSONNE_ID,ACTIVITE_ID) values (8,2);

insert into spot (libelle,Xcoord,Ycoord,Region) values ('Biville',0,0,0);
insert into spot (libelle,Xcoord,Ycoord,Region) values ('Siouville',0,0,0);
insert into spot (libelle,Xcoord,Ycoord,Region) values ('Anse du brick',0,0,0);
insert into spot (libelle,Xcoord,Ycoord,Region) values ('Vauville',0,0,0);
insert into spot (libelle,Xcoord,Ycoord,Region) values ('Rennes',0,0,0);
