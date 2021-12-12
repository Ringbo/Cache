diff --git a/core/src/main/java/org/elasticsearch/action/admin/cluster/node/tasks/list/ListTasksResponse.java b/core/src/main/java/org/elasticsearch/action/admin/cluster/node/tasks/list/ListTasksResponse.java
index 605ce1f..87b4011 100644
--- a/core/src/main/java/org/elasticsearch/action/admin/cluster/node/tasks/list/ListTasksResponse.java
+++ b/core/src/main/java/org/elasticsearch/action/admin/cluster/node/tasks/list/ListTasksResponse.java
@@ -199,6 +199,6 @@
 
     @Override
     public String toString() {
-        return Strings.toString(this);
+        return Strings.toString(this, true);
     }
 }
