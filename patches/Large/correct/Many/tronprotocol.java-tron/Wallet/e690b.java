diff --git a/src/main/java/org/tron/core/Wallet.java b/src/main/java/org/tron/core/Wallet.java
index ce23283..6b9cb13 100755
--- a/src/main/java/org/tron/core/Wallet.java
+++ b/src/main/java/org/tron/core/Wallet.java
@@ -718,7 +718,7 @@
     return builder.build();
   }
 
-  public AssetIssueContract getAssetIssueByName(Long assetName) {
+  public AssetIssueContract getAssetIssueByName(String assetName) {
     return getAssetIssueById(assetName);
   }
 
@@ -736,12 +736,12 @@
     return builder.build();
   }
 
-  public AssetIssueContract getAssetIssueById(Long assetId) {
+  public AssetIssueContract getAssetIssueById(String assetId) {
     if (assetId == null) {
       return null;
     }
     AssetIssueCapsule assetIssueCapsule = dbManager.getAssetIssueStoreFinal()
-        .get(ByteArray.fromLong(assetId));
+        .get(ByteArray.fromString(assetId));
     return assetIssueCapsule != null ? assetIssueCapsule.getInstance() : null;
   }
 
