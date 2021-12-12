diff --git a/app/src/main/java/com/termux/app/TermuxOpenReceiver.java b/app/src/main/java/com/termux/app/TermuxOpenReceiver.java
index 0d90f11..2bf3820 100644
--- a/app/src/main/java/com/termux/app/TermuxOpenReceiver.java
+++ b/app/src/main/java/com/termux/app/TermuxOpenReceiver.java
@@ -78,7 +78,7 @@
         if (contentTypeExtra == null) {
             String fileName = fileToShare.getName();
             int lastDotIndex = fileName.lastIndexOf('.');
-            String fileExtension = fileName.substring(lastDotIndex + 1, fileName.length());
+            String fileExtension = fileName.substring(lastDotIndex + 1);
             MimeTypeMap mimeTypes = MimeTypeMap.getSingleton();
             // Lower casing makes it work with e.g. "JPG":
             contentTypeToUse = mimeTypes.getMimeTypeFromExtension(fileExtension.toLowerCase());
