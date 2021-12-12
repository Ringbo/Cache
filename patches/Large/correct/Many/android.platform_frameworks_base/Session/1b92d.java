diff --git a/services/autofill/java/com/android/server/autofill/Session.java b/services/autofill/java/com/android/server/autofill/Session.java
index 7c3f324..f0cc749 100644
--- a/services/autofill/java/com/android/server/autofill/Session.java
+++ b/services/autofill/java/com/android/server/autofill/Session.java
@@ -442,7 +442,7 @@
      */
     public boolean showSaveLocked() {
         if (mStructure == null) {
-            Slog.wtf(TAG, "showSaveLocked(): no mStructure");
+            Slog.d(TAG, "showSaveLocked(): no mStructure");
             return true;
         }
         if (mResponses == null) {
