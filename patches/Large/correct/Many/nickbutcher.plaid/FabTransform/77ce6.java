diff --git a/app/src/main/java/io/plaidapp/ui/transitions/FabTransform.java b/app/src/main/java/io/plaidapp/ui/transitions/FabTransform.java
index 6afe883..cb06813 100644
--- a/app/src/main/java/io/plaidapp/ui/transitions/FabTransform.java
+++ b/app/src/main/java/io/plaidapp/ui/transitions/FabTransform.java
@@ -198,14 +198,14 @@
                     view.getWidth() / 2,
                     view.getHeight() / 2,
                     startBounds.width() / 2,
-                    (float) Math.hypot(endBounds.width() / 2, endBounds.width() / 2));
+                    (float) Math.hypot(endBounds.width() / 2, endBounds.height() / 2));
             circularReveal.setInterpolator(
                     AnimUtils.getFastOutLinearInInterpolator(sceneRoot.getContext()));
         } else {
             circularReveal = ViewAnimationUtils.createCircularReveal(view,
                     view.getWidth() / 2,
                     view.getHeight() / 2,
-                    (float) Math.hypot(startBounds.width() / 2, startBounds.width() / 2),
+                    (float) Math.hypot(startBounds.width() / 2, startBounds.height() / 2),
                     endBounds.width() / 2);
             circularReveal.setInterpolator(
                     AnimUtils.getLinearOutSlowInInterpolator(sceneRoot.getContext()));
