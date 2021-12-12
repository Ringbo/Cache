diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/redis/RedisAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/redis/RedisAutoConfiguration.java
index 2469a61..83a1cdb 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/redis/RedisAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/redis/RedisAutoConfiguration.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2014 the original author or authors.
+ * Copyright 2012-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -178,7 +178,7 @@
 
 		@Bean
 		@ConditionalOnMissingBean(name = "redisTemplate")
-		public RedisOperations<Object, Object> redisTemplate(
+		public RedisTemplate<Object, Object> redisTemplate(
 				RedisConnectionFactory redisConnectionFactory)
 				throws UnknownHostException {
 			RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
