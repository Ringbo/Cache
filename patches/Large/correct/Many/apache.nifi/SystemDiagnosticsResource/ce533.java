diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/SystemDiagnosticsResource.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/SystemDiagnosticsResource.java
index 8d6229f..cbe6cf7 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/SystemDiagnosticsResource.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/SystemDiagnosticsResource.java
@@ -122,7 +122,7 @@
             throw new IllegalArgumentException("Nodewise requests cannot be directed at a specific node.");
         }
 
-        if (isConnectedToCluster()) {
+        if (isReplicateRequest()) {
             // determine where this request should be sent
             if (clusterNodeId == null) {
                 final NodeResponse nodeResponse = getRequestReplicator().replicate(HttpMethod.GET, getAbsolutePath(), getRequestParameters(true), getHeaders()).awaitMergedResponse();
