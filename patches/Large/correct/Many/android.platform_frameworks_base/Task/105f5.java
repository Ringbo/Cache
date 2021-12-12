diff --git a/services/core/java/com/android/server/wm/Task.java b/services/core/java/com/android/server/wm/Task.java
index bc749e1..0a999e6 100644
--- a/services/core/java/com/android/server/wm/Task.java
+++ b/services/core/java/com/android/server/wm/Task.java
@@ -382,9 +382,7 @@
      *                    the adjusted bounds's top.
      */
     void alignToAdjustedBounds(Rect adjustedBounds, Rect tempInsetBounds, boolean alignBottom) {
-        // Task override config might be empty, while display or stack override config isn't, so
-        // we have to check merged override config here.
-        if (!isResizeable() || Configuration.EMPTY.equals(getMergedOverrideConfiguration())) {
+        if (!isResizeable() || Configuration.EMPTY.equals(getOverrideConfiguration())) {
             return;
         }
 
