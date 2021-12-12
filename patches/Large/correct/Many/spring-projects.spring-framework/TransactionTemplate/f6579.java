diff --git a/spring-tx/src/main/java/org/springframework/transaction/support/TransactionTemplate.java b/spring-tx/src/main/java/org/springframework/transaction/support/TransactionTemplate.java
index 7515148..b2fd8ce 100644
--- a/spring-tx/src/main/java/org/springframework/transaction/support/TransactionTemplate.java
+++ b/spring-tx/src/main/java/org/springframework/transaction/support/TransactionTemplate.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2012 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -142,7 +142,7 @@
 				rollbackOnException(status, err);
 				throw err;
 			}
-			catch (Exception ex) {
+			catch (Throwable ex) {
 				// Transactional code threw unexpected exception -> rollback
 				rollbackOnException(status, ex);
 				throw new UndeclaredThrowableException(ex, "TransactionCallback threw undeclared checked exception");
