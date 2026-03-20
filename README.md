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

### 2. Accès Espace Administrateur (admin/8888)
<img width="1600" height="367" alt="image" src="https://github.com/user-attachments/assets/4151b7a8-660d-4d0f-b8a1-e12a39c03708" />
<img width="1600" height="297" alt="image" src="https://github.com/user-attachments/assets/2eb9c151-c72a-4bb7-a5ed-1310d4920244" />

### 3. Accès Espace Utilisateur (user/7777)
<img width="1600" height="373" alt="image" src="https://github.com/user-attachments/assets/e347884e-8ade-45c0-900b-a2ba7e0b5746" />
<img width="1600" height="484" alt="image" src="https://github.com/user-attachments/assets/4e8e3ce5-ce1c-428a-9333-f27640a3f1a9" />

### 4. Test d'accès refusé (403 Forbidden)
<img width="1600" height="421" alt="image" src="https://github.com/user-attachments/assets/4a82a88d-ec92-4e51-8d6d-f8dc6e007250" />
<img width="1600" height="351" alt="image" src="https://github.com/user-attachments/assets/3be44b2c-923e-41fa-855e-4c609dfaecfe" />

---


