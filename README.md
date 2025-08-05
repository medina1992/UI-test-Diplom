
<a href="https://bivgroup.ru/ "> <img src="media/bivlogo.png" width="200" height="200"> 
<h1 >Проект по автоматизации тестирования для компании <a href="https://bivgroup.ru/ "> BIV </a></h1> 

## ☑️ Содержание:

- [Технологический стек](#-технологический-стек)
- [Реализованные проверки](#-Реализованные проверки)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Allure-отчет](#-allure-отчет)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео пример прохождения тестов](#-Видео пример прохождения тестов)


<a id="tools"></a>
## ☑️ Технологии и инструменты:

<div align="center">
  <table>
    <tr>
      <!-- Первая строка -->
      <td align="center" width="110">
        <a href="https://www.jetbrains.com/idea/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" width="48" height="48" alt="IntelliJ IDEA" />
        </a>
        <br>IDEA
      </td>
      <td align="center" width="110">
        <a href="https://www.java.com" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="48" height="48" alt="Java" />
        </a>
        <br>Java
      </td>
      <td align="center" width="110">
        <a href="https://junit.org/junit5/" target="_blank">
          <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="48" height="48" alt="JUnit 5" />
        </a>
        <br>JUnit 5
      </td>
      <td align="center" width="110">
        <a href="https://gradle.org/" target="_blank">
          <img src="https://cdn.simpleicons.org/gradle/02303A" width="48" height="48" alt="Gradle" />
        </a>
        <br>Gradle
      </td>
    </tr>
    <tr>
      <!-- Вторая строка -->
      <td align="center" width="110">
        <a href="https://docs.qameta.io/allure/" target="_blank">
          <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" width="48" height="48" alt="Allure" />
        </a>
        <br>Allure
      </td>
      <td align="center" width="110">
        <a href="https://www.jenkins.io/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg" width="48" height="48" alt="Jenkins" />
        </a>
        <br>Jenkins
      </td>
      <td align="center" width="110">
        <a href="https://github.com/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" width="48" height="48" alt="GitHub" />
        </a>
        <br>GitHub
      </td>
      <td align="center" width="110">
        <a href="https://rest-assured.io/" target="_blank">
          <img src="https://rest-assured.io/img/logo-transparent.png" width="48" height="48" alt="Rest-Assured" />
        </a>
        <br>Rest-Assured
      </td>
    </tr>
  </table>
</div>

- Тесты написаны на **Java** с использованием фреймворка **Selenide** в **IntelliJ IDEA**
- Сборка проекта осуществляется через **Gradle**
- Запуск тестов в контейнерах **Selenoid**
- Интеграция с **Jenkins** + автоматическая отправка отчетов в **Telegram**



## ☑️ Реализованные проверки:

- Проверяем количество кнопок в header меню"
- Открываем страницу О компании и видим заголовок "О компании"
- Открываем страницу Направления и проверяем заголовок "Направления"
- Открываем страницу Технологии и видим в заголовках "Технологии"
- Открываем страницу Клиенты и видим в заголовке "Клиенты"

## ☑️ Удаленный запуск [Jenkins](https://jenkins.autotests.cloud/job/biv-tests/)


<p align="center">  
<img src="media/jenkinsBuild.png" alt="Jenkins" width="950"/></>  
</p>


## ☑️ Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 127.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)


## Команда для запуска из терминала
Локальный запуск
```bash
gradle clean UseTech
```
Запуск с параметрами:
```bash  
-Dbrowser=chrome -DbrowserSize=1920x1080 -DbrowserVersion=128.0
```
Удаленный запуск через Jenkins:
```bash  
clean UseTech
-Dbrowser="${BROWSER}"
-DbrowserSize="${BROWSER_SIZE}"
-DbrowserVersion="${BROWSER_VERSION}"
-DbrowserRemote="https://log:pass@${BROWSER_REMOTE}/wd/hub"
```

## ☑️ Allure Report	


## ☑️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/allur.png" width="850">  
</p>  

____
## ☑️ Allure Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/tgbot.png" width="550">  
</p>

____
## ☑️ Selenoid

Примеры видео выполнения тестов на Selenoid
____
<p align="center">
  <img src="media/video1.gif" alt="Demo" width="500">
</p>

<p align="center">
  <img src="media/video2.gif" alt="Demo" width="500">
</p>