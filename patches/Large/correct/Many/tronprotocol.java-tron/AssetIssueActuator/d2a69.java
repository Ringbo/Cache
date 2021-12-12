diff --git a/src/main/java/org/tron/core/actuator/AssetIssueActuator.java b/src/main/java/org/tron/core/actuator/AssetIssueActuator.java
index 9fc8bbe..09a1391 100644
--- a/src/main/java/org/tron/core/actuator/AssetIssueActuator.java
+++ b/src/main/java/org/tron/core/actuator/AssetIssueActuator.java
@@ -138,7 +138,7 @@
       throw new ContractValidateException("Invalid assetName");
     }
     if ((!assetIssueContract.getAbbr().isEmpty()) && !TransactionUtil
-        .validAssetName(assetIssueContract.getAbbr().toByteArray())) {
+    	.validTokenAbbrName(assetIssueContract.getAbbr().toByteArray())) {
       throw new ContractValidateException("Invalid abbreviation for token");
     }
     if (!TransactionUtil.validUrl(assetIssueContract.getUrl().toByteArray())) {
