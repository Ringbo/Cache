diff --git a/src/main/java/org/tron/core/db/BandwidthProcessor.java b/src/main/java/org/tron/core/db/BandwidthProcessor.java
index 060bfbb..c852705 100644
--- a/src/main/java/org/tron/core/db/BandwidthProcessor.java
+++ b/src/main/java/org/tron/core/db/BandwidthProcessor.java
@@ -223,7 +223,7 @@
     AssetIssueCapsule assetIssueCapsule;
     assetIssueCapsule = dbManager.getAssetIssueStoreFinal().get(assetName.toByteArray());
     String tokenName = ByteArray.toStr(assetName.toByteArray());
-    String tokenID = Long.toString(assetIssueCapsule.getId());
+    String tokenID = assetIssueCapsule.getId();
 
     if (assetIssueCapsule == null) {
       throw new ContractValidateException("asset not exists");
@@ -250,9 +250,9 @@
     long freeAssetNetUsage, latestAssetOperationTime;
     if (dbManager.getDynamicPropertiesStore().getAllowSameTokenName() == 0) {
       freeAssetNetUsage = accountCapsule
-          .getFreeAssetNetUsage(tokenID);
+          .getFreeAssetNetUsage(tokenName);
       latestAssetOperationTime = accountCapsule
-          .getLatestAssetOperationTime(tokenID);
+          .getLatestAssetOperationTime(tokenName);
     } else {
       freeAssetNetUsage = accountCapsule.getFreeAssetNetUsageV2(tokenID);
       latestAssetOperationTime = accountCapsule.getLatestAssetOperationTimeV2(tokenID);
@@ -299,9 +299,9 @@
 
     accountCapsule.setLatestOperationTime(latestOperationTime);
     if (dbManager.getDynamicPropertiesStore().getAllowSameTokenName() == 0) {
-      accountCapsule.putLatestAssetOperationTimeMap(tokenID,
+      accountCapsule.putLatestAssetOperationTimeMap(tokenName,
           latestAssetOperationTime);
-      accountCapsule.putFreeAssetNetUsage(tokenID, newFreeAssetNetUsage);
+      accountCapsule.putFreeAssetNetUsage(tokenName, newFreeAssetNetUsage);
       dbManager.getAssetIssueStore().put(assetIssueCapsule.createDbKey(), assetIssueCapsule);
     }
 
