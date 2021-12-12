diff --git a/library/src/main/java/com/github/jgilfelt/chuck/ChuckInterceptor.java b/library/src/main/java/com/github/jgilfelt/chuck/ChuckInterceptor.java
index ec9e337..ef9923d 100644
--- a/library/src/main/java/com/github/jgilfelt/chuck/ChuckInterceptor.java
+++ b/library/src/main/java/com/github/jgilfelt/chuck/ChuckInterceptor.java
@@ -91,7 +91,7 @@
         try {
             response = chain.proceed(request);
         } catch (Exception e) {
-            transaction.setError(e.getMessage());
+            transaction.setError(e.toString());
             update(transaction, transactionUri);
             throw e;
         }
