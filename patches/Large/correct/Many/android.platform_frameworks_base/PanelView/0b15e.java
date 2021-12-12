diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
index f6d6af1..873d528 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
@@ -966,7 +966,7 @@
 
     public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
         pw.println(String.format("[PanelView(%s): expandedHeight=%f maxPanelHeight=%d closing=%s"
-                + " tracking=%s justPeeked=%s peekAnim=%s%s timeAnim=%s%s"
+                + " tracking=%s justPeeked=%s peekAnim=%s%s timeAnim=%s%s touchDisabled=%s"
                 + "]",
                 this.getClass().getSimpleName(),
                 getExpandedHeight(),
@@ -975,7 +975,8 @@
                 mTracking?"T":"f",
                 mJustPeeked?"T":"f",
                 mPeekAnimator, ((mPeekAnimator!=null && mPeekAnimator.isStarted())?" (started)":""),
-                mHeightAnimator, ((mHeightAnimator !=null && mHeightAnimator.isStarted())?" (started)":"")
+                mHeightAnimator, ((mHeightAnimator !=null && mHeightAnimator.isStarted())?" (started)":""),
+                mTouchDisabled?"T":"f"
         ));
     }
 
