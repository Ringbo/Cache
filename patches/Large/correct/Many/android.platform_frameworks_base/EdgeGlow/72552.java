diff --git a/core/java/android/widget/EdgeGlow.java b/core/java/android/widget/EdgeGlow.java
index 7a990ad..8d14462 100644
--- a/core/java/android/widget/EdgeGlow.java
+++ b/core/java/android/widget/EdgeGlow.java
@@ -145,10 +145,9 @@
         mEdgeScaleY = mEdgeScaleYStart = Math.max(
                 HELD_EDGE_SCALE_Y, Math.min(distance * PULL_DISTANCE_EDGE_FACTOR, 1.f));
 
-        mGlowAlpha = mGlowAlphaStart = Math.min(
+        mGlowAlpha = mGlowAlphaStart = Math.min(MAX_ALPHA,
                 mGlowAlpha +
-                (Math.abs(deltaDistance) * PULL_DISTANCE_ALPHA_GLOW_FACTOR),
-                MAX_ALPHA);
+                (Math.abs(deltaDistance) * PULL_DISTANCE_ALPHA_GLOW_FACTOR));
 
         float glowChange = Math.abs(deltaDistance);
         if (deltaDistance > 0 && mPullDistance < 0) {
@@ -157,8 +156,10 @@
         if (mPullDistance == 0) {
             mGlowScaleY = 0;
         }
-        mGlowScaleY = mGlowScaleYStart = Math.max(
-                0, mGlowScaleY + glowChange * PULL_DISTANCE_GLOW_FACTOR);
+
+        // Do not allow glow to get larger than MAX_GLOW_HEIGHT.
+        mGlowScaleY = mGlowScaleYStart = Math.min(MAX_GLOW_HEIGHT, Math.max(
+                0, mGlowScaleY + glowChange * PULL_DISTANCE_GLOW_FACTOR));
 
         mEdgeAlphaFinish = mEdgeAlpha;
         mEdgeScaleYFinish = mEdgeScaleY;
