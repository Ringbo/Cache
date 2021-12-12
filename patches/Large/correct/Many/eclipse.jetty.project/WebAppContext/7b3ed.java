diff --git a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
index 48d6334..730a787 100644
--- a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
+++ b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
@@ -376,7 +376,7 @@
             _configurations=null;
             
             // restore security handler
-            if (_securityHandler.getHandler()==null)
+            if (_securityHandler != null && _securityHandler.getHandler()==null)
             {
                 _sessionHandler.setHandler(_securityHandler);
                 _securityHandler.setHandler(_servletHandler);
