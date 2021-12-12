diff --git a/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/freemarker/FreeMarkerNonWebConfiguration.java b/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/freemarker/FreeMarkerNonWebConfiguration.java
index edc3e15..22b1dce 100644
--- a/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/freemarker/FreeMarkerNonWebConfiguration.java
+++ b/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/freemarker/FreeMarkerNonWebConfiguration.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2017 the original author or authors.
+ * Copyright 2012-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -30,9 +30,9 @@
  */
 @Configuration
 @ConditionalOnNotWebApplication
-public class FreeMarkerNonWebConfiguration extends AbstractFreeMarkerConfiguration {
+class FreeMarkerNonWebConfiguration extends AbstractFreeMarkerConfiguration {
 
-	public FreeMarkerNonWebConfiguration(FreeMarkerProperties properties) {
+	FreeMarkerNonWebConfiguration(FreeMarkerProperties properties) {
 		super(properties);
 	}
 
