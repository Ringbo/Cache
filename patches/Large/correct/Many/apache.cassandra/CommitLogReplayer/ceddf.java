diff --git a/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java b/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
index 3bc0f87..213771d 100644
--- a/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
+++ b/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
@@ -239,7 +239,7 @@
         try
         {
             assert reader.length() <= Integer.MAX_VALUE;
-            int offset = getStartOffset(segmentId, desc.getMessagingVersion());
+            int offset = getStartOffset(segmentId, desc.getVersion());
             if (offset < 0)
             {
                 logger.debug("skipping replay of fully-flushed {}", file);
