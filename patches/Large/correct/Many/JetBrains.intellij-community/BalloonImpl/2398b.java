diff --git a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
index ed0a98a..f5b8b08 100644
--- a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
+++ b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
@@ -755,7 +755,7 @@
         getUpdatedBounds(balloon.myLayeredPane.getSize(), balloon.myForcedBounds, balloon.myComp.getPreferredSize(), balloon.myShowPointer,
                          balloon.myTargetPoint, balloon.myContainerInsets, balloon.myCalloutshift);
 
-      final Point point = getShiftedPoint(bounds.getLocation(), -balloon.getShadowBorderSize());
+      final Point point = getShiftedPoint(bounds.getLocation(), balloon.getShadowBorderSize());
       bounds.setLocation(point);
       balloon.myComp._setBounds(bounds);
     }
