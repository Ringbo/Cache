diff --git a/core/java/android/nfc/cardemulation/NfcFCardEmulation.java b/core/java/android/nfc/cardemulation/NfcFCardEmulation.java
index a506504..d7f2717 100644
--- a/core/java/android/nfc/cardemulation/NfcFCardEmulation.java
+++ b/core/java/android/nfc/cardemulation/NfcFCardEmulation.java
@@ -453,7 +453,7 @@
             return false;
         }
         try {
-            Long.valueOf(nfcid2, 16);
+            Long.parseLong(nfcid2, 16);
         } catch (NumberFormatException e) {
             Log.e(TAG, "NFCID2 " + nfcid2 + " is not a valid NFCID2.");
             return false;
