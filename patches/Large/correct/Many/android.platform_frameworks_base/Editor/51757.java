diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 7d3a41e..954fc1d 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -4045,9 +4045,9 @@
                 positionCursor = true;
             } else if (offset + mTouchWordOffset < mPreviousOffset) {
                 // User is shrinking the selection.
-                if (currLine > mPrevLine) {
+                if (currLine < mPrevLine) {
                     // We're on a different line, so we'll snap to word boundaries.
-                    offset = getWordStart(offset);
+                    offset = start;
                 }
                 offset += mTouchWordOffset;
                 positionCursor = true;
