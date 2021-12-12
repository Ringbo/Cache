diff --git a/ambari-server/src/main/java/org/apache/ambari/server/stack/ServiceModule.java b/ambari-server/src/main/java/org/apache/ambari/server/stack/ServiceModule.java
index 452d3dd..c783676 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/stack/ServiceModule.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/stack/ServiceModule.java
@@ -104,7 +104,8 @@
       serviceInfo.setVersion(parent.getVersion());
     }
 
-    if (serviceInfo.getRequiredServices() == null) {
+    if (serviceInfo.getRequiredServices() == null
+        || serviceInfo.getRequiredServices().size() == 0) {
       serviceInfo.setRequiredServices(parent.getRequiredServices() != null ?
           parent.getRequiredServices() :
           Collections.<String>emptyList());
