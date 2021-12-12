diff --git a/src/com/fsck/k9/mail/store/LocalStore.java b/src/com/fsck/k9/mail/store/LocalStore.java
index d2af53b..f706ed8 100644
--- a/src/com/fsck/k9/mail/store/LocalStore.java
+++ b/src/com/fsck/k9/mail/store/LocalStore.java
@@ -1007,7 +1007,7 @@
                     String name = cursor.getString(1);
                     cursor.close();
 
-                    if (MimeUtility.DEFAULT_ATTACHMENT_MIME_TYPE.equals(type)) {
+                    if (MimeUtility.DEFAULT_ATTACHMENT_MIME_TYPE.equalsIgnoreCase(type)) {
                         type = MimeUtility.getMimeTypeByExtension(name);
                     }
                     return type;
