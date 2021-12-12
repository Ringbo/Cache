diff --git a/ion/src/com/koushikdutta/ion/IonDrawable.java b/ion/src/com/koushikdutta/ion/IonDrawable.java
index ff10238..5a7ecfd 100644
--- a/ion/src/com/koushikdutta/ion/IonDrawable.java
+++ b/ion/src/com/koushikdutta/ion/IonDrawable.java
@@ -94,7 +94,7 @@
             drawable.setBitmap(result, result.loadedFrom);
             imageView.setImageDrawable(drawable);
             IonBitmapRequestBuilder.doAnimation(imageView, inAnimation, inAnimationResource);
-            imageViewFuture.setComplete(imageView);
+            imageViewFuture.setComplete(e, imageView);
 
         }
     }
