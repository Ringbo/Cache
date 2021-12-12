diff --git a/test/long/org/apache/cassandra/db/commitlog/CommitLogStressTest.java b/test/long/org/apache/cassandra/db/commitlog/CommitLogStressTest.java
index ba8896f..f5fd2cf 100644
--- a/test/long/org/apache/cassandra/db/commitlog/CommitLogStressTest.java
+++ b/test/long/org/apache/cassandra/db/commitlog/CommitLogStressTest.java
@@ -161,7 +161,7 @@
     @Test
     public void testRandomSize() throws Exception
     {
-        randomSize = false;
+        randomSize = true;
         discardedRun = false;
         testAllLogConfigs();
     }
