diff --git a/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java b/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
index 3a9f5e6..55bdf07 100644
--- a/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
+++ b/src/java/org/apache/cassandra/db/commitlog/CommitLogReplayer.java
@@ -105,7 +105,7 @@
         {
             Runnable runnable = new WrappedRunnable()
             {
-                public void runMayThrow() throws IOException
+                public void runMayThrow() throws ExecutionException
                 {
                     if (Schema.instance.getKSMetaData(mutation.getKeyspaceName()) == null)
                         return;
