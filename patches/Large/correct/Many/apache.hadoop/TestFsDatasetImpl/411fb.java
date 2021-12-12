diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/TestFsDatasetImpl.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/TestFsDatasetImpl.java
index 9cf437b..68f76dc 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/TestFsDatasetImpl.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/fsdataset/impl/TestFsDatasetImpl.java
@@ -683,7 +683,7 @@
         Assert.fail("This is not a valid code path. "
             + "out.close should have thrown an exception.");
       } catch (IOException ioe) {
-        GenericTestUtils.assertExceptionContains(info.toString(), ioe);
+        GenericTestUtils.assertExceptionContains(info.getXferAddr(), ioe);
       }
       finalizedDir.setWritable(true);
       finalizedDir.setExecutable(true);
