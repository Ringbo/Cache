diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
index 7c8c702..36196bf 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
@@ -186,7 +186,7 @@
      * @param deploymentId The deployment to retrieve global service endpoint for
      * @return Empty if no global endpoint exist, otherwise the service endpoint ([clustername.]app.tenant.region.env)
      */
-    Optional<String> getCanonicalGlobalEndpoint(DeploymentId deploymentId) {
+    Optional<String> getCanonicalGlobalEndpoint(DeploymentId deploymentId) throws IOException {
         Map<String, RoutingEndpoint> hostToGlobalEndpoint = new HashMap<>();
         Map<String, String> hostToCanocicalEndpoint = new HashMap<>();
 
@@ -195,7 +195,7 @@
                 URI uri = new URI(endpoint.getEndpoint());
                 String serviceEndpoint = uri.getHost();
                 if (serviceEndpoint == null) {
-                    throw new RuntimeException("Unexpected endpoints returned from the Routing Generator");
+                    throw new IOException("Unexpected endpoints returned from the Routing Generator");
                 }
                 String canonicalEndpoint = serviceEndpoint.replaceAll(".vespa.yahooapis.com", "");
                 String hostname = endpoint.getHostname();
@@ -217,7 +217,7 @@
                     }
                 }
             } catch (URISyntaxException use) {
-                log.log(Level.INFO, use.getMessage());
+                throw new IOException(use);
             }
         }
 
