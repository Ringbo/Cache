diff --git a/org.springframework.orm/src/main/java/org/springframework/orm/hibernate3/LocalSessionFactoryBean.java b/org.springframework.orm/src/main/java/org/springframework/orm/hibernate3/LocalSessionFactoryBean.java
index 0cb0d73..887ceae 100644
--- a/org.springframework.orm/src/main/java/org/springframework/orm/hibernate3/LocalSessionFactoryBean.java
+++ b/org.springframework.orm/src/main/java/org/springframework/orm/hibernate3/LocalSessionFactoryBean.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2010 the original author or authors.
+ * Copyright 2002-2012 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -787,7 +787,7 @@
 				configTimeTransactionManagerHolder.remove();
 			}
 			if (this.cacheRegionFactory != null) {
-				configTimeCacheProviderHolder.remove();
+				configTimeRegionFactoryHolder.remove();
 			}
 			if (this.cacheProvider != null) {
 				configTimeCacheProviderHolder.remove();
@@ -862,7 +862,7 @@
 
 	/**
 	 * Return the Configuration object used to build the SessionFactory.
-	 * Allows access to configuration metadata stored there (rarely needed).
+	 * Allows for access to configuration metadata stored there (rarely needed).
 	 * @throws IllegalStateException if the Configuration object has not been initialized yet
 	 */
 	public final Configuration getConfiguration() {
