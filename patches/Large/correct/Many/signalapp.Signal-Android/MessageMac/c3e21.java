diff --git a/src/org/thoughtcrime/securesms/crypto/MessageMac.java b/src/org/thoughtcrime/securesms/crypto/MessageMac.java
index 4da7c0f..fc86be7 100644
--- a/src/org/thoughtcrime/securesms/crypto/MessageMac.java
+++ b/src/org/thoughtcrime/securesms/crypto/MessageMac.java
@@ -61,7 +61,7 @@
   }
 	
   public static byte[] getMessageWithoutMac(byte[] message) throws InvalidMacException {
-    if (message.length <= MAC_LENGTH)
+    if (message == null || message.length <= MAC_LENGTH)
       throw new InvalidMacException("Message shorter than MAC!");
 		
     byte[] strippedMessage = new byte[message.length - MAC_LENGTH];
