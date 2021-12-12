diff --git a/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java b/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
index 25d2487..40e5755 100644
--- a/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
+++ b/platform/platform-impl/src/com/intellij/ide/IdeTooltipManager.java
@@ -172,7 +172,7 @@
 
     boolean centerDefault = Boolean.TRUE.equals(comp.getClientProperty(UIUtil.CENTER_TOOLTIP_DEFAULT));
     boolean centerStrict = Boolean.TRUE.equals(comp.getClientProperty(UIUtil.CENTER_TOOLTIP_STRICT));
-    int shift = centerStrict ? 0 : (centerDefault ? -4 : 0);
+    int shift = centerStrict ? 0 : (centerDefault ? 4 : 0);
 
     queueShow(comp, me, centerStrict || centerDefault, shift, -shift, -shift);
   }
@@ -281,7 +281,7 @@
       .setBorderColor(border)
       .setAnimationCycle(animationEnabled ? Registry.intValue("ide.tooltip.animationCycle") : 0)
       .setShowCallout(true)
-      .setCalloutShift((small && tooltip.getCalloutShift() == 0) ? -2 : tooltip.getCalloutShift())
+      .setCalloutShift((small && tooltip.getCalloutShift() == 0) ? 2 : tooltip.getCalloutShift())
       .setPositionChangeXShift(tooltip.getPositionChangeX())
       .setPositionChangeYShift(tooltip.getPositionChangeY())
       .setHideOnKeyOutside(!tooltip.isExplicitClose())
