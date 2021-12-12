diff --git a/src/main/java/eu/siacs/conversations/utils/XmppUri.java b/src/main/java/eu/siacs/conversations/utils/XmppUri.java
index 0f400aa..c20c9a4 100644
--- a/src/main/java/eu/siacs/conversations/utils/XmppUri.java
+++ b/src/main/java/eu/siacs/conversations/utils/XmppUri.java
@@ -72,7 +72,7 @@
 				jid = uri.getAuthority();
 			} else {
 				String[] parts = uri.getSchemeSpecificPart().split("\\?");
-				if (parts.length > 1) {
+				if (parts.length > 0) {
 					jid = parts[0];
 				} else {
 					return;
