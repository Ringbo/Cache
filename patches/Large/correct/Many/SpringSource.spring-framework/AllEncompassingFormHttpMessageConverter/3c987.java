diff --git a/spring-web/src/main/java/org/springframework/http/converter/support/AllEncompassingFormHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/support/AllEncompassingFormHttpMessageConverter.java
index d93e6ff..2edcbb8 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/support/AllEncompassingFormHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/support/AllEncompassingFormHttpMessageConverter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2015 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -53,7 +53,7 @@
 	public AllEncompassingFormHttpMessageConverter() {
 		addPartConverter(new SourceHttpMessageConverter<Source>());
 
-		if (jaxb2Present && !jackson2Present) {
+		if (jaxb2Present && !jackson2XmlPresent) {
 			addPartConverter(new Jaxb2RootElementHttpMessageConverter());
 		}
 
