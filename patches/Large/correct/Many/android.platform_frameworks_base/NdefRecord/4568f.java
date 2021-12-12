diff --git a/core/java/android/nfc/NdefRecord.java b/core/java/android/nfc/NdefRecord.java
index bd32314..2c9ce3f 100644
--- a/core/java/android/nfc/NdefRecord.java
+++ b/core/java/android/nfc/NdefRecord.java
@@ -839,7 +839,7 @@
 
                 if (cf && !inChunk) {
                     // first chunk
-                    if (typeLength == 0) {
+                    if (typeLength == 0 && tnf != NdefRecord.TNF_UNKNOWN) {
                         throw new FormatException("expected non-zero type length in first chunk");
                     }
                     chunks.clear();
