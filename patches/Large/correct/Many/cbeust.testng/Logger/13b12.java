diff --git a/src/main/java/org/testng/log4testng/Logger.java b/src/main/java/org/testng/log4testng/Logger.java
index 518c122..1f9948a 100755
--- a/src/main/java/org/testng/log4testng/Logger.java
+++ b/src/main/java/org/testng/log4testng/Logger.java
@@ -424,7 +424,7 @@
         return level.intValue();
       }
       int dot= name.lastIndexOf('.');
-      if(dot != -1) {
+      if(dot == -1) {
         loglog4testng("Found level " + rootLoggerLevel + " for root logger");
 
         // Logger name not found. Defaults to root logger level.
