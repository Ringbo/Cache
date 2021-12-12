diff --git a/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java b/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
index dbd820b..c6251c2 100644
--- a/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
+++ b/src/main/java/eu/siacs/conversations/ui/EditAccountActivity.java
@@ -523,7 +523,7 @@
 			}
 			mamPrefs.setVisible(mAccount.getXmppConnection().getFeatures().mam());
 			Set<Integer> otherDevices = mAccount.getAxolotlService().getOwnDeviceIds();
-			if (otherDevices == null || otherDevices.isEmpty() || Config.supportOmemo()) {
+			if (otherDevices == null || otherDevices.isEmpty() || !Config.supportOmemo()) {
 				clearDevices.setVisible(false);
 			}
 			changePresence.setVisible(manuallyChangePresence());
