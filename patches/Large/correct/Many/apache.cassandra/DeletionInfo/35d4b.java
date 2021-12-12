diff --git a/src/java/org/apache/cassandra/db/DeletionInfo.java b/src/java/org/apache/cassandra/db/DeletionInfo.java
index 91af9fd..ce683d1 100644
--- a/src/java/org/apache/cassandra/db/DeletionInfo.java
+++ b/src/java/org/apache/cassandra/db/DeletionInfo.java
@@ -227,7 +227,7 @@
     public boolean mayModify(DeletionInfo delInfo)
     {
         return topLevel.markedForDeleteAt > delInfo.topLevel.markedForDeleteAt
-            || ranges == null;
+            || ranges != null;
     }
 
     @Override
