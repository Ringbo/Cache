diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServerRunner.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServerRunner.java
index 5a38121..193a4a0 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServerRunner.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServerRunner.java
@@ -247,7 +247,7 @@
       setupServer();
       tserver.serve();
     } catch (Exception e) {
-      LOG.fatal("Cannot run ThriftServer");
+      LOG.fatal("Cannot run ThriftServer", e);
       // Crash the process if the ThriftServer is not running
       System.exit(-1);
     }
