diff --git a/src/main/java/graphql/ExceptionWhileDataFetching.java b/src/main/java/graphql/ExceptionWhileDataFetching.java
index 4a57665..0e548d9 100644
--- a/src/main/java/graphql/ExceptionWhileDataFetching.java
+++ b/src/main/java/graphql/ExceptionWhileDataFetching.java
@@ -20,7 +20,7 @@
 
     @Override
     public String getMessage() {
-        return "Exception while fetching data: " + exception.toString();
+        return "Exception while fetching data: " + exception.getMessage();
     }
 
     @Override
