diff --git a/src/org/anddev/andengine/util/modifier/SequenceModifier.java b/src/org/anddev/andengine/util/modifier/SequenceModifier.java
index 46d650a..fd7ef57 100644
--- a/src/org/anddev/andengine/util/modifier/SequenceModifier.java
+++ b/src/org/anddev/andengine/util/modifier/SequenceModifier.java
@@ -109,7 +109,7 @@
 			return 0;
 		} else {
 			float secondsElapsedRemaining = pSecondsElapsed;
-			while(secondsElapsedRemaining > 0) {
+			while(secondsElapsedRemaining > 0 && !this.mFinished) {
 				secondsElapsedRemaining -= this.mSubSequenceModifiers[this.mCurrentSubSequenceModifierIndex].onUpdate(secondsElapsedRemaining, pItem);
 			}
 
