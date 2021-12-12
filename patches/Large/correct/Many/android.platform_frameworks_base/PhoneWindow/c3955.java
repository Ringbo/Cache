diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindow.java b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
index 1791e40..73e4338 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindow.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
@@ -759,7 +759,7 @@
         if (mPanelChordingKey != 0) {
             mPanelChordingKey = 0;
 
-            if (event.isCanceled()) {
+            if (event.isCanceled() || (mDecor != null && mDecor.mActionMode != null)) {
                 return;
             }
             
