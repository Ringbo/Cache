diff --git a/src/org/anddev/andengine/engine/FixedStepEngine.java b/src/org/anddev/andengine/engine/FixedStepEngine.java
index c5d8d77..c5cbfcc 100644
--- a/src/org/anddev/andengine/engine/FixedStepEngine.java
+++ b/src/org/anddev/andengine/engine/FixedStepEngine.java
@@ -3,6 +3,9 @@
 import org.anddev.andengine.engine.options.FixedStepEngineOptions;
 
 /**
+ * A subclass of {@link Engine} that tries to achieve a specific amount of updates per second. 
+ * When the time since the last update is bigger long the steplength, additional updates are executed.
+ *  
  * @author Nicolas Gramlich
  * @since 10:17:47 - 02.08.2010
  */
@@ -41,7 +44,7 @@
 
 		final float stepLength = this.mStepLength;
 		while(this.mSecondsElapsedAccumulator >= stepLength) {
-			super.onUpdate(pSecondsElapsed);
+			super.onUpdate(stepLength);
 			this.mSecondsElapsedAccumulator -= stepLength;
 		}
 	}
