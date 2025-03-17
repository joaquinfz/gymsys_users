User Service – Gym Management System
📌 Overview

The User Service is responsible for managing gym members, trainers, and administrators within the system. It handles:

    User authentication & authorization (e.g., JWT, OAuth2).
    Role-based access control (RBAC) for members, trainers, and admins.
    Profile management with user information.
    Integration with other services such as membership, class booking, and workout tracking.

🔧 Key Features & Potential Enhancements
✅ Core Features

✔ User Registration & Authentication

    Users can sign up with an email and password.
    Secure authentication using JWT tokens.
    Option for OAuth2 (Google, Facebook, etc.).

✔ Role-Based Access Control (RBAC)

    Assign roles: Member, Trainer, Admin.
    Different permissions based on roles (e.g., Trainers can create workout plans).

✔ Profile Management

    Users can update their name, age, contact details, and fitness goals.
    Upload profile pictures.

🚀 Potential Future Enhancements

🔹 Subscription & Membership Integration

    Show active membership status (Basic, Premium, VIP).
    Track membership expiration and send renewal reminders.

Method	Endpoint	Description
POST	/users/register	Register a new user
POST	/users/login	Authenticate user & return JWT token
GET	/users/{id}	Get user profile
PUT	/users/{id}	Update user profile
DELETE	/users/{id}	Delete user account



