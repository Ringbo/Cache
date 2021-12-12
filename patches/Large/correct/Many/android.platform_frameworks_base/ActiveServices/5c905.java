diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index 793a163..2bc131f 100644
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -462,7 +462,7 @@
 
         ComponentName cmp = startServiceInnerLocked(smap, service, r, callerFg, addToStarting);
         if (notification != null) {
-            setServiceForegroundInnerLocked(r, callingUid, notification, 0);
+            setServiceForegroundInnerLocked(r, id, notification, 0);
         }
         return cmp;
     }
