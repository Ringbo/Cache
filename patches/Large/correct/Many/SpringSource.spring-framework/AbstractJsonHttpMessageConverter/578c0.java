diff --git a/spring-web/src/main/java/org/springframework/http/converter/json/AbstractJsonHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/json/AbstractJsonHttpMessageConverter.java
index 5e1baec..d9caa74 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/json/AbstractJsonHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/json/AbstractJsonHttpMessageConverter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2017 the original author or authors.
+ * Copyright 2002-2018 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -124,7 +124,7 @@
 		catch (Exception ex) {
 			throw new HttpMessageNotWritableException("Could not write JSON: " + ex.getMessage(), ex);
 		}
-		writer.close();
+		writer.flush();
 	}
 
 
