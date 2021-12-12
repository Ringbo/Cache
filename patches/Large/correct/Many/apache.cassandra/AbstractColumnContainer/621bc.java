diff --git a/src/java/org/apache/cassandra/db/AbstractColumnContainer.java b/src/java/org/apache/cassandra/db/AbstractColumnContainer.java
index c184f9f..87e75eb 100644
--- a/src/java/org/apache/cassandra/db/AbstractColumnContainer.java
+++ b/src/java/org/apache/cassandra/db/AbstractColumnContainer.java
@@ -102,7 +102,7 @@
             // Stop if either we don't need to change the deletion info (it's
             // still MIN_VALUE or not expired yet) or we've succesfully changed it
             if (current.localDeletionTime == Integer.MIN_VALUE
-                || current.localDeletionTime > gcBefore
+                || current.localDeletionTime >= gcBefore
                 || deletionInfo.compareAndSet(current, new DeletionInfo()))
             {
                 break;
