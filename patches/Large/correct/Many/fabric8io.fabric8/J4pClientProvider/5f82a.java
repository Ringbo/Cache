diff --git a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/J4pClientProvider.java b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/J4pClientProvider.java
index b5b5afa..cb203ef 100644
--- a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/J4pClientProvider.java
+++ b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/J4pClientProvider.java
@@ -73,7 +73,7 @@
         }
 
         if (Strings.isNotBlank(replicationControllerName)) {
-            ReplicationController replicationController = client.replicationControllers().inNamespace(session.getNamespace()).withName(serviceName).get();
+            ReplicationController replicationController = client.replicationControllers().inNamespace(session.getNamespace()).withName(replicationControllerName).get();
             if (replicationController != null) {
                 return jolokiaClients.clientForReplicationController(replicationController);
             }
