diff --git a/services/autofill/java/com/android/server/autofill/Session.java b/services/autofill/java/com/android/server/autofill/Session.java
index 5feb81d..8f5c80e 100644
--- a/services/autofill/java/com/android/server/autofill/Session.java
+++ b/services/autofill/java/com/android/server/autofill/Session.java
@@ -438,7 +438,7 @@
      */
     public boolean showSaveLocked() {
         if (mStructure == null) {
-            Slog.wtf(TAG, "showSaveLocked(): no mStructure");
+            Slog.d(TAG, "showSaveLocked(): no mStructure");
             return true;
         }
         if (mResponses == null) {
