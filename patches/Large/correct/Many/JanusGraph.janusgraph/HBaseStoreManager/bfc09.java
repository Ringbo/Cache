diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
index ecc0e20..9e75745 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
@@ -136,7 +136,7 @@
         features.supportsTransactions = false;
         features.supportsConsistentKeyOperations = true;
         features.supportsLocking = false;
-        features.isKeyOrdered = false;
+        features.isKeyOrdered = true;
         features.isDistributed = true;
         features.hasLocalKeyPartition = false;
     }
