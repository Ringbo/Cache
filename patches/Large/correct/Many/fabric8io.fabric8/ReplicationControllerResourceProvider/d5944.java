diff --git a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ReplicationControllerResourceProvider.java b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ReplicationControllerResourceProvider.java
index cc51709..5799c79 100644
--- a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ReplicationControllerResourceProvider.java
+++ b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ReplicationControllerResourceProvider.java
@@ -49,6 +49,6 @@
         KubernetesClient client = this.clientInstance.get();
         Session session = sessionInstance.get();
         String name = getReplicationControllerName(qualifiers);
-        return client.pods().inNamespace(session.getNamespace()).withName(name).get();
+        return client.replicationControllers().inNamespace(session.getNamespace()).withName(name).get();
     }
 }
