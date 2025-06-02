
<a href="https://bivgroup.ru/ "> <img src="media/bivlogo.png" width="200" height="200"> 
<h1 >Проект по автоматизации тестирования для компании <a href="https://bivgroup.ru/ "> BIV </a></h1> 

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## ☑️ Технологии и инструменты:

<p align="center">
<img width="50px" title="IntelliJ IDEA" src="media/icons/Intelij_IDEA.png">
<img width="50px" title="Java" src="media/icons/Java.png"> 
<img width="50px" title="Java" src="media/icons/Selenide.svg"> 
<img width="50px" title="Selenoid" src="media/icons/Selenoid.png">
<img width="50px" title="Allure Report" src="media/icons/Allure_Report.png">
<img width="50px" title="Gradle" src="media/icons/Gradle.png">
<img width="50px" title="JUnit5" src="media/icons/JUnit5.png">
<img width="50px" title="JUnit5" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" />
<img width="50px" title="Jenkins" src="media/icons/AllureTestOps.svg">
<img width="50px" title="Telegram" src="media/icons/Telegram.png">

</p>



## ☑️ Реализованные проверки:

- Проверяем количество кнопок в header меню"
- Открываем страницу О компании и видим заголовок "О компании"
- Открываем страницу Направления и проверяем заголовок "Направления"
- Открываем страницу Технологии и видим в заголовках "Технологии"
- Открываем страницу Клиенты и видим в заголовках "Клиенты"

## ☑️ Jenkins Сборка в [Jenkins](https://jenkins.autotests.cloud/job/biv-tests/)


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