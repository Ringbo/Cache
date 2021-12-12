diff --git a/services/core/java/com/android/server/pm/BackgroundDexOptService.java b/services/core/java/com/android/server/pm/BackgroundDexOptService.java
index 355f34f..a7eebf8 100644
--- a/services/core/java/com/android/server/pm/BackgroundDexOptService.java
+++ b/services/core/java/com/android/server/pm/BackgroundDexOptService.java
@@ -75,7 +75,7 @@
                         schedule(BackgroundDexOptService.this);
                         return;
                     }
-                    pm.performDexOpt(pkg, null /* instruction set */, false);
+                    pm.performDexOpt(pkg, null /* instruction set */, true);
                 }
                 // ran to completion, so we abandon our timeslice and do not reschedule
                 jobFinished(jobParams, false);
