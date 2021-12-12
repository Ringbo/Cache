diff --git a/engine/src/core/com/jme3/util/NativeObject.java b/engine/src/core/com/jme3/util/NativeObject.java
index 4827265..7e88fd4 100644
--- a/engine/src/core/com/jme3/util/NativeObject.java
+++ b/engine/src/core/com/jme3/util/NativeObject.java
@@ -208,7 +208,7 @@
      */
     public void dispose() {
         if (objectManager != null) {
-            objectManager.markUnusedObject(this);
+            objectManager.enqueueUnusedObject(this);
         }
     }
 }
