diff --git a/ui/src/main/java/org/pentaho/di/ui/spoon/trans/TransGraph.java b/ui/src/main/java/org/pentaho/di/ui/spoon/trans/TransGraph.java
index 0f325b2..4e2688f 100644
--- a/ui/src/main/java/org/pentaho/di/ui/spoon/trans/TransGraph.java
+++ b/ui/src/main/java/org/pentaho/di/ui/spoon/trans/TransGraph.java
@@ -4256,7 +4256,7 @@
 
         // Stop button...
         //
-        if ( !stopItem.isEnabled() ^ !running ) {
+        if ( !stopItem.isDisposed() && !stopItem.isEnabled() ^ !running ) {
           stopItem.setEnabled( running );
         }
 
