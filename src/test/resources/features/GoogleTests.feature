# language:ru
@data=$Tests
Функционал: Тестирование поиска Google

Предыстория:
    Когда пользователь переходит на страницу "${main.url}" по ссылке
    Тогда открывается страница "Главная страница"

  @gtest @data=$Data{main}
  Сценарий: Просмотр результатов поиска
    Если пользователь (ищет) "$Tests{data[0].ссылка на продукт 1} и ${продукт} в соусе ${соус}"
    Тогда открывается страница "Результаты поиска"
    И (количество результатов поиска должно быть) "10"
