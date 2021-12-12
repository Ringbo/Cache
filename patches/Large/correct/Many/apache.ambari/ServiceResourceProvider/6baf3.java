diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/ServiceResourceProvider.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/ServiceResourceProvider.java
index 99a81c1..a1c53a7 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/ServiceResourceProvider.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/ServiceResourceProvider.java
@@ -781,7 +781,7 @@
           if ( ambariMetaInfo.getComponent(
               sid.getStackName(), sid.getStackVersion(), sc.getServiceName(),
               sch.getServiceComponentName()).isMaster()) {
-            throw new AmbariException(error);
+            throw new IllegalArgumentException(error);
           } else {
             LOG.warn("Ignoring: " + error);
             continue;
