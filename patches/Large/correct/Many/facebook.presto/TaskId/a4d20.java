diff --git a/presto-main/src/main/java/com/facebook/presto/execution/TaskId.java b/presto-main/src/main/java/com/facebook/presto/execution/TaskId.java
index fe176a6..2c3f01c 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/TaskId.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/TaskId.java
@@ -86,7 +86,7 @@
         if (obj == null || getClass() != obj.getClass()) {
             return false;
         }
-        final TaskId other = (TaskId) obj;
+        TaskId other = (TaskId) obj;
         return Objects.equal(this.fullId, other.fullId);
     }
 }
