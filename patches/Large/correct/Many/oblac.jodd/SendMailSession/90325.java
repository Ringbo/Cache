diff --git a/mod/jodd/src/jodd/mail/SendMailSession.java b/mod/jodd/src/jodd/mail/SendMailSession.java
index 6c4d14e..ab949f7 100644
--- a/mod/jodd/src/jodd/mail/SendMailSession.java
+++ b/mod/jodd/src/jodd/mail/SendMailSession.java
@@ -97,7 +97,7 @@
 		if (email.getReplyTo() != null) {
 			int totalReplyTo = email.getReplyTo().length;
 			address = new InternetAddress[totalReplyTo];
-			for (int i = 0; i < totalTo; i++) {
+			for (int i = 0; i < totalReplyTo; i++) {
 				address[i] = new InternetAddress(email.getReplyTo()[i]);
 			}
 			msg.setReplyTo(address);
