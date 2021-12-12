diff --git a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
index f5b8b08..fc2f824 100644
--- a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
+++ b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
@@ -755,7 +755,7 @@
         getUpdatedBounds(balloon.myLayeredPane.getSize(), balloon.myForcedBounds, balloon.myComp.getPreferredSize(), balloon.myShowPointer,
                          balloon.myTargetPoint, balloon.myContainerInsets, balloon.myCalloutshift);
 
-      final Point point = getShiftedPoint(bounds.getLocation(), balloon.getShadowBorderSize());
+      final Point point = getShiftedPoint(bounds.getLocation(), -balloon.getShadowBorderSize());
       bounds.setLocation(point);
       balloon.myComp._setBounds(bounds);
     }
@@ -961,7 +961,7 @@
 
     @Override
     public Point getShiftedPoint(Point targetPoint, int shift) {
-      return new Point(targetPoint.x, targetPoint.y + shift);
+      return new Point(targetPoint.x, targetPoint.y - shift);
     }
 
     @Override
@@ -1091,7 +1091,7 @@
 
     @Override
     public Point getShiftedPoint(Point targetPoint, int shift) {
-      return new Point(targetPoint.x + shift, targetPoint.y);
+      return new Point(targetPoint.x - shift, targetPoint.y);
     }
 
     @Override
@@ -1482,7 +1482,7 @@
 
           //pane.setBorder(new LineBorder(Color.blue));
 
-          balloon.set(new BalloonImpl(new JLabel("FUCK"), Color.black, MessageType.ERROR.getPopupBackground(), true, true, true, true, true, 0, true, null, false, 500, 5, 0, 0, false, "This is the title",
+          balloon.set(new BalloonImpl(new JLabel("FUCK"), Color.black, MessageType.ERROR.getPopupBackground(), true, true, true, true, true, 0, true, null, false, 500, 25, 0, 0, false, "This is the title",
                                       new Insets(2, 2, 2, 2), true, false, Layer.normal));
           balloon.get().setShowPointer(true);
 
