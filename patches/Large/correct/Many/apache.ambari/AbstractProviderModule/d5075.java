diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/AbstractProviderModule.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/AbstractProviderModule.java
index e5e10ef..fb14a3b 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/AbstractProviderModule.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/AbstractProviderModule.java
@@ -664,17 +664,17 @@
       }
 
     } catch (Exception e) {
-      LOG.error("Exception while detecting JMX protocol for clusterName = " + clusterName +
+      LOG.info("Exception while detecting JMX protocol for clusterName = " + clusterName +
           ", componentName = " + componentName,  e);
-      LOG.error("Defaulting JMX to HTTP protocol for  for clusterName = " + clusterName +
+      LOG.info("Defaulting JMX to HTTP protocol for  for clusterName = " + clusterName +
           ", componentName = " + componentName +
           componentName);
       jmxProtocolString = "http";
     }
     if (jmxProtocolString == null) {
-      LOG.error("Detected JMX protocol is null for clusterName = " + clusterName +
+      LOG.debug("Detected JMX protocol is null for clusterName = " + clusterName +
           ", componentName = " + componentName);
-      LOG.error("Defaulting JMX to HTTP protocol for  for clusterName = " + clusterName +
+      LOG.debug("Defaulting JMX to HTTP protocol for  for clusterName = " + clusterName +
           ", componentName = " + componentName +
           componentName);
       jmxProtocolString = "http";
