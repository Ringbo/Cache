diff --git a/src/java/org/apache/cassandra/streaming/StreamTransferTask.java b/src/java/org/apache/cassandra/streaming/StreamTransferTask.java
index 86f4ee2..7d0cc87 100644
--- a/src/java/org/apache/cassandra/streaming/StreamTransferTask.java
+++ b/src/java/org/apache/cassandra/streaming/StreamTransferTask.java
@@ -58,7 +58,7 @@
      *
      * @param sequenceNumber sequence number of file
      */
-    public void complete(int sequenceNumber)
+    public synchronized void complete(int sequenceNumber)
     {
         OutgoingFileMessage file = files.remove(sequenceNumber);
         if (file != null)
@@ -117,7 +117,7 @@
      * @param unit unit of given time
      * @return scheduled future for timeout task
      */
-    public ScheduledFuture scheduleTimeout(final int sequenceNumber, long time, TimeUnit unit)
+    public synchronized ScheduledFuture scheduleTimeout(final int sequenceNumber, long time, TimeUnit unit)
     {
         if (timeoutExecutor.isShutdown())
             return null;
