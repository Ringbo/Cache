diff --git a/src/eu/siacs/conversations/services/XmppConnectionService.java b/src/eu/siacs/conversations/services/XmppConnectionService.java
index 9a5cbc0..bc574fb 100644
--- a/src/eu/siacs/conversations/services/XmppConnectionService.java
+++ b/src/eu/siacs/conversations/services/XmppConnectionService.java
@@ -928,7 +928,7 @@
 	public void deleteAccount(Account account) {
 		Log.d(LOGTAG, "called delete account");
 		if (account.getXmppConnection() != null) {
-			this.disconnect(account, false);
+			this.disconnect(account, true);
 		}
 		databaseBackend.deleteAccount(account);
 		this.accounts.remove(account);
