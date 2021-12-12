diff --git a/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/mailbox/PasswordRetriever.java b/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/mailbox/PasswordRetriever.java
index 6bf71bf..20eabab 100644
--- a/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/mailbox/PasswordRetriever.java
+++ b/portlets/mail-portlet/docroot/WEB-INF/src/com/liferay/mail/mailbox/PasswordRetriever.java
@@ -32,7 +32,7 @@
 public class PasswordRetriever {
 
 	public PasswordRetriever(HttpServletRequest request) {
-		if (_request == null) {
+		if (request == null) {
 			throw new IllegalStateException("Request is null");
 		}
 
