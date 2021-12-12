diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 9078e61..39e852b 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -10329,7 +10329,7 @@
                         Selection.setSelection((Spannable) text, start, end);
                         // Make sure selection mode is engaged.
                         if (mEditor != null) {
-                            mEditor.startSelectionActionModeAsync();
+                            mEditor.startSelectionActionMode();
                         }
                         return true;
                     }
