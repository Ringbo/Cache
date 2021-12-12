diff --git a/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManagerMXBean.java b/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManagerMXBean.java
index f573827..76cd155 100644
--- a/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManagerMXBean.java
+++ b/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManagerMXBean.java
@@ -25,7 +25,7 @@
      * Takes the blob of Kubernetes JSON (pod, replication controller, service, config, template etc)
      * and applies it to the runtime environment so that any changes or new items take effect
      */
-    String apply(String json) throws IOException;
+    String apply(String json) throws Exception;
 
     String getServiceUrl(String serviceName);
 
