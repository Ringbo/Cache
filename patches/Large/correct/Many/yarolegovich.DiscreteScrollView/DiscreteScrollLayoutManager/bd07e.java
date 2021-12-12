diff --git a/library/src/main/java/com/yarolegovich/discretescrollview/DiscreteScrollLayoutManager.java b/library/src/main/java/com/yarolegovich/discretescrollview/DiscreteScrollLayoutManager.java
index 0a9af18..253e34a 100644
--- a/library/src/main/java/com/yarolegovich/discretescrollview/DiscreteScrollLayoutManager.java
+++ b/library/src/main/java/com/yarolegovich/discretescrollview/DiscreteScrollLayoutManager.java
@@ -413,7 +413,7 @@
 
     public void onFling(int velocityX, int velocityY) {
         int velocity = orientationHelper.getFlingVelocity(velocityX, velocityY);
-        int throttleValue = shouldSlideOnFling ? Math.abs(velocityX / flingThreshold) : 1;
+        int throttleValue = shouldSlideOnFling ? Math.abs(velocity / flingThreshold) : 1;
         int newPosition = currentPosition + Direction.fromDelta(velocity).applyTo(throttleValue);
         newPosition = checkNewOnFlingPositionIsInBounds(newPosition);
         boolean isInScrollDirection = velocity * scrolled >= 0;
