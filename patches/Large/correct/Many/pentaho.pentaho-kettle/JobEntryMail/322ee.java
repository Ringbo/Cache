diff --git a/src/be/ibridge/kettle/job/entry/mail/JobEntryMail.java b/src/be/ibridge/kettle/job/entry/mail/JobEntryMail.java
index 357b0cf..9934442 100644
--- a/src/be/ibridge/kettle/job/entry/mail/JobEntryMail.java
+++ b/src/be/ibridge/kettle/job/entry/mail/JobEntryMail.java
@@ -525,7 +525,7 @@
 		    String email_address = StringUtil.environmentSubstitute(replyAddress);
 		    if ( email_address != null )
 		    {
-		        msg.setFrom(new InternetAddress());
+		        msg.setFrom(new InternetAddress(email_address));
 		    }
 		    else
 		    {
