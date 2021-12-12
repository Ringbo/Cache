diff --git a/src/java/org/apache/cassandra/service/DataResolver.java b/src/java/org/apache/cassandra/service/DataResolver.java
index 1c609b2..b0741da 100644
--- a/src/java/org/apache/cassandra/service/DataResolver.java
+++ b/src/java/org/apache/cassandra/service/DataResolver.java
@@ -661,8 +661,7 @@
                 if (null != lastClustering)
                     filter = filter.forPaging(metadata.comparator, lastClustering, false);
 
-                return SinglePartitionReadCommand.create(command.isForThrift(),
-                                                         command.metadata(),
+                return SinglePartitionReadCommand.create(command.metadata(),
                                                          command.nowInSec(),
                                                          command.columnFilter(),
                                                          command.rowFilter(),
