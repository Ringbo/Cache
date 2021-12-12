diff --git a/src/com/android/email/mail/store/LocalStore.java b/src/com/android/email/mail/store/LocalStore.java
index c1855f8..d8ae87e 100644
--- a/src/com/android/email/mail/store/LocalStore.java
+++ b/src/com/android/email/mail/store/LocalStore.java
@@ -916,7 +916,7 @@
             message.setReplyTo(Address.unpack(cursor.getString(9)));
             message.mAttachmentCount = cursor.getInt(10);
             message.setInternalDate(new Date(cursor.getLong(11)));
-            message.addHeader("Message-ID", cursor.getString(12));
+            message.setHeader("Message-ID", cursor.getString(12));
         }
 
         @Override
