diff --git a/src/org/traccar/notification/NotificationMail.java b/src/org/traccar/notification/NotificationMail.java
index bc7f6d4..a0b80d2 100644
--- a/src/org/traccar/notification/NotificationMail.java
+++ b/src/org/traccar/notification/NotificationMail.java
@@ -112,7 +112,7 @@
                     return;
                 }
             }
-            mailSession = Session.getDefaultInstance(mailServerProperties, null);
+            mailSession = Session.getInstance(mailServerProperties, null);
 
             mailMessage = new MimeMessage(mailSession);
 
