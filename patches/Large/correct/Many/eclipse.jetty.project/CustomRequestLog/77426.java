diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/CustomRequestLog.java b/jetty-server/src/main/java/org/eclipse/jetty/server/CustomRequestLog.java
index 0f769c7..cd80f08 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/CustomRequestLog.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/CustomRequestLog.java
@@ -307,7 +307,7 @@
 
     public CustomRequestLog(String file)
     {
-        this(file, NCSA_FORMAT);
+        this(file, EXTENDED_NCSA_FORMAT);
     }
 
     public CustomRequestLog(String file, String format)
