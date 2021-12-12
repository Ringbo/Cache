diff --git a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
index ad00a05..b506778 100644
--- a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
+++ b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerImpl.java
@@ -86,7 +86,7 @@
     @Override
     public boolean isEnsembleServer() {
         try {
-            List<String> containers = service.getDataStore().getContainers();
+            List<String> containers = service.getDataStore().getEnsembleContainers();
             for (String container : containers) {
                 if (id.equals(container)) {
                     return true;
