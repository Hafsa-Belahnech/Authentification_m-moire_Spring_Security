# Authentification en mémoire avec Spring Security

**Cours :** Développement JakartaEE : Spring

---
# Objectifs 
- Création des utilisateurs et les rôles
- Compréhension du modèle d’authentification de Spring Security
- Restriction d’accès à certaines pages selon les rôles


### 🛡️ Fonctionnalités implémentées
*   **Authentification In-Memory** : Gestion sécurisée des profils `admin` et `user` avec des identifiants prédéfinis.
*   **Contrôle d'accès par rôles** : Restriction stricte des URL. L'accès aux fonctionnalités d'administration est réservé au rôle `ADMIN`, tandis que l'espace utilisateur est partagé.
*   **Interface dynamique avec Thymeleaf** : Utilisation d'un formulaire de connexion personnalisé (`login.html`) intégré au moteur de template.
*   **Aiguillage intelligent** : Système de redirection automatique qui oriente l'utilisateur vers son tableau de bord spécifique selon son rôle (`/admin/dashboard` ou `/user/dashboard`).

---

###  Outils Techniques

- Dépendances : Spring Web, Spring Security, Thymeleaf
- IntelliJ, Maven, Spring Boot
- JDK 17


## 📸 Captures d'écran des tests de validation

### 1. Génération de la page de connexion automatiquement par Spring Security
<img width="1600" height="501" alt="image" src="https://github.com/user-attachments/assets/b7bd72b7-b21e-4049-b142-4d3fe3785dde" />

### 2. Initialisation de Spring boot 
<img width="1600" height="732" alt="image" src="https://github.com/user-attachments/assets/160b137a-d357-4a0b-b1c5-e1cb2863fc50" />

### 2. Tentative de connexion 
<img width="1600" height="426" alt="image" src="https://github.com/user-attachments/assets/735ed816-4a6e-4532-8cdc-39b91d3fba7b" />
<img width="1600" height="287" alt="image" src="https://github.com/user-attachments/assets/360207c7-dac2-4b9e-b267-5c89a87a0691" />
<img width="965" height="321" alt="image" src="https://github.com/user-attachments/assets/8ba39fc7-409e-455e-90dc-f8bc78227d8e" />
<img width="1600" height="561" alt="image" src="https://github.com/user-attachments/assets/f19dc04a-28d6-484b-a9e9-b3695c3c1aec" />
<img width="1600" height="289" alt="image" src="https://github.com/user-attachments/assets/7837d7f7-1e41-427c-9757-43d1d3badf14" />
<img width="1600" height="384" alt="image" src="https://github.com/user-attachments/assets/7e0f3e74-fa77-4af6-aa20-a366eb22e61b" />




### 1. Formulaire de connexion personnalisé
<img width="1600" height="422" alt="image" src="https://github.com/user-attachments/assets/602ee2d7-1834-44c0-b927-e9e8eab11799" />


### 2. Accès Espace Administrateur (admin/1234)
*(Insérer ici la capture du texte : "Ici Espace administrateur...")*

### 3. Accès Espace Utilisateur (user/1111)
*(Insérer ici la capture du texte : "Ici Espace utilisateur...")*

### 4. Test d'accès refusé (403 Forbidden)
*(Insérer ici la capture montrant l'interdiction pour 'user' d'aller sur '/admin')*

---

**Projet finalisé et prêt pour évaluation.**
