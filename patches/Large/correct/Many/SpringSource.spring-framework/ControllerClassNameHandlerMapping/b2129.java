diff --git a/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/mvc/support/ControllerClassNameHandlerMapping.java b/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/mvc/support/ControllerClassNameHandlerMapping.java
index aea281b..119f9e9 100644
--- a/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/mvc/support/ControllerClassNameHandlerMapping.java
+++ b/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/mvc/support/ControllerClassNameHandlerMapping.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2008 the original author or authors.
+ * Copyright 2002-2009 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -137,7 +137,7 @@
 		StringBuilder pathMapping = buildPathPrefix(beanClass);
 		String className = ClassUtils.getShortName(beanClass);
 		String path = (className.endsWith(CONTROLLER_SUFFIX) ?
-				className.substring(0, className.indexOf(CONTROLLER_SUFFIX)) : className);
+				className.substring(0, className.lastIndexOf(CONTROLLER_SUFFIX)) : className);
 		if (path.length() > 0) {
 			if (this.caseSensitive) {
 				pathMapping.append(path.substring(0, 1).toLowerCase()).append(path.substring(1));
