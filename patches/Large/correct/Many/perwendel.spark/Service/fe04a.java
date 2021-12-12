diff --git a/src/main/java/spark/Service.java b/src/main/java/spark/Service.java
index 6715e04..4a08661 100644
--- a/src/main/java/spark/Service.java
+++ b/src/main/java/spark/Service.java
@@ -336,7 +336,7 @@
      *
      * @param page the custom 500 internal server error page.
      */
-    public void internalServerError(String page) {
+    public synchronized void internalServerError(String page) {
         CustomErrorPages.add(500, page);
     }
 
@@ -350,7 +350,7 @@
     /**
      * Maps 500 internal server errors to the provided route.
      */
-    public void internalServerError(Route route) {
+    public synchronized void internalServerError(Route route) {
         CustomErrorPages.add(500, route);
     }
 
