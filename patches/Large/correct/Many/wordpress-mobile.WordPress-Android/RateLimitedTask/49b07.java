diff --git a/src/org/wordpress/android/util/RateLimitedTask.java b/src/org/wordpress/android/util/RateLimitedTask.java
index 0d0cbfb..04c3d37 100644
--- a/src/org/wordpress/android/util/RateLimitedTask.java
+++ b/src/org/wordpress/android/util/RateLimitedTask.java
@@ -24,7 +24,7 @@
 
     public synchronized boolean runIfNotLimited() {
         Date now = new Date();
-        if (DateTimeUtils.secondsBetween(now, mLastUpdate) >= mMinRateInSeconds) {
+        if (mLastUpdate == null || DateTimeUtils.secondsBetween(now, mLastUpdate) >= mMinRateInSeconds) {
             if (run()) {
                 mLastUpdate = now;
                 return true;
