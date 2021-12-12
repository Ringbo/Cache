diff --git a/spring-tx/src/main/java/org/springframework/transaction/interceptor/TransactionAspectSupport.java b/spring-tx/src/main/java/org/springframework/transaction/interceptor/TransactionAspectSupport.java
index 60a5b12..fdf1641 100644
--- a/spring-tx/src/main/java/org/springframework/transaction/interceptor/TransactionAspectSupport.java
+++ b/spring-tx/src/main/java/org/springframework/transaction/interceptor/TransactionAspectSupport.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2013 the original author or authors.
+ * Copyright 2002-2014 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -111,10 +111,10 @@
 	 */
 	public static TransactionStatus currentTransactionStatus() throws NoTransactionException {
 		TransactionInfo info = currentTransactionInfo();
-		if (info == null) {
+		if (info == null || info.transactionStatus == null) {
 			throw new NoTransactionException("No transaction aspect-managed TransactionStatus in scope");
 		}
-		return currentTransactionInfo().transactionStatus;
+		return info.transactionStatus;
 	}
 
 
