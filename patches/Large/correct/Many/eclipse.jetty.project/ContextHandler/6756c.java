diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
index 570067b..e0ad4f2 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/handler/ContextHandler.java
@@ -530,7 +530,7 @@
         _requestAttributeListeners.clear();
 
         if (eventListeners!=null)
-            for (EventListener listener : _eventListeners)
+            for (EventListener listener : eventListeners)
                 addEventListener(listener);
     }
 
