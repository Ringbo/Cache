diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/log/StdErrLog.java b/jetty-util/src/main/java/org/eclipse/jetty/util/log/StdErrLog.java
index 7ef4645..d32b67b 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/log/StdErrLog.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/log/StdErrLog.java
@@ -62,7 +62,7 @@
 
         try
         {
-            _debug = Boolean.parseBoolean(System.getProperty(name + ".DEBUG",Boolean.toString(__debug)));
+            _debug = Boolean.parseBoolean(System.getProperty(_name + ".DEBUG",Boolean.toString(__debug)));
         }
         catch (AccessControlException ace)
         {
