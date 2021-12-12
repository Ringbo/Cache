diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/AbstractEndPoint.java b/jetty-io/src/main/java/org/eclipse/jetty/io/AbstractEndPoint.java
index 0d00a17..8b33035 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/AbstractEndPoint.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/AbstractEndPoint.java
@@ -159,7 +159,7 @@
     protected void onIdleExpired(TimeoutException timeout)
     {
         Connection connection = _connection;
-        if (connection != null && !_connection.onIdleExpired())
+        if (connection != null && !connection.onIdleExpired())
             return;
 
         boolean output_shutdown=isOutputShutdown();
