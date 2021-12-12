diff --git a/spring-boot/src/main/java/org/springframework/boot/SpringBootVersion.java b/spring-boot/src/main/java/org/springframework/boot/SpringBootVersion.java
index 095d4ef..971b987 100644
--- a/spring-boot/src/main/java/org/springframework/boot/SpringBootVersion.java
+++ b/spring-boot/src/main/java/org/springframework/boot/SpringBootVersion.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2015 the original author or authors.
+ * Copyright 2012-2017 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -40,7 +40,7 @@
 	 * @see Package#getImplementationVersion()
 	 */
 	public static String getVersion() {
-		Package pkg = SpringApplication.class.getPackage();
+		Package pkg = SpringBootVersion.class.getPackage();
 		return (pkg != null ? pkg.getImplementationVersion() : null);
 	}
 
