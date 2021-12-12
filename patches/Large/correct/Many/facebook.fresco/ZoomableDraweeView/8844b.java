diff --git a/samples/zoomable/src/main/java/com/facebook/samples/zoomable/ZoomableDraweeView.java b/samples/zoomable/src/main/java/com/facebook/samples/zoomable/ZoomableDraweeView.java
index fa2cd88..d35b51b 100644
--- a/samples/zoomable/src/main/java/com/facebook/samples/zoomable/ZoomableDraweeView.java
+++ b/samples/zoomable/src/main/java/com/facebook/samples/zoomable/ZoomableDraweeView.java
@@ -280,7 +280,7 @@
       FLog.v(TAG, "onTouchEvent: view %x, handled by the super", this.hashCode());
       return true;
     }
-    return true;
+    return false;
   }
 
   @Override
