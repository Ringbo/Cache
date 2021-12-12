diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index c6e44e0..89d698b 100644
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -2150,7 +2150,10 @@
 
         final ServiceMap smap = getServiceMapLocked(r.userId);
         ServiceRecord found = smap.mServicesByName.remove(r.name);
-        if (found != r) {
+
+        // Note when this method is called by bringUpServiceLocked(), the service is not found
+        // in mServicesByName and found will be null.
+        if (found != null && found != r) {
             // This is not actually the service we think is running...  this should not happen,
             // but if it does, fail hard.
             smap.mServicesByName.put(r.name, found);
