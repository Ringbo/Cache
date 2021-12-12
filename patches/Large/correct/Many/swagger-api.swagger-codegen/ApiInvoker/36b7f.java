diff --git a/samples/client/petstore/android-java/src/main/java/io/swagger/client/ApiInvoker.java b/samples/client/petstore/android-java/src/main/java/io/swagger/client/ApiInvoker.java
index 0ccc371..eabb47e 100644
--- a/samples/client/petstore/android-java/src/main/java/io/swagger/client/ApiInvoker.java
+++ b/samples/client/petstore/android-java/src/main/java/io/swagger/client/ApiInvoker.java
@@ -216,7 +216,7 @@
       }
       else if(String.class.equals(cls)) {
         if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
-          return json.substring(1, json.length() - 2);
+          return json.substring(1, json.length() - 1);
         else
           return json;
       }
