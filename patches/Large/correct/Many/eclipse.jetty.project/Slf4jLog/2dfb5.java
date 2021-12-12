diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/log/Slf4jLog.java b/jetty-util/src/main/java/org/eclipse/jetty/util/log/Slf4jLog.java
index 4c2cdf2..dc7fd26 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/log/Slf4jLog.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/log/Slf4jLog.java
@@ -127,7 +127,7 @@
     {
         if (Log.isIgnored())
         {
-            warn(Log.IGNORED, ignored);
+            debug(Log.IGNORED, ignored);
         }
     }
 
