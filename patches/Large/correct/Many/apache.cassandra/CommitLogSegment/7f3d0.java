diff --git a/src/java/org/apache/cassandra/db/commitlog/CommitLogSegment.java b/src/java/org/apache/cassandra/db/commitlog/CommitLogSegment.java
index c87b328..78ba824 100644
--- a/src/java/org/apache/cassandra/db/commitlog/CommitLogSegment.java
+++ b/src/java/org/apache/cassandra/db/commitlog/CommitLogSegment.java
@@ -316,7 +316,7 @@
             if (nextMarker < buffer.capacity())
             {
                 buffer.putInt(nextMarker, 0);
-                buffer.putLong(nextMarker + 4, 0);
+                buffer.putInt(nextMarker + 4, 0);
             }
 
             // actually perform the sync and signal those waiting for it
