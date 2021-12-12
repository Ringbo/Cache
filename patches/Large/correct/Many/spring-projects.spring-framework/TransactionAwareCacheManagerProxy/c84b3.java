diff --git a/spring-context-support/src/main/java/org/springframework/cache/transaction/TransactionAwareCacheManagerProxy.java b/spring-context-support/src/main/java/org/springframework/cache/transaction/TransactionAwareCacheManagerProxy.java
index 2813c0d..c5250af 100644
--- a/spring-context-support/src/main/java/org/springframework/cache/transaction/TransactionAwareCacheManagerProxy.java
+++ b/spring-context-support/src/main/java/org/springframework/cache/transaction/TransactionAwareCacheManagerProxy.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2014 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -68,7 +68,7 @@
 	@Override
 	public void afterPropertiesSet() {
 		if (this.targetCacheManager == null) {
-			throw new IllegalStateException("'targetCacheManager' is required");
+			throw new IllegalArgumentException("Property 'targetCacheManager' is required");
 		}
 	}
 
