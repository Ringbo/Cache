diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
index 12035b9..023c4d0 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NotificationPanelView.java
@@ -789,8 +789,9 @@
     }
 
     private boolean isInQsArea(float x, float y) {
-        return (x >= mQsContainer.getX() && x <= mQsContainer.getX() + mQsContainer.getWidth()) &&
-                (y <= mNotificationStackScroller.getBottomMostNotificationBottom()
+        return (x >= mQsDensityContainer.getX()
+                && x <= mQsDensityContainer.getX() + mQsDensityContainer.getWidth())
+                && (y <= mNotificationStackScroller.getBottomMostNotificationBottom()
                 || y <= mQsContainer.getY() + mQsContainer.getHeight());
     }
 
@@ -1337,7 +1338,8 @@
             return false;
         }
         View header = mKeyguardShowing ? mKeyguardStatusBar : mQsContainer.getHeader();
-        boolean onHeader = x >= header.getX() && x <= header.getX() + header.getWidth()
+        boolean onHeader = x >= mQsDensityContainer.getX()
+                && x <= mQsDensityContainer.getX() + mQsDensityContainer.getWidth()
                 && y >= header.getTop() && y <= header.getBottom();
         if (mQsExpanded) {
             return onHeader || (yDiff < 0 && isInQsArea(x, y));
