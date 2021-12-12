diff --git a/src/test/java/org/tron/core/db/ManagerTest.java b/src/test/java/org/tron/core/db/ManagerTest.java
index 3aa9027..e8bb684 100755
--- a/src/test/java/org/tron/core/db/ManagerTest.java
+++ b/src/test/java/org/tron/core/db/ManagerTest.java
@@ -310,7 +310,7 @@
 
     BlockCapsule blockCapsule1 =
         createTestBlockCapsule(
-            1533529947843L + 3000,
+            1533529947843L + 3001,
             num + 1,
             dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
             addressToProvateKeys);
@@ -347,7 +347,7 @@
     }
 
     BlockCapsule blockCapsule3 =
-        createTestBlockCapsule(
+        createTestBlockCapsule(1533529947843L + 9000,
             dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1,
             dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(), addressToProvateKeys);
     logger.info("******block3:" + blockCapsule3);
@@ -359,7 +359,7 @@
         dbManager.getBlockStore().get(dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getBytes()).getBlockId());
 
     BlockCapsule blockCapsule4 =
-        createTestBlockCapsule(
+        createTestBlockCapsule(1533529947843L + 12000,
             dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1,
             blockCapsule3.getBlockId().getByteString(), addressToProvateKeys);
     logger.info("******block4:" + blockCapsule4);
