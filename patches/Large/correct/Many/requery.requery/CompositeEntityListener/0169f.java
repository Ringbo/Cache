diff --git a/requery/src/main/java/io/requery/sql/CompositeEntityListener.java b/requery/src/main/java/io/requery/sql/CompositeEntityListener.java
index cdddfd9..824c0db 100644
--- a/requery/src/main/java/io/requery/sql/CompositeEntityListener.java
+++ b/requery/src/main/java/io/requery/sql/CompositeEntityListener.java
@@ -30,7 +30,7 @@
 
     private boolean enableStateListeners;
 
-    public void enableStateListeners(boolean enabled) {
+    void enableStateListeners(boolean enabled) {
         this.enableStateListeners = enabled;
     }
 
