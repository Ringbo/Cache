diff --git a/core/java/android/view/inputmethod/InputMethodManager.java b/core/java/android/view/inputmethod/InputMethodManager.java
index 053b35c..1c8a79b 100644
--- a/core/java/android/view/inputmethod/InputMethodManager.java
+++ b/core/java/android/view/inputmethod/InputMethodManager.java
@@ -1169,7 +1169,10 @@
         // do its stuff.
         // Life is good: let's hook everything up!
         EditorInfo tba = new EditorInfo();
-        tba.packageName = view.getContext().getPackageName();
+        // Note: Use Context#getOpPackageName() rather than Context#getPackageName() so that the
+        // system can verify the consistency between the uid of this process and package name passed
+        // from here. See comment of Context#getOpPackageName() for details.
+        tba.packageName = view.getContext().getOpPackageName();
         tba.fieldId = view.getId();
         InputConnection ic = view.onCreateInputConnection(tba);
         if (DEBUG) Log.v(TAG, "Starting input: tba=" + tba + " ic=" + ic);
