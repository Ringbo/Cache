diff --git a/src/org/openintents/openpgp/OpenPgpSignatureResult.java b/src/org/openintents/openpgp/OpenPgpSignatureResult.java
index 8ce4d3c..dbcd74b 100644
--- a/src/org/openintents/openpgp/OpenPgpSignatureResult.java
+++ b/src/org/openintents/openpgp/OpenPgpSignatureResult.java
@@ -137,7 +137,7 @@
         dest.writeString(primaryUserId);
         dest.writeLong(keyId);
         // version 2
-        dest.writeList(userIds);
+        dest.writeStringList(userIds);
         // Go back and write the size
         int parcelableSize = dest.dataPosition() - startPosition;
         dest.setDataPosition(sizePosition);
