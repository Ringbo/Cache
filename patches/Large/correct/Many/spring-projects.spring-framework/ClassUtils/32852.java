diff --git a/spring-core/src/main/java/org/springframework/util/ClassUtils.java b/spring-core/src/main/java/org/springframework/util/ClassUtils.java
index ab565a3..48a7826 100644
--- a/spring-core/src/main/java/org/springframework/util/ClassUtils.java
+++ b/spring-core/src/main/java/org/springframework/util/ClassUtils.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2013 the original author or authors.
+ * Copyright 2002-2014 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -356,7 +356,7 @@
 		Assert.notNull(clazz, "Class must not be null");
 		ClassLoader target = clazz.getClassLoader();
 		if (target == null) {
-			return false;
+			return true;
 		}
 		ClassLoader cur = classLoader;
 		if (cur == target) {
