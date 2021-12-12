diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
index 12244d4..ef4ec31 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
@@ -707,7 +707,7 @@
         if (_contextPath == null)
             throw new IllegalStateException("Null contextPath");
 
-        if (_logger!=null)
+        if (_logger==null)
             _logger = Log.getLogger(getDisplayName() == null?getContextPath():getDisplayName());
         ClassLoader old_classloader = null;
         Thread current_thread = null;
