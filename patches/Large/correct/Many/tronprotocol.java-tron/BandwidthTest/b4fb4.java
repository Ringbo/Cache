diff --git a/src/test/java/org/tron/core/BandwidthTest.java b/src/test/java/org/tron/core/BandwidthTest.java
index 1a80a54..898995e 100755
--- a/src/test/java/org/tron/core/BandwidthTest.java
+++ b/src/test/java/org/tron/core/BandwidthTest.java
@@ -153,12 +153,12 @@
     ownerCapsule.setFrozen(10_000_000L, 0L);
 
     Assert.assertEquals(true, processor.contractCreateNewAccount(contract));
-    long bytes = trx.getSerializedSize();
+    long bytes = trx.getInstance().getRawData().getSerializedSize();
     processor.consumeBandwidthForCreateNewAccount(ownerCapsule, bytes, 1526647838000L);
 
     AccountCapsule ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
-    Assert.assertEquals(122L, ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(120L, ownerCapsuleNew.getNetUsage());
 
   }
 
@@ -180,10 +180,10 @@
     AccountCapsule ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(122L, ownerCapsuleNew.getFreeNetUsage());
+    Assert.assertEquals(120L, ownerCapsuleNew.getFreeNetUsage());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestConsumeFreeTime());//slot
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
-    Assert.assertEquals(122L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
+    Assert.assertEquals(120L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
     Assert.assertEquals(508882612L, dbManager.getDynamicPropertiesStore().getPublicNetTime());
     Assert.assertEquals(0L, ret.getFee());
 
@@ -193,11 +193,11 @@
     ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getFreeNetUsage());
+    Assert.assertEquals(60L + 120L, ownerCapsuleNew.getFreeNetUsage());
     Assert.assertEquals(508897012L,
         ownerCapsuleNew.getLatestConsumeFreeTime()); // 508882612L + 28800L/2
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
-    Assert.assertEquals(61L + 122L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
+    Assert.assertEquals(60L + 120L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
     Assert.assertEquals(508897012L, dbManager.getDynamicPropertiesStore().getPublicNetTime());
     Assert.assertEquals(0L, ret.getFee());
   }
@@ -228,11 +228,11 @@
     AccountCapsule assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(122L, assetCapsuleNew.getNetUsage());
+    Assert.assertEquals(120L, assetCapsuleNew.getNetUsage());
     Assert.assertEquals(508882612L, assetCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestAssetOperationTime(ASSET_NAME));
-    Assert.assertEquals(122L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
+    Assert.assertEquals(120L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
     Assert.assertEquals(0L, ret.getFee());
 
     dbManager.getDynamicPropertiesStore().saveLatestBlockHeaderTimestamp(1526691038000L); // + 12h
@@ -244,11 +244,11 @@
     assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(61L + 122L, assetCapsuleNew.getNetUsage());
+    Assert.assertEquals(60L + 120L, assetCapsuleNew.getNetUsage());
     Assert.assertEquals(508897012L, assetCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508897012L, ownerCapsuleNew.getLatestAssetOperationTime(ASSET_NAME));
-    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
+    Assert.assertEquals(60L + 120L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
     Assert.assertEquals(0L, ret.getFee());
 
   }
@@ -277,7 +277,7 @@
     AccountCapsule assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(122L, ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(120L, ownerCapsuleNew.getNetUsage());
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(0L, ret.getFee());
@@ -289,7 +289,7 @@
     ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(60L + 120L, ownerCapsuleNew.getNetUsage());
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508897012L, ownerCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(0L, ret.getFee());
@@ -317,7 +317,7 @@
     AccountCapsule ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    long transactionFee = 122L * dbManager.getDynamicPropertiesStore().getTransactionFee();
+    long transactionFee = 120L * dbManager.getDynamicPropertiesStore().getTransactionFee();
     Assert.assertEquals(transactionFee,
         dbManager.getDynamicPropertiesStore().getTotalTransactionCost());
     Assert.assertEquals(
@@ -335,7 +335,7 @@
         dbManager.getDynamicPropertiesStore().getTotalCreateAccountCost());
     Assert.assertEquals(
         10_000_000L - transactionFee - createAccountFee, ownerCapsuleNew.getBalance());
-    Assert.assertEquals(101220L, ret.getFee());
+    Assert.assertEquals(101200L, ret.getFee());
 
   }
 
