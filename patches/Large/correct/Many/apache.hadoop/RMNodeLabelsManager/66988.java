diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/nodelabels/RMNodeLabelsManager.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/nodelabels/RMNodeLabelsManager.java
index 25e5bc09..696b99b 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/nodelabels/RMNodeLabelsManager.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/nodelabels/RMNodeLabelsManager.java
@@ -46,11 +46,11 @@
 
 public class RMNodeLabelsManager extends CommonNodeLabelsManager {
   protected static class Queue {
-    protected Set<String> acccessibleNodeLabels;
+    protected Set<String> accessibleNodeLabels;
     protected Resource resource;
 
     protected Queue() {
-      acccessibleNodeLabels =
+      accessibleNodeLabels =
           Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
       resource = Resource.newInstance(0, 0);
     }
@@ -98,7 +98,7 @@
       // check if any queue contains this label
       for (Entry<String, Queue> entry : queueCollections.entrySet()) {
         String queueName = entry.getKey();
-        Set<String> queueLabels = entry.getValue().acccessibleNodeLabels;
+        Set<String> queueLabels = entry.getValue().accessibleNodeLabels;
         if (queueLabels.contains(label)) {
           throw new IOException("Cannot remove label=" + label
               + ", because queue=" + queueName + " is using this label. "
@@ -275,7 +275,7 @@
           continue;
         }
 
-        q.acccessibleNodeLabels.addAll(labels);
+        q.accessibleNodeLabels.addAll(labels);
         for (Host host : nodeCollections.values()) {
           for (Entry<NodeId, Node> nentry : host.nms.entrySet()) {
             NodeId nodeId = nentry.getKey();
@@ -468,7 +468,7 @@
     }
 
     for (String label : nodeLabels) {
-      if (q.acccessibleNodeLabels.contains(label)) {
+      if (q.accessibleNodeLabels.contains(label)) {
         return true;
       }
     }
