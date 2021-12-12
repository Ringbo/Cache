diff --git a/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/imap/IMAPConnection.java b/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/imap/IMAPConnection.java
index e06feb5..6f51608 100644
--- a/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/imap/IMAPConnection.java
+++ b/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/imap/IMAPConnection.java
@@ -186,7 +186,7 @@
 			failedOutgoingConnection = true;
 		}
 
-		if (failedIncomingConnection || failedOutgoingConnection) {
+		if (failedIncomingConnection && failedOutgoingConnection) {
 			throw new MailException(
 				MailException.ACCOUNT_CONNECTIONS_FAILED);
 		}
