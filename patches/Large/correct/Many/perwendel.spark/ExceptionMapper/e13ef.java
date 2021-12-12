diff --git a/src/main/java/spark/ExceptionMapper.java b/src/main/java/spark/ExceptionMapper.java
index 0bab0c8..b92d3cf 100644
--- a/src/main/java/spark/ExceptionMapper.java
+++ b/src/main/java/spark/ExceptionMapper.java
@@ -30,7 +30,7 @@
      *
      * @return Default instance
      */
-    public static ExceptionMapper getInstance() {
+    public synchronized static ExceptionMapper getInstance() {
         if (defaultInstance == null) {
             defaultInstance = new ExceptionMapper();
         }
