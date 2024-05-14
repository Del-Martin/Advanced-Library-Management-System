# Advanced Library Management System
**Description**  
The Advanced Library Management System is a Java application designed to efficiently manage a library's operations, including handling books, authors, users, and premium members.

**Features:**  
  
Book Management:  
- Each book has a title, an author, and an availability status.  
- Books are added to a central list upon creation.  
- Methods to mark books as borrowed or returned.  

Author Management: 
- Authors have a name and a list of books they've written.  
- Authors can publish (create) books.
  
User Management:  
- Users have a name and a list of borrowed books.
- Methods to borrow and return books.  

Premium Member Management:  
- Premium Members inherit from Users.
- Additional capability to reserve books that are currently on loan.  

**Class and Relationship Overview:**  

- Books: Managed in a central list, associated with a single author.
- Authors: Can write and publish multiple books.
- Users: Can borrow multiple books.
- Premium Members: Inherit user capabilities and can reserve books on loan.
  
**Demonstrated Functionality:** 
- Authors publishing books.
- Users borrowing and returning books.
- Premium Members reserving and borrowing books, depending on availability.
- Real-time tracking of book availability status.
    
This system showcases efficient library management by integrating core functionalities that allow seamless book borrowing, returning, and reservation processes.  

**Credits**  
Developed by: **Martín Delfini** - 
Date: April 30, 2024

--- 
# Sistema Avanzado de Gestión de Biblioteca

**Descripción**  
El Sistema Avanzado de Gestión de Biblioteca es una aplicación en Java diseñada para gestionar de manera eficiente las operaciones de una biblioteca, incluyendo la gestión de libros, autores, usuarios y miembros premium.  


**Características:**  

Gestión de Libros:  
- Cada libro tiene un título, un autor y un estado de disponibilidad.
- Los libros se añaden a una lista central al ser creados.
- Métodos para marcar los libros como prestados o devueltos.  

Gestión de Autores:  
- Los autores tienen un nombre y una lista de libros que han escrito.
- Los autores pueden publicar (crear) libros.  

Gestión de Usuarios:  
- Los usuarios tienen un nombre y una lista de libros prestados.
- Métodos para tomar prestados y devolver libros.  

Gestión de Miembros Premium:  
- Los miembros premium heredan de los usuarios.
- Capacidad adicional para reservar libros que están actualmente prestados.  

**Resumen de Clases y Relaciones:**  
- Libros: Gestionados en una lista central, asociados a un solo autor.
- Autores: Pueden escribir y publicar múltiples libros.
- Usuarios: Pueden tomar prestados múltiples libros.
- Miembros Premium: Heredan las capacidades de los usuarios y pueden reservar libros prestados.

**Funcionalidad Demostrada:**  
- Autores publicando libros.
- Usuarios tomando prestados y devolviendo libros.
- Miembros premium reservando y tomando prestados libros, según disponibilidad.
- Seguimiento en tiempo real del estado de disponibilidad de los libros.
  
Este sistema demuestra una gestión eficiente de la biblioteca al integrar funcionalidades básicas que permiten procesos fluidos de préstamo, devolución y reserva de libros.  

**Créditos**  
Desarrollado por: **Martín Delfini** - 
Fecha: 30 de abril de 2024
