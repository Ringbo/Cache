diff --git a/core/java/android/widget/AbsSeekBar.java b/core/java/android/widget/AbsSeekBar.java
index 68855ff..0fd1542 100644
--- a/core/java/android/widget/AbsSeekBar.java
+++ b/core/java/android/widget/AbsSeekBar.java
@@ -666,7 +666,7 @@
         progress += scale * max;
 
         setHotspot(x, (int) event.getY());
-        setProgress((int) progress, true);
+        setProgressInternal((int) progress, true, false);
     }
 
     /**
