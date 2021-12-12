diff --git a/framework/src/org/apache/cordova/CompassListener.java b/framework/src/org/apache/cordova/CompassListener.java
index 97a8b6f..01d431a 100755
--- a/framework/src/org/apache/cordova/CompassListener.java
+++ b/framework/src/org/apache/cordova/CompassListener.java
@@ -59,7 +59,7 @@
      * Constructor.
      */
     public CompassListener() {
-        this.heading = 0.0;
+        this.heading = 0;
         this.timeStamp = 0;
         this.setStatus(CompassListener.STOPPED);
     }
