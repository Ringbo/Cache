diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
index f3aba4f..e8170fb 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/QuickStatusBarHeader.java
@@ -309,7 +309,7 @@
 
     public void setupHost(final QSTileHost host) {
         mHost = host;
-        host.setHeaderView(this);
+        host.setHeaderView(mExpandIndicator);
         mHeaderQsPanel.setQSPanelAndHeader(mQsPanel, this);
         mHeaderQsPanel.setHost(host, null /* No customization in header */);
         setUserInfoController(host.getUserInfoController());
