# Muser - Backend

Backend di **Muser**, applicazione musicale per creare, gestire e condividere playlist.

## Tecnologie
- Java 17
- Spring Boot
- PostgreSQL
- Spring Security + JWT
- Maven

## Funzionalità principali
- Registrazione e login utenti
- Gestione profilo utente
- CRUD di playlist e brani
- Autenticazione e autorizzazione sicura
- Comunicazione con il frontend tramite REST API

## Struttura del progetto
muser-backend/
├─ src/main/java/com/muser/
│ ├─ controller/ ← gestione richieste HTTP
│ ├─ service/ ← logica di business
│ ├─ repository/ ← interfaccia con il database
│ └─ model/ ← entità principali
├─ src/main/resources/
│ └─ application.properties ← configurazioni Spring e DB
├─ pom.xml ← gestione dipendenze Maven
└─ README.md
