diff --git a/services/core/java/com/android/server/am/ServiceRecord.java b/services/core/java/com/android/server/am/ServiceRecord.java
index f296c60..8a174ed 100644
--- a/services/core/java/com/android/server/am/ServiceRecord.java
+++ b/services/core/java/com/android/server/am/ServiceRecord.java
@@ -550,11 +550,11 @@
         restartTime = 0;
     }
 
-    public StartItem findDeliveredStart(int id, boolean remove) {
+    public StartItem findDeliveredStart(int id, boolean taskRemoved, boolean remove) {
         final int N = deliveredStarts.size();
         for (int i=0; i<N; i++) {
             StartItem si = deliveredStarts.get(i);
-            if (si.id == id) {
+            if (si.id == id && si.taskRemoved == taskRemoved) {
                 if (remove) deliveredStarts.remove(i);
                 return si;
             }
