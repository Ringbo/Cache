diff --git a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ServiceResourceProvider.java b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ServiceResourceProvider.java
index 4decf5f..47bf921 100644
--- a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ServiceResourceProvider.java
+++ b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/enricher/ServiceResourceProvider.java
@@ -49,6 +49,6 @@
         KubernetesClient client = this.clientInstance.get();
         Session session = sessionInstance.get();
         String name = getServiceName(qualifiers);
-        return client.pods().inNamespace(session.getNamespace()).withName(name).get();
+        return client.services().inNamespace(session.getNamespace()).withName(name).get();
     }
 }
