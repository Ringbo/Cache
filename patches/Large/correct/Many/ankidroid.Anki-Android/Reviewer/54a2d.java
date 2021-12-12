diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 0191374..a908a30 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -2670,7 +2670,7 @@
                         }
                 }
             }
-            if (!mShowAnimations && mCardTimer.getVisibility() == View.INVISIBLE) {
+            if (!mShowAnimations && mShowTimer && mCardTimer.getVisibility() == View.INVISIBLE) {
                 switchTopBarVisibility(View.VISIBLE);
             }
             if (!sDisplayAnswer) {
