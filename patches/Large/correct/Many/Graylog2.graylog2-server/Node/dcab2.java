diff --git a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
index e76f579..f4a31ca 100644
--- a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
+++ b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
@@ -132,7 +132,7 @@
     public BufferInfo getBufferInfo() {
         try {
             return new BufferInfo(
-                    api.path(routes.BufferResource().utilization(), BuffersResponse.class)
+                    api.path(routes.BuffersResource().utilization(), BuffersResponse.class)
                             .node(this)
                             .execute());
         } catch (Exception e) {
@@ -143,7 +143,7 @@
 
     public BufferClassesResponse getBufferClasses() {
         try {
-            return api.path(routes.BufferResource().getBufferClasses(), BufferClassesResponse.class).node(this).execute();
+            return api.path(routes.BuffersResource().getBufferClasses(), BufferClassesResponse.class).node(this).execute();
         } catch (Exception e) {
             LOG.error("Unable to read buffer class names from node " + this, e);
         }
