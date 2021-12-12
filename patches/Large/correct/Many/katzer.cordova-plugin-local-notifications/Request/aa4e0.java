diff --git a/src/android/notification/Request.java b/src/android/notification/Request.java
index 0f08891..c5c9dd2 100644
--- a/src/android/notification/Request.java
+++ b/src/android/notification/Request.java
@@ -103,7 +103,7 @@
      * If there's one more trigger date to calculate.
      */
     private boolean hasNext() {
-        return triggerDate != null && getOccurrence() < count;
+        return triggerDate != null && getOccurrence() <= count;
     }
 
     /**
