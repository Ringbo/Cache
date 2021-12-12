diff --git a/fabric-agent/src/main/java/org/fusesource/fabric/agent/DeploymentAgent.java b/fabric-agent/src/main/java/org/fusesource/fabric/agent/DeploymentAgent.java
index 68a3f79..1f94a66 100644
--- a/fabric-agent/src/main/java/org/fusesource/fabric/agent/DeploymentAgent.java
+++ b/fabric-agent/src/main/java/org/fusesource/fabric/agent/DeploymentAgent.java
@@ -275,7 +275,7 @@
         for (Feature dep : feature.getDependencies()) {
             Feature f = search(dep.getName(), dep.getVersion(), repositories);
             if (f == null) {
-                throw new IllegalArgumentException("Unable to find feature " + feature.getName() + "/" + feature.getVersion());
+                throw new IllegalArgumentException("Unable to find feature " + dep.getName() + "/" + dep.getVersion());
             }
             addFeatures(set, f, repositories);
         }
