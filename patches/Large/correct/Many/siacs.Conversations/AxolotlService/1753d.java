diff --git a/src/main/java/eu/siacs/conversations/crypto/axolotl/AxolotlService.java b/src/main/java/eu/siacs/conversations/crypto/axolotl/AxolotlService.java
index 7533041..afb10b0 100644
--- a/src/main/java/eu/siacs/conversations/crypto/axolotl/AxolotlService.java
+++ b/src/main/java/eu/siacs/conversations/crypto/axolotl/AxolotlService.java
@@ -392,7 +392,7 @@
 		final int hash = deviceIds.hashCode();
 		final boolean me = jid.toBareJid().equals(account.getJid().toBareJid());
 		if (me) {
-			if (hash == this.lastDeviceListNotificationHash) {
+			if (hash != 0 && hash == this.lastDeviceListNotificationHash) {
 				Log.d(Config.LOGTAG, account.getJid().toBareJid() + ": ignoring duplicate own device id list");
 				return;
 			}
