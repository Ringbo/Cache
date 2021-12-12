diff --git a/src/main/java/org/apache/hadoop/hbase/mapreduce/TableRecordReaderImpl.java b/src/main/java/org/apache/hadoop/hbase/mapreduce/TableRecordReaderImpl.java
index 1647b02..a406839 100644
--- a/src/main/java/org/apache/hadoop/hbase/mapreduce/TableRecordReaderImpl.java
+++ b/src/main/java/org/apache/hadoop/hbase/mapreduce/TableRecordReaderImpl.java
@@ -174,7 +174,7 @@
     } catch (DoNotRetryIOException e) {
       throw e;
     } catch (IOException e) {
-      LOG.debug("recovered from " + StringUtils.stringifyException(e));
+      LOG.info("recovered from " + StringUtils.stringifyException(e));
       if (lastSuccessfulRow == null) {
         LOG.warn("We are restarting the first next() invocation," +
             " if your mapper's restarted a few other times like this" +
