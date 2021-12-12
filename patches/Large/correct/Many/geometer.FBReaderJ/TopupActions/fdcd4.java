diff --git a/src/org/geometerplus/android/fbreader/network/TopupActions.java b/src/org/geometerplus/android/fbreader/network/TopupActions.java
index d5ac928..6cd29a9 100644
--- a/src/org/geometerplus/android/fbreader/network/TopupActions.java
+++ b/src/org/geometerplus/android/fbreader/network/TopupActions.java
@@ -47,7 +47,7 @@
 	void buildContextMenu(Activity activity, ContextMenu menu, INetworkLink link) {
 		menu.setHeaderTitle(getTitleValue("topupTitle"));
 
-		if (Util.isSmsTopupSupported(activity, link)) {
+		if (Util.isCreditCardTopupSupported(activity, link)) {
 			addMenuItem(menu, TOPUP_VIA_CREDIT_CARD_ITEM_ID, "topupViaCreditCard");
 		}
 		if (Util.isSmsTopupSupported(activity, link)) {
