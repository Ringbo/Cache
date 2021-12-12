diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index f0fb9e6..cdee392 100755
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -5660,7 +5660,7 @@
                     didSomething = true;
                     it.remove();
                     pir.canceled = true;
-                    if (pir.key.activity != null) {
+                    if (pir.key.activity != null && pir.key.activity.pendingResults != null) {
                         pir.key.activity.pendingResults.remove(pir.ref);
                     }
                 }
