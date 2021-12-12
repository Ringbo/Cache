diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/amqp/RabbitAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/amqp/RabbitAutoConfiguration.java
index b9b30d4..5385148 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/amqp/RabbitAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/amqp/RabbitAutoConfiguration.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2014 the original author or authors.
+ * Copyright 2012-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -82,7 +82,7 @@
 	@Bean
 	@ConditionalOnProperty(prefix = "spring.rabbitmq", name = "dynamic", matchIfMissing = true)
 	@ConditionalOnMissingBean(AmqpAdmin.class)
-	public AmqpAdmin amqpAdmin(CachingConnectionFactory connectionFactory) {
+	public AmqpAdmin amqpAdmin(ConnectionFactory connectionFactory) {
 		return new RabbitAdmin(connectionFactory);
 	}
 
