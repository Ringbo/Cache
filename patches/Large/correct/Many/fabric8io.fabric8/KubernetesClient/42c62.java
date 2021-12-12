diff --git a/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/KubernetesClient.java b/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/KubernetesClient.java
index 2d7a308..3ec00a0 100644
--- a/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/KubernetesClient.java
+++ b/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/KubernetesClient.java
@@ -1266,21 +1266,21 @@
         return watchOpenShiftEntities("routes", namespace, labels, watcher, resourceVersion);
     }
 
-    public WebSocketClient watchDeploymentConfigs(Watcher<Route> watcher) throws Exception {
+    public WebSocketClient watchDeploymentConfigs(Watcher<DeploymentConfig> watcher) throws Exception {
         return watchDeploymentConfigs(null, watcher);
     }
 
-    public WebSocketClient watchDeploymentConfigs(Map<String, String> labels, Watcher<Route> watcher) throws Exception {
+    public WebSocketClient watchDeploymentConfigs(Map<String, String> labels, Watcher<DeploymentConfig> watcher) throws Exception {
         return watchDeploymentConfigs(getNamespace(), labels, watcher);
     }
 
-    public WebSocketClient watchDeploymentConfigs(String namespace, Map<String, String> labels, Watcher<Route> watcher) throws Exception {
+    public WebSocketClient watchDeploymentConfigs(String namespace, Map<String, String> labels, Watcher<DeploymentConfig> watcher) throws Exception {
         DeploymentConfigList currentList = getDeploymentConfigs(namespace);
         return watchDeploymentConfigs(namespace, labels, watcher,
                 currentList.getMetadata().getResourceVersion());
     }
 
-    public WebSocketClient watchDeploymentConfigs(String namespace, Map<String, String> labels, Watcher<Route> watcher, String resourceVersion) throws Exception {
+    public WebSocketClient watchDeploymentConfigs(String namespace, Map<String, String> labels, Watcher<DeploymentConfig> watcher, String resourceVersion) throws Exception {
         return watchOpenShiftEntities("deploymentconfigs", namespace, labels, watcher, resourceVersion);
     }
 
