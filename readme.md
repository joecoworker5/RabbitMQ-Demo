# RabbitMQ docker 啟動
```
docker run --name rabbitmq -d -p 15672:15672 -p 5672:5672 \ 
-e RABBITMQ_DEFAULT_USER=root -e RABBITMQ_DEFAULT_PASS=admin \
rabbitmq:management
```

# 實作 rabbitMQ direct/worker/subscribe/routing/topic 模式, 需要在 rabbitMQ server 建立相對應的 queue 和 exchange, 以及 queue 綁定到 exchange 才有辦法做訊息傳遞