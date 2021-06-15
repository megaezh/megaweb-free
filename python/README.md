# swagger-client
REST API биржи описаний к фильмам и сериалам https://kinocontent.club

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen
For more information, please visit [https://t.me/megaezz](https://t.me/megaezz)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания

try:
    # Удаление задания
    api_response = api_instance.task_delete(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_delete: %s\n" % e)

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания

try:
    # Получение информации о задании
    api_response = api_instance.task_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_get: %s\n" % e)

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
kinopoisk_id = 56 # int | ID фильма или сериала с Кинопоиска (optional)

try:
    # Добавление задания
    api_response = api_instance.task_post(kinopoisk_id=kinopoisk_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_post: %s\n" % e)

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID задания
symbols_from = 56 # int | Символов От (optional)
symbols_to = 56 # int | Символов До (optional)
comment = 'comment_example' # str | Комментарий к заданию (optional)
private_comment = 'private_comment_example' # str | Приватный комментарий (видит только сам пользователь) (optional)
confirmed = true # bool | Подтвержденное задание (отправлено на выполнение) (optional)
express = true # bool | Экспресс задание (optional)
archived = true # bool | Задание в архиве (optional)
rework = true # bool | Задание на доработке (optional)
rework_comment = 'rework_comment_example' # str | Комментарий доработки (optional)

try:
    # Редактирование задания
    api_response = api_instance.task_put(id, symbols_from=symbols_from, symbols_to=symbols_to, comment=comment, private_comment=private_comment, confirmed=confirmed, express=express, archived=archived, rework=rework, rework_comment=rework_comment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->task_put: %s\n" % e)

# Configure API key authorization: ApiKeyAuth
configuration = swagger_client.Configuration()
configuration.api_key['X-API-KEY'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-API-KEY'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.TaskApi(swagger_client.ApiClient(configuration))
include_data = true # bool | С расширенными данными (по умолчанию) / Только ID (optional)
done = true # bool | Выполненные / не выполненные (optional)
confirmed = true # bool | Отправленные в работу / не отправленные (optional)
archived = true # bool | В архиве / не в архиве (optional)
limit = 56 # int | Лимит (от 1 до 100 элементов) (optional)
page = 56 # int | Номер страницы (optional)

try:
    # Получение списка заданий
    api_response = api_instance.tasks_get(include_data=include_data, done=done, confirmed=confirmed, archived=archived, limit=limit, page=page)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TaskApi->tasks_get: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *https://kinocontent.club/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TaskApi* | [**task_delete**](docs/TaskApi.md#task_delete) | **DELETE** /task | Удаление задания
*TaskApi* | [**task_get**](docs/TaskApi.md#task_get) | **GET** /task | Получение информации о задании
*TaskApi* | [**task_post**](docs/TaskApi.md#task_post) | **POST** /task | Добавление задания
*TaskApi* | [**task_put**](docs/TaskApi.md#task_put) | **PUT** /task | Редактирование задания
*TaskApi* | [**tasks_get**](docs/TaskApi.md#tasks_get) | **GET** /tasks | Получение списка заданий
*UserApi* | [**user_get**](docs/UserApi.md#user_get) | **GET** /user | Получение информации о пользователе
*UserApi* | [**user_put**](docs/UserApi.md#user_put) | **PUT** /user | Редактирование пользователя

## Documentation For Models

 - [Error](docs/Error.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)

## Documentation For Authorization


## ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Author

