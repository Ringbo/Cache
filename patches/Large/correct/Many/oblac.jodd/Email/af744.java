diff --git a/mod/jodd/src/jodd/mail/Email.java b/mod/jodd/src/jodd/mail/Email.java
index 8863af4..e4aa5bc 100644
--- a/mod/jodd/src/jodd/mail/Email.java
+++ b/mod/jodd/src/jodd/mail/Email.java
@@ -40,7 +40,7 @@
 		return this;
 	}
 	public Email replyTo(String... replyTos) {
-		setTo(replyTos);
+		setReplyTo(replyTos);
 		return this;
 	}
 
