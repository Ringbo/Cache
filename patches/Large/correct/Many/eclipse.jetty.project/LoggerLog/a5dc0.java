diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/log/LoggerLog.java b/jetty-util/src/main/java/org/eclipse/jetty/util/log/LoggerLog.java
index d4a7d41..99ed99c 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/log/LoggerLog.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/log/LoggerLog.java
@@ -206,7 +206,7 @@
     {
         if (Log.isIgnored())
         {
-            warn(Log.IGNORED, ignored);
+            debug(Log.IGNORED, ignored);
         }
     }
 
