diff --git a/spring-beans/src/main/java/org/springframework/beans/GenericTypeAwarePropertyDescriptor.java b/spring-beans/src/main/java/org/springframework/beans/GenericTypeAwarePropertyDescriptor.java
index c3005d0..ffe31bd 100644
--- a/spring-beans/src/main/java/org/springframework/beans/GenericTypeAwarePropertyDescriptor.java
+++ b/spring-beans/src/main/java/org/springframework/beans/GenericTypeAwarePropertyDescriptor.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2014 the original author or authors.
+ * Copyright 2002-2015 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -90,7 +90,8 @@
 				Set<Method> ambiguousCandidates = new HashSet<Method>();
 				for (Method method : beanClass.getMethods()) {
 					if (method.getName().equals(writeMethodToUse.getName()) &&
-							!method.equals(writeMethodToUse) && !method.isBridge()) {
+							!method.equals(writeMethodToUse) && !method.isBridge() &&
+							method.getParameterTypes().length == writeMethodToUse.getParameterTypes().length) {
 						ambiguousCandidates.add(method);
 					}
 				}
