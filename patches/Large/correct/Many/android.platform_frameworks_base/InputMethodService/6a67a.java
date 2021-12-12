diff --git a/core/java/android/inputmethodservice/InputMethodService.java b/core/java/android/inputmethodservice/InputMethodService.java
index 6f1cc94..d6b90c3 100644
--- a/core/java/android/inputmethodservice/InputMethodService.java
+++ b/core/java/android/inputmethodservice/InputMethodService.java
@@ -424,7 +424,7 @@
                 showWindow(true);
             }
             // If user uses hard keyboard, IME button should always be shown.
-            boolean showing = onEvaluateInputViewShown();
+            boolean showing = isInputViewShown();
             mImm.setImeWindowStatus(mToken, IME_ACTIVE | (showing ? IME_VISIBLE : 0),
                     mBackDisposition);
             if (resultReceiver != null) {
