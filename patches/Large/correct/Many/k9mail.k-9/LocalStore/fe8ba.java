diff --git a/src/com/fsck/k9/mail/store/LocalStore.java b/src/com/fsck/k9/mail/store/LocalStore.java
index a4c7833..c042b5d 100644
--- a/src/com/fsck/k9/mail/store/LocalStore.java
+++ b/src/com/fsck/k9/mail/store/LocalStore.java
@@ -1981,7 +1981,8 @@
                                         localMessage.setHeader(MimeHeader.HEADER_CONTENT_TYPE, "text/plain");
                                         localMessage.setBody(new TextBody(""));
                                     }
-                                    else if (mp.getCount() == 1)
+                                    else if (mp.getCount() == 1 && (mp.getBodyPart(0) instanceof LocalAttachmentBodyPart) == false )
+
                                     {
                                         // If we have only one part, drop the MimeMultipart container.
                                         BodyPart part = mp.getBodyPart(0);
