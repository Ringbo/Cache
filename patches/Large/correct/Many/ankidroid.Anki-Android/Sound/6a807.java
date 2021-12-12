diff --git a/src/com/ichi2/libanki/Sound.java b/src/com/ichi2/libanki/Sound.java
index 1778c5f..760adcc 100644
--- a/src/com/ichi2/libanki/Sound.java
+++ b/src/com/ichi2/libanki/Sound.java
@@ -188,7 +188,7 @@
         @Override
         public void onCompletion(MediaPlayer mp) {
             // If there is still more sounds to play for the current card, play the next one
-            if (mNextToPlay < sSoundPaths.get(mQa).size())
+            if (sSoundPaths.containsKey(mQa) && mNextToPlay < sSoundPaths.get(mQa).size())
                 playSound(sSoundPaths.get(mQa).get(mNextToPlay++), this);
             else
                 releaseSound();
