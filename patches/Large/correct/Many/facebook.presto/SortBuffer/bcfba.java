diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/util/SortBuffer.java b/presto-hive/src/main/java/com/facebook/presto/hive/util/SortBuffer.java
index 110ea49..cce1eaf 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/util/SortBuffer.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/util/SortBuffer.java
@@ -85,7 +85,7 @@
     {
         checkState(canAdd(page), "page buffer is full");
         pages.add(page);
-        usedMemoryBytes += page.getSizeInBytes();
+        usedMemoryBytes += page.getRetainedSizeInBytes();
         rowCount = addExact(rowCount, page.getPositionCount());
     }
 
