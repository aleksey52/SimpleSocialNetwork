INSERT INTO User VALUES (1, 'ivan1337', 'qwerty', 'Иван', 'Иванович', 'Иванов'),
                        (2, 'anna777', '123456', 'Анна', 'Юрьевна', 'Панова'),
                        (3, 'vasya228', 'qawsed', 'Василий', 'Владимирович', 'Васильев');

INSERT INTO Message VALUES (1, 1, 2, 'Привет, я Ваня', parsedatetime('17-08-2021 18:47', 'dd-MM-yyyy hh:mm')),
                           (2, 2, 1, 'Привет, я Аня', parsedatetime('17-08-2021 18:50', 'dd-MM-yyyy hh:mm')),
                           (3, 1, 2, 'Продаю Х5 93 года', parsedatetime('17-08-2021 18:52', 'dd-MM-yyyy hh:mm')),
                           (4, 3, 1, 'Привет, продай мне свой Х5 93 года', parsedatetime('17-08-2021 19:31', 'dd-MM-yyyy hh:mm')),
                           (5, 1, 3, 'Нит', parsedatetime('18-08-2021 8:15', 'dd-MM-yyyy hh:mm'));