# learn_apache_kafka
learning apache kafka

documentation : apache official : https://kafka.apache.org/

1. Kafka Broker
2. Kafka Client
3. Kafka connect
- Worker
- Connecttor
- Task
4. Kafka Streams
- What is Real-time Stream Processing ?
- What is Kafka ?
- Kafka Streams Architecture ?
5. KSQL
- KSQL is SQL interface to Kafka Streams  


Apache Kafka Core Concepts :
1. Producer
2. Consumer
3. Broker
4. Cluster
5. Topic
6. Parititions
7. Offset
8. Consumer Groups

apache spark for handling data lake

* Installing Single Node kafka Cluster
1. Open Source - Apache Kafka
2. Commercial Distribution - confluent.io (using community edition)
3. Managed Service - confluent, amazonm aiven.io
* Using Producer and Consumer
* Installing Multi-Node Kafka Cluster
* Using Consumer Group


1. run zookeeper 
command : 'bin/./zookeeper-server-start etc/kafka/zookeeper.properties'
apache zookeeper is database
2. started kafka broker
command : 'bin/./kafka-server-start etc/kafka/server.properties'