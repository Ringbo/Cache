diff --git a/webapps/examples/WEB-INF/classes/async/Stockticker.java b/webapps/examples/WEB-INF/classes/async/Stockticker.java
index a0e5563..9b9d046 100644
--- a/webapps/examples/WEB-INF/classes/async/Stockticker.java
+++ b/webapps/examples/WEB-INF/classes/async/Stockticker.java
@@ -40,7 +40,7 @@
             try {
                 ticker.join();
             }catch (InterruptedException x) {
-                ticker.interrupted();
+                Thread.interrupted();
             }
             
             ticker = null;
