diff --git a/core/java/android/inputmethodservice/InputMethodService.java b/core/java/android/inputmethodservice/InputMethodService.java
index 2b15afd..4881d14 100644
--- a/core/java/android/inputmethodservice/InputMethodService.java
+++ b/core/java/android/inputmethodservice/InputMethodService.java
@@ -431,7 +431,7 @@
                 }
             }
             // If user uses hard keyboard, IME button should always be shown.
-            boolean showing = onEvaluateInputViewShown();
+            boolean showing = isInputViewShown();
             mImm.setImeWindowStatus(mToken, IME_ACTIVE | (showing ? IME_VISIBLE : 0),
                     mBackDisposition);
             if (resultReceiver != null) {
