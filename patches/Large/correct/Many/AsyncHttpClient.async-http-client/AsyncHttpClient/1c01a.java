diff --git a/src/main/java/com/ning/http/client/AsyncHttpClient.java b/src/main/java/com/ning/http/client/AsyncHttpClient.java
index 3555bd3..467fd24 100755
--- a/src/main/java/com/ning/http/client/AsyncHttpClient.java
+++ b/src/main/java/com/ning/http/client/AsyncHttpClient.java
@@ -363,7 +363,7 @@
 
     @Override
     protected void finalize() throws Throwable {
-        if (!isClosed.get()) {
+        if (isClosed.get()) {
             close();
         }
         super.finalize();
