diff --git a/java/org/apache/tomcat/websocket/server/WsServerContainer.java b/java/org/apache/tomcat/websocket/server/WsServerContainer.java
index 6e97174..d2c824c 100644
--- a/java/org/apache/tomcat/websocket/server/WsServerContainer.java
+++ b/java/org/apache/tomcat/websocket/server/WsServerContainer.java
@@ -200,7 +200,9 @@
             if (!templateMatches.add(new TemplatePathMatch(sec, uriTemplate))) {
                 // Duplicate uriTemplate;
                 throw new DeploymentException(
-                        sm.getString("serverContainer.duplicatePaths", path));
+                        sm.getString("serverContainer.duplicatePaths", path,
+                                     sec.getEndpointClass(),
+                                     sec.getEndpointClass()));
             }
         } else {
             // Exact match
@@ -208,7 +210,9 @@
             if (old != null) {
                 // Duplicate path mappings
                 throw new DeploymentException(
-                        sm.getString("serverContainer.duplicatePaths", path));
+                        sm.getString("serverContainer.duplicatePaths", path,
+                                     old.getEndpointClass(),
+                                     sec.getEndpointClass()));
             }
         }
 
