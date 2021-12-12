diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index 9d06b0d..d14b31c 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -481,7 +481,7 @@
 
     @Override
     public void setWindowingMode(int windowingMode) {
-        setWindowingMode(windowingMode, false /* animate */, true /* showRecents */,
+        setWindowingMode(windowingMode, false /* animate */, false /* showRecents */,
                 false /* enteringSplitScreenMode */);
     }
 
