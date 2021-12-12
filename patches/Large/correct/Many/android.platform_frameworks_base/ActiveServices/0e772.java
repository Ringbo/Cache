diff --git a/services/java/com/android/server/am/ActiveServices.java b/services/java/com/android/server/am/ActiveServices.java
index fa1769f..8f4bf21 100644
--- a/services/java/com/android/server/am/ActiveServices.java
+++ b/services/java/com/android/server/am/ActiveServices.java
@@ -1839,7 +1839,7 @@
                 }
             }
         } else {
-            ServiceMap smap = mServiceMap.valueAt(userId);
+            ServiceMap smap = mServiceMap.get(userId);
             if (smap != null) {
                 ArrayMap<ComponentName, ServiceRecord> items = smap.mServicesByName;
                 didSomething = collectForceStopServicesLocked(name, userId, evenPersistent,
