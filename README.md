VRaptor Blank Project
=====================

Projeto Java web com arquitetura base para aplicações com VRaptor, Spring e Hibernate/JPA.

Configurando o Projeto
-----------------------

O projeto [vraptor-blank-project](https://github.com/triadworks/vraptor-blank-project) possui arquitetura base para uma aplicação Java web que utiliza **VRaptor, Spring e Hibernate (JPA2)**. As tecnologias principais utilizadas no projeto podem ser vistas logo abaixo:

* Maven 3
* VRaptor 3.5.0
* Spring 3.1.4
* Hibernate 3.6.10 (JPA 2.0)
* Sitemesh 2.4.2
* jQuery 1.8.2
* Twitter Bootstrap v2.2.1
* jUnit 4.11, Mockito 1.9.0, DbUnit 2.4.9 e [DbUnitManager 1.0](https://github.com/rponte/dbunitmanager) (testes automatizados)

Para configurar o projeto siga os passos:

1. Baixe o projeto do GitHub já definindo o nome do seu novo projeto (neste caso, "myproject"):
```BASH
$ git clone https://github.com/triadworks/vraptor-blank-project.git myproject
$ cd myproject
```

2. Configure o `pom.xml` com as informações básicas do seu projeto, como `groupId`, `artifactId`, `name`. O pom.xml ficará semelhante a este:
```XML
<modelVersion>4.0.0</modelVersion>
<groupId>br.com.mycompany.myproject</groupId>
<artifactId>myproject</artifactId>
<packaging>war</packaging>
<version>0.0.1-SNAPSHOT</version>
<name>My Project</name>
```

3. Configure o projeto para ser importado pelo Eclipse (os arquivos `.project`, `.classpath` e `.settings` serão criados). Pode demorar um pouco ao executar este comando pela primeira vez, pois o Maven precisará baixar todas as dependências do projeto.
```BASH
$ mvn eclipse:clean eclipse:eclipse
```

4. Importe o projeto no [Eclipse Java EE IDE for Web Developers (Kepler)](http://www.eclipse.org/downloads/) ou superior;

Pronto! Agora é possível desenvolver uma aplicação utilizando esta arquitetura base. Algumas classes e artefatos já existem no projeto para auxiliar o desenvolvimento - estas classes e artefatos (controllers, daos, services, jsps etc) são provenientes do projeto [vraptor-issuetracker-mvn-project](https://github.com/rponte/vraptor-issuetracker-mvn-project).

Mais informações
----------------

**TriadWorks**
- http://www.triadworks.com.br
- http://www.triadworks.com.br/servico.html

**Rafael Ponte**
- Meu [blog](http://www.rponte.com.br)
- Meu Twitter [@rponte](http://twitter.com/#!/rponte)

**JavaCE Group**
- https://groups.google.com/forum/?fromgroups#!forum/javace
