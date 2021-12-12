diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/jgroups/JgroupsDiscovery.java b/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/jgroups/JgroupsDiscovery.java
index fadcb9e..357a3b0 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/jgroups/JgroupsDiscovery.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/jgroups/JgroupsDiscovery.java
@@ -363,7 +363,7 @@
         ByteArrayDataOutputStream os = new ByteArrayDataOutputStream();
         localNode.writeTo(os);
         os.close();
-        return os.unsafeByteArray();
+        return os.copiedByteArray();
     }
 
     private void sendInitialStateEventIfNeeded() {
