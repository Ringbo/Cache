diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfiguration.java
index b3c1fff..8c66a5c 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/hateoas/HypermediaAutoConfiguration.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2014 the original author or authors.
+ * Copyright 2012-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -101,7 +101,7 @@
 				objectMapper.registerModule(new Jackson2HalModule());
 				Jackson2HalModule.HalHandlerInstantiator instantiator = new Jackson2HalModule.HalHandlerInstantiator(
 						HalObjectMapperConfiguration.this.relProvider,
-						HalObjectMapperConfiguration.this.curieProvider);
+						HalObjectMapperConfiguration.this.curieProvider, null);
 				objectMapper.setHandlerInstantiator(instantiator);
 			}
 
