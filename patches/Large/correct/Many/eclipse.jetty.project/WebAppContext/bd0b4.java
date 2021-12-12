diff --git a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
index e941b6a..001a5f6 100644
--- a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
+++ b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/WebAppContext.java
@@ -606,7 +606,7 @@
         {
             String displayName = getDisplayName();
             if (displayName == null)
-                displayName = "WebApp@"+connectors.hashCode();
+                displayName = "WebApp@"+Arrays.hashCode(connectors);
 
             LOG.info(displayName + " at http://" + connectors[i].toString() + getContextPath());
         }
