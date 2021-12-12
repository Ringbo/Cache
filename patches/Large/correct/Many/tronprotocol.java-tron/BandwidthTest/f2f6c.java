diff --git a/src/test/java/org/tron/core/BandwidthTest.java b/src/test/java/org/tron/core/BandwidthTest.java
index 62c53f8..63178bd 100755
--- a/src/test/java/org/tron/core/BandwidthTest.java
+++ b/src/test/java/org/tron/core/BandwidthTest.java
@@ -153,7 +153,7 @@
 
     AccountCapsule ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
-    Assert.assertEquals(processor.getCreateNewAccountCost(), ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(ChainConstant.CREATE_NEW_ACCOUNT_COST, ownerCapsuleNew.getNetUsage());
 
   }
 
@@ -174,10 +174,10 @@
     AccountCapsule ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(118L, ownerCapsuleNew.getFreeNetUsage());
+    Assert.assertEquals(122L, ownerCapsuleNew.getFreeNetUsage());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestConsumeFreeTime());//slot
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
-    Assert.assertEquals(118L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
+    Assert.assertEquals(122L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
     Assert.assertEquals(508882612L, dbManager.getDynamicPropertiesStore().getPublicNetTime());
 
     dbManager.getDynamicPropertiesStore().saveLatestBlockHeaderTimestamp(1526691038000L); // + 12h
@@ -186,11 +186,11 @@
     ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(59L + 118L, ownerCapsuleNew.getFreeNetUsage());
+    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getFreeNetUsage());
     Assert.assertEquals(508897012L,
         ownerCapsuleNew.getLatestConsumeFreeTime()); // 508882612L + 28800L/2
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
-    Assert.assertEquals(59L + 118L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
+    Assert.assertEquals(61L + 122L, dbManager.getDynamicPropertiesStore().getPublicNetUsage());
     Assert.assertEquals(508897012L, dbManager.getDynamicPropertiesStore().getPublicNetTime());
   }
 
@@ -219,11 +219,11 @@
     AccountCapsule assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(118L, assetCapsuleNew.getNetUsage());
+    Assert.assertEquals(122L, assetCapsuleNew.getNetUsage());
     Assert.assertEquals(508882612L, assetCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestAssetOperationTime(ASSET_NAME));
-    Assert.assertEquals(118L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
+    Assert.assertEquals(122L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
 
     dbManager.getDynamicPropertiesStore().saveLatestBlockHeaderTimestamp(1526691038000L); // + 12h
 
@@ -234,11 +234,11 @@
     assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(59L + 118L, assetCapsuleNew.getNetUsage());
+    Assert.assertEquals(61L + 122L, assetCapsuleNew.getNetUsage());
     Assert.assertEquals(508897012L, assetCapsuleNew.getLatestConsumeTime());
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508897012L, ownerCapsuleNew.getLatestAssetOperationTime(ASSET_NAME));
-    Assert.assertEquals(59L + 118L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
+    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getFreeAssetNetUsage(ASSET_NAME));
 
   }
 
@@ -265,7 +265,7 @@
     AccountCapsule assetCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(ASSET_ADDRESS));
 
-    Assert.assertEquals(118L, ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(122L, ownerCapsuleNew.getNetUsage());
     Assert.assertEquals(1526647838000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508882612L, ownerCapsuleNew.getLatestConsumeTime());
 
@@ -276,7 +276,7 @@
     ownerCapsuleNew = dbManager.getAccountStore()
         .get(ByteArray.fromHexString(OWNER_ADDRESS));
 
-    Assert.assertEquals(59L + 118L, ownerCapsuleNew.getNetUsage());
+    Assert.assertEquals(61L + 122L, ownerCapsuleNew.getNetUsage());
     Assert.assertEquals(1526691038000L, ownerCapsuleNew.getLatestOperationTime());
     Assert.assertEquals(508897012L, ownerCapsuleNew.getLatestConsumeTime());
 
