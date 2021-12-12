diff --git a/k9mail/src/main/java/com/fsck/k9/cache/EmailProviderCacheCursor.java b/k9mail/src/main/java/com/fsck/k9/cache/EmailProviderCacheCursor.java
index fdf7599..55e4882 100644
--- a/k9mail/src/main/java/com/fsck/k9/cache/EmailProviderCacheCursor.java
+++ b/k9mail/src/main/java/com/fsck/k9/cache/EmailProviderCacheCursor.java
@@ -65,12 +65,12 @@
         String value = mCache.getValueForMessage(messageId, columnName);
 
         if (value != null) {
-            return Integer.valueOf(value);
+            return Integer.parseInt(value);
         }
 
         value = mCache.getValueForThread(threadRootId, columnName);
         if (value != null) {
-            return Integer.valueOf(value);
+            return Integer.parseInt(value);
         }
 
         return super.getInt(columnIndex);
