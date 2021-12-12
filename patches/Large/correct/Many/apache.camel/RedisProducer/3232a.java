diff --git a/components/camel-spring-redis/src/main/java/org/apache/camel/component/redis/RedisProducer.java b/components/camel-spring-redis/src/main/java/org/apache/camel/component/redis/RedisProducer.java
index 3df1ccb..990963a 100755
--- a/components/camel-spring-redis/src/main/java/org/apache/camel/component/redis/RedisProducer.java
+++ b/components/camel-spring-redis/src/main/java/org/apache/camel/component/redis/RedisProducer.java
@@ -1,4 +1,4 @@
-/*
+/**
  * Licensed to the Apache Software Foundation (ASF) under one or more
  * contributor license agreements.  See the NOTICE file distributed with
  * this work for additional information regarding copyright ownership.
@@ -30,7 +30,7 @@
 final class RedisProducer extends HeaderSelectorProducer {
     private final Map<String, Processor> processors = new HashMap<>();
 
-    public RedisProducer(Endpoint endpoint,
+    RedisProducer(Endpoint endpoint,
                          RedisClient redisClient,
                          String header,
                          String defaultHeaderValue,
