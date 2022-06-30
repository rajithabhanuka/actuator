```
curl --location --request GET 'http://localhost:8080/actuator'
```

```
curl --location --request GET 'http://localhost:8080/actuator/metrics'
```

```
curl --location --request GET 'http://localhost:8080/actuator/beans'
```

```
curl --location --request GET 'http://localhost:8080/actuator/caches'
```

```
curl --location -g --request GET 'http://localhost:8080/actuator/caches/{cache}'
```

```
curl --location --request GET 'http://localhost:8080/actuator/health'
```

```
curl --location --request GET 'http://localhost:8080/actuator/info'
```

```
curl --location --request GET 'http://localhost:8080/actuator/conditions'
```

```
curl --location --request GET 'http://localhost:8080/actuator/configprops'
```

```
curl --location --request GET 'http://localhost:8080/actuator/env'
```

```
curl --location --request GET 'http://localhost:8080/actuator/loggers'
```

```
curl --location --request GET 'http://localhost:8080/actuator/heapdump'
```

```
curl --location --request GET 'http://localhost:8080/actuator/threaddump'
```

```
curl --location --request GET 'http://localhost:8080/actuator/metrics'
```

```
curl --location --request GET 'http://localhost:8080/actuator/scheduledtasks'
```

```
curl --location --request GET 'http://localhost:8080/actuator/mappings'
```

```
curl --location --request POST 'http://localhost:8080/restart' \
--header 'Cookie: JSESSIONID=AF20D8B344870F56E242995F919E5C53'
```