diff --git a/src/org/thoughtcrime/securesms/backup/FullBackupImporter.java b/src/org/thoughtcrime/securesms/backup/FullBackupImporter.java
index 206806d..77ec1f5 100644
--- a/src/org/thoughtcrime/securesms/backup/FullBackupImporter.java
+++ b/src/org/thoughtcrime/securesms/backup/FullBackupImporter.java
@@ -283,7 +283,7 @@
 
         out.close();
 
-        byte[] ourMac   = mac.doFinal();
+        byte[] ourMac   = ByteUtil.trim(mac.doFinal(), 10);
         byte[] theirMac = new byte[10];
 
         try {
@@ -293,7 +293,7 @@
           throw new IOException(e);
         }
 
-        if (MessageDigest.isEqual(ourMac, theirMac)) {
+        if (!MessageDigest.isEqual(ourMac, theirMac)) {
           //destination.delete();
           throw new IOException("Bad MAC");
         }
@@ -314,9 +314,9 @@
         System.arraycopy(frame, frame.length - 10, theirMac, 0, theirMac.length);
 
         mac.update(frame, 0, frame.length - 10);
-        byte[] ourMac = mac.doFinal();
+        byte[] ourMac = ByteUtil.trim(mac.doFinal(), 10);
 
-        if (MessageDigest.isEqual(ourMac, theirMac)) {
+        if (!MessageDigest.isEqual(ourMac, theirMac)) {
           throw new IOException("Bad MAC");
         }
 
