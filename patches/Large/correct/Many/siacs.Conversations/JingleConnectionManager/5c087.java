diff --git a/src/eu/siacs/conversations/xmpp/jingle/JingleConnectionManager.java b/src/eu/siacs/conversations/xmpp/jingle/JingleConnectionManager.java
index 44af51a..a45ebb7 100644
--- a/src/eu/siacs/conversations/xmpp/jingle/JingleConnectionManager.java
+++ b/src/eu/siacs/conversations/xmpp/jingle/JingleConnectionManager.java
@@ -120,11 +120,11 @@
 	}
 	
 	public long getAutoAcceptFileSize() {
-		String config = this.xmppConnectionService.getPreferences().getString("auto_accept_file_size", "0");
+		String config = this.xmppConnectionService.getPreferences().getString("auto_accept_file_size", "524288");
 		try {
 			return Long.parseLong(config);
 		} catch (NumberFormatException e) {
-			return 0;
+			return 524288;
 		}
 	}
 }
