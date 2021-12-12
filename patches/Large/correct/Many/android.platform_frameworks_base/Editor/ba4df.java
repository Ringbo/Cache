diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 0f99e88..cc44577 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -4887,9 +4887,10 @@
                     text.insert(newTextInsertAt, newText);
                 }
             }
-            // Restore the cursor position.
+            // Restore the cursor position. If there wasn't an old cursor (newCursorPos == -1) then
+            // don't explicitly set it and rely on SpannableStringBuilder to position it.
             // TODO: Select all the text that was undone.
-            if (newCursorPos <= text.length()) {
+            if (0 <= newCursorPos && newCursorPos <= text.length()) {
                 Selection.setSelection(text, newCursorPos);
             }
         }
