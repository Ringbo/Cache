diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index b91ecf5..3fe8a1e 100644
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -825,7 +825,7 @@
         boolean anyForeground = false;
         for (int i=proc.services.size()-1; i>=0; i--) {
             ServiceRecord sr = proc.services.valueAt(i);
-            if (sr.isForeground) {
+            if (sr.isForeground || sr.fgRequired) {
                 anyForeground = true;
                 break;
             }
@@ -1869,7 +1869,7 @@
         final boolean newService = app.services.add(r);
         bumpServiceExecutingLocked(r, execInFg, "create");
         mAm.updateLruProcessLocked(app, false, null);
-        mAm.updateOomAdjLocked();
+        updateServiceForegroundLocked(r.app, true);
 
         boolean created = false;
         try {
