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


* Started kafka
1. run zookeeper 
command : 'bin/./zookeeper-server-start etc/kafka/zookeeper.properties'
apache zookeeper is database
2. started kafka broker
command : 'bin/./kafka-server-start etc/kafka/server.properties'


* create producer and consumer
1. Sending Data FIle to Kafka
- Create Topic using kafka-topics
command : bin/./kafka-topics --create --topic test --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092


replication-factor is the number of copy of each partition
need to tell the cluster coordinates this command 

for create topic with partition need check :
- Storage Requirement
- Parallel Processing Requirement

- sending data file using kafka-console-producer
command : bin/./kafka-console-producer --topic test --broker-list localhost:9092 < ../data.txt
2. Reading Kafka Topic
- Using kafka-console-consumer
command : bin/./kafka-console-consumer --topic test --bootstrap-server localhost:9092 --from-beginning
