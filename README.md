# Charlie's Angels Blog

Training project: creation of a blog that can retrieve existing articles, add, modify or delete them.

## Clone

Clone this repo to your local machine using

```bash
git@github.com:jlbareyre/BTZ_2020_Blog_Java.git
```

## Prerequisites

- openjdk 11.0.7

## Getting Started

1.  `mvn clean package`
2.  `mvn spring-boot:run`

![Application view](/src/main/resources/static/images/app-view.png)

## Built With

- [Spring](https://spring.io/) - The web framework used.
- [Bootstrap](https://getbootstrap.com/) - For our CSS.
- [Thymeleaf](https://www.thymeleaf.org/) - Server-side Java template engine for both web and standalone environments.
- [MySql](https://www.mysql.com/fr/) - For database management.
- [Maven](https://maven.apache.org/) - Manage a project's build, reporting and documentation.

## Folder Hierarchy

- `/src/main/java/com/wildcodeschool/blogJava` : includes the application code (controller, model ...)
- `/main/resources` : includes Thymeleaf templates and static elements of the project (CSS, image ...)
- `pom.xml` : this is the file that contains all the configuration.

## `/wildcodeschool/blogJava`

### Folders

- `/config` : Contains the elements allowing the connection to the Database.
- `/controller` : All our controllers.
- `/dao` : All our Data Acces Object specific & generic.
- `/model` : All our models (Tag, User, Article).
- `/repository` : All our repertories.
- `/util` : Contains a file avoiding us redundant code concerning Java Database Connectivity.

### File

- `BlogJavaApplication.java`: Is the application's entry point.


## Feature

- Create article,
- Get Articles by creation date,
- Edit & delete articles,
- Filter articles by tag

## Team

- [Emmanuelle](https://github.com/e-larzabal) - Developer
- [Jean-Loup](https://github.com/jlbareyre) - Developer
- [Perrine](https://github.com/AlaplayaW) - Developer
- [Sylène](https://github.com/Zesysy) - Developer
