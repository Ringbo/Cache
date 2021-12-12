diff --git a/src/jvm/backtype/storm/scheduler/Cluster.java b/src/jvm/backtype/storm/scheduler/Cluster.java
index b94bfdd..d268831 100644
--- a/src/jvm/backtype/storm/scheduler/Cluster.java
+++ b/src/jvm/backtype/storm/scheduler/Cluster.java
@@ -33,7 +33,7 @@
         for (String nodeId : supervisors.keySet()) {
             SupervisorDetails supervisor = supervisors.get(nodeId);
             String host = supervisor.getHost();
-            if (!this.supervisors.containsKey(host)) {
+            if (!this.hostToId.containsKey(host)) {
                 this.hostToId.put(host, new ArrayList<String>());
             }
             this.hostToId.get(host).add(nodeId);
