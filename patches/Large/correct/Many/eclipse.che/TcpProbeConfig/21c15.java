diff --git a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/hc/probe/TcpProbeConfig.java b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/hc/probe/TcpProbeConfig.java
index 1a648bd..e9abaca 100644
--- a/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/hc/probe/TcpProbeConfig.java
+++ b/wsmaster/che-core-api-workspace/src/main/java/org/eclipse/che/api/workspace/server/hc/probe/TcpProbeConfig.java
@@ -36,7 +36,7 @@
     super(successThreshold, failureThreshold, timeoutSeconds, periodSeconds, initialDelaySeconds);
     if (port < 0) {
       throw new IllegalArgumentException(
-          "Port '" + timeoutSeconds + "' is illegal. Port should not be less than 0");
+          "Port '" + port + "' is illegal. Port should not be less than 0");
     }
     this.port = port;
     if (isNullOrEmpty(host)) {
