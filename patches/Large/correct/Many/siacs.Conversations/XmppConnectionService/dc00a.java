diff --git a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
index 8df3808..dde8ad2 100644
--- a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
+++ b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
@@ -2629,7 +2629,7 @@
 	}
 
 	public boolean allowMessageCorrection() {
-		return getPreferences().getBoolean("allow_message_correction", true);
+		return getPreferences().getBoolean("allow_message_correction", false);
 	}
 
 	public boolean sendChatStates() {
