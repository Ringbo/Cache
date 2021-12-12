diff --git a/redisson/src/test/java/org/redisson/ClusterRunner.java b/redisson/src/test/java/org/redisson/ClusterRunner.java
index 9ac8bec..69af593 100644
--- a/redisson/src/test/java/org/redisson/ClusterRunner.java
+++ b/redisson/src/test/java/org/redisson/ClusterRunner.java
@@ -86,7 +86,7 @@
             sb.append(me.equals(nodeAddr)
                     ? "myself,"
                     : "");
-            boolean isMaster = !masters.containsKey(nodeId);
+            boolean isMaster = !slaveMasters.containsKey(nodeId);
             if (isMaster) {
                  sb.append("master -");
             } else {
