diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 149387b..fcb8a9d 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -1985,7 +1985,7 @@
         Token parsedBeginToken = getPartitioner().getTokenFactory().fromString(beginToken);
         Token parsedEndToken = getPartitioner().getTokenFactory().fromString(endToken);
 
-        logger_.info("starting user-requested repair of range ({}, {}] for keyspace {} and column families {}",
+        logger.info("starting user-requested repair of range ({}, {}] for keyspace {} and column families {}",
                      new Object[] {parsedBeginToken, parsedEndToken, tableName, columnFamilies});
         AntiEntropyService.RepairFuture future = forceTableRepair(new Range<Token>(parsedBeginToken, parsedEndToken), tableName, isSequential, columnFamilies);
         if (future == null)
@@ -1996,7 +1996,7 @@
         }
         catch (Exception e)
         {
-            logger_.error("Repair session " + future.session.getName() + " failed.", e);
+            logger.error("Repair session " + future.session.getName() + " failed.", e);
         }
     }
 
