diff --git a/mod/jodd/src/jodd/mail/SendMailSession.java b/mod/jodd/src/jodd/mail/SendMailSession.java
index 2321341..d0088d6 100644
--- a/mod/jodd/src/jodd/mail/SendMailSession.java
+++ b/mod/jodd/src/jodd/mail/SendMailSession.java
@@ -58,7 +58,7 @@
 			throw new MailException("Unable to prepare email message: " + mail, mex);
 		}
 		try {
-			mailTransport.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
+			mailTransport.sendMessage(msg, msg.getAllRecipients());
 		} catch (MessagingException mex) {
 			throw new MailException("Unable to send email message: " + mail, mex);
 		}
