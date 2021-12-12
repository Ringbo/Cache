diff --git a/lucene/replicator/src/java/org/apache/lucene/replicator/nrt/ReplicaNode.java b/lucene/replicator/src/java/org/apache/lucene/replicator/nrt/ReplicaNode.java
index ff82d18..853446b 100644
--- a/lucene/replicator/src/java/org/apache/lucene/replicator/nrt/ReplicaNode.java
+++ b/lucene/replicator/src/java/org/apache/lucene/replicator/nrt/ReplicaNode.java
@@ -497,7 +497,7 @@
 
     if (version < curVersion) {
       // This can happen, if two syncs happen close together, and due to thread scheduling, the incoming older version runs after the newer version
-      message("top: new NRT point (version=" + version + ") is older than current (version=" + version + "); skipping");
+      message("top: new NRT point (version=" + version + ") is older than current (version=" + curVersion + "); skipping");
       return null;
     }
 
