PROGETTO PROGRAMMAZIONE AD OGGETTI 2021-2022


____________________________________________
Applicazione Java che utilizza API di twitter per ottenere informazioni sui tweet ed in particolare per effettuare statistiche sui dati geo e filtrare i tweet in base ad una data o un luogo.
L'applicazione si basa su un API proxy fornita dal professore che potrà essere utilizzata solo ai fini del progetto
____________________________________________
ROTTE DELL'APPLICAZIONE         DESCRIZIONE

-GET /metadati                  RESTITUISCE UN JSONOBJECT CONTENENTE INFORMAZIONI GENERICHE DEI TWEET E I DATI GEO
-GET /filter/created_at         RESTITUISCE UN JSONOBJECT CONTENENTE I DATI DEL TWEET NEL GIORNO INSERITO
-GET /filter/place              RESTITUISCE UN JSONOBJECT CONTENENTE I DATI DEL TWEET NEL LUOGO INSERITO 
-GET /distance                  RESTITUISCE LA DISTANZA 
-GET /number                    RESTITUISCE IL NUMERO DI TWEET
-GET /maxemin                   RESTITUISCE
____________________________________________

METADATI

![GEO txt - Blocco note 20_01_2022 20_50_45](https://user-images.githubusercontent.com/95302843/150414125-ff6d613d-3b85-442e-afa5-8e07131a319d.png)




Esempio dei metadati riguardanti i dati geo di tweet
____________________________________________
ECCEZIONI
Le eccezioni personalizzate sono le seguenti: 
-DATAEXCEPTION: viene lanciata se la data non è presente nel tweet
                restituisce un messaggio di errore { "Data non presente nel tweet" }
-PLACEEXCEPTION: viene lanciata se il luogo non viene specificato nel tweet 
                 restituisce un messaggio di errore { "Luogo non presente nel tweet"}
_____________________________________________




