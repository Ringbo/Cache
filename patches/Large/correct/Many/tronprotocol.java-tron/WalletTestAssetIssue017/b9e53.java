diff --git a/src/test/java/stest/tron/wallet/exchangeandtoken/WalletTestAssetIssue017.java b/src/test/java/stest/tron/wallet/exchangeandtoken/WalletTestAssetIssue017.java
index 26740ff..12f54d8 100644
--- a/src/test/java/stest/tron/wallet/exchangeandtoken/WalletTestAssetIssue017.java
+++ b/src/test/java/stest/tron/wallet/exchangeandtoken/WalletTestAssetIssue017.java
@@ -164,7 +164,7 @@
     Assert.assertTrue(assetIssueListPaginated.get().getAssetIssueCount() == 0);
 
     //offset is 1, limit is 50.
-    offset = 1;
+    offset = 0;
     limit = 50;
     pageMessageBuilder = PaginatedMessage.newBuilder();
     pageMessageBuilder.setOffset(offset);
