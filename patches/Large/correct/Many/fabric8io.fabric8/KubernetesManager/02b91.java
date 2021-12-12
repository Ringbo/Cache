diff --git a/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManager.java b/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManager.java
index 57710a8..7ccd391 100644
--- a/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManager.java
+++ b/components/kubernetes-mbeans/src/main/java/io/fabric8/kubernetes/mbeans/KubernetesManager.java
@@ -62,7 +62,7 @@
     }
 
     @Override
-    public String apply(String json) throws IOException {
+    public String apply(String json) throws Exception {
         Controller controller = createController();
         return controller.applyJson(json);
     }
