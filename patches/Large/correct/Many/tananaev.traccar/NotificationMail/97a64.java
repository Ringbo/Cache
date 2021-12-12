diff --git a/src/org/traccar/notification/NotificationMail.java b/src/org/traccar/notification/NotificationMail.java
index f8449e7..b3531a9 100644
--- a/src/org/traccar/notification/NotificationMail.java
+++ b/src/org/traccar/notification/NotificationMail.java
@@ -56,7 +56,7 @@
 
             String username = config.getString("mail.smtp.username");
             if (username != null) {
-                result.put("mail.smtp.user", username);
+                result.put("mail.smtp.username", username);
             }
             String password = config.getString("mail.smtp.password");
             if (password != null) {
@@ -119,7 +119,7 @@
                     return;
                 }
             }
-            mailSession = Session.getInstance(mailServerProperties, null);
+            mailSession = Session.getDefaultInstance(mailServerProperties);
 
             mailMessage = new MimeMessage(mailSession);
 
