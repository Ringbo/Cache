diff --git a/core/java/android/util/apk/ApkVerityBuilder.java b/core/java/android/util/apk/ApkVerityBuilder.java
index a3eeb27..1f10161 100644
--- a/core/java/android/util/apk/ApkVerityBuilder.java
+++ b/core/java/android/util/apk/ApkVerityBuilder.java
@@ -330,7 +330,7 @@
         buffer.putShort((short) 1);         // meta algorithm, SHA256_MODE == 1
         buffer.putShort((short) 1);         // data algorithm, SHA256_MODE == 1
 
-        buffer.putInt(0x1);                 // flags, 0x1: has extension
+        buffer.putInt(0x0);                 // flags
         buffer.putInt(0);                   // reserved
 
         buffer.putLong(fileSize);           // original file size
