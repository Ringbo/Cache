diff --git a/k9mail/src/androidTest/java/com/fsck/k9/provider/EmailProviderTest.java b/k9mail/src/androidTest/java/com/fsck/k9/provider/EmailProviderTest.java
index df3776d..c84cfd8 100644
--- a/k9mail/src/androidTest/java/com/fsck/k9/provider/EmailProviderTest.java
+++ b/k9mail/src/androidTest/java/com/fsck/k9/provider/EmailProviderTest.java
@@ -273,7 +273,7 @@
                 .appendMessages(Collections.singletonList(message));
 
         account.getLocalStore().getFolder("Inbox")
-                .appendMessages(Collections.singletonList(reply));
+                .appendMessages(Collections.singletonList(replyAtSameTime));
 
         Cursor cursor = this.getProvider().query(
                 Uri.parse("content://"+EmailProvider.AUTHORITY
