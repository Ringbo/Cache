diff --git a/xchange-mtgox/src/main/java/com/xeiam/xchange/mtgox/v2/MtGoxAdapters.java b/xchange-mtgox/src/main/java/com/xeiam/xchange/mtgox/v2/MtGoxAdapters.java
index f39a2cc..eaee239 100644
--- a/xchange-mtgox/src/main/java/com/xeiam/xchange/mtgox/v2/MtGoxAdapters.java
+++ b/xchange-mtgox/src/main/java/com/xeiam/xchange/mtgox/v2/MtGoxAdapters.java
@@ -71,7 +71,7 @@
   public static AccountInfo adaptAccountInfo(MtGoxAccountInfo mtGoxAccountInfo) {
 
     // Adapt to XChange DTOs
-    AccountInfo accountInfo = new AccountInfo(mtGoxAccountInfo.getLogin(), MtGoxAdapters.adaptWallets(mtGoxAccountInfo.getWallets()));
+    AccountInfo accountInfo = new AccountInfo(mtGoxAccountInfo.getLogin(), mtGoxAccountInfo.getTradeFee(), MtGoxAdapters.adaptWallets(mtGoxAccountInfo.getWallets()));
     return accountInfo;
   }
 
