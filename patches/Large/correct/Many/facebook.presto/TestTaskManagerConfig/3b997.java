diff --git a/presto-main/src/test/java/com/facebook/presto/execution/TestTaskManagerConfig.java b/presto-main/src/test/java/com/facebook/presto/execution/TestTaskManagerConfig.java
index 7819961..2afa00f 100644
--- a/presto-main/src/test/java/com/facebook/presto/execution/TestTaskManagerConfig.java
+++ b/presto-main/src/test/java/com/facebook/presto/execution/TestTaskManagerConfig.java
@@ -97,7 +97,7 @@
                 .setInfoMaxAge(new Duration(22, TimeUnit.MINUTES))
                 .setClientTimeout(new Duration(10, TimeUnit.SECONDS))
                 .setSinkMaxBufferSize(new DataSize(42, Unit.MEGABYTE))
-                .setMaxPagePartitioningBufferSize(new DataSize(42, Unit.MEGABYTE))
+                .setMaxPagePartitioningBufferSize(new DataSize(40, Unit.MEGABYTE))
                 .setWriterCount(3)
                 .setTaskDefaultConcurrency(7)
                 .setTaskJoinConcurrency(8)
