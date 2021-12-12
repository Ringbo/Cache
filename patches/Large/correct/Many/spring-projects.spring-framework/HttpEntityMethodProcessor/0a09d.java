diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/HttpEntityMethodProcessor.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/HttpEntityMethodProcessor.java
index e93029a..edb113e 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/HttpEntityMethodProcessor.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/HttpEntityMethodProcessor.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2013 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -68,7 +68,7 @@
 
 	public boolean supportsReturnType(MethodParameter returnType) {
 		Class<?> parameterType = returnType.getParameterType();
-		return HttpEntity.class.equals(parameterType) || ResponseEntity.class.equals(parameterType);
+		return HttpEntity.class.isAssignableFrom(parameterType) || ResponseEntity.class.isAssignableFrom(parameterType);
 	}
 
 	public Object resolveArgument(
