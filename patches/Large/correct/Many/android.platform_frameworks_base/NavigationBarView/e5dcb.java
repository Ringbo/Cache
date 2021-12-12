diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
index 343d9ab..95b6ae3 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/NavigationBarView.java
@@ -293,9 +293,9 @@
                         mCurrentView.getWidth(), mCurrentView.getHeight(),
                         visibilityToString(mCurrentView.getVisibility())));
 
-        pw.println(String.format("      disabled=0x%08x vertical=%s hidden=%s low=%s menu=%s",
+        pw.println(String.format("      disabled=0x%08x portrait=%s hidden=%s low=%s menu=%s",
                         mDisabledFlags,
-                        mVertical ? "true" : "false",
+                        mNaturallyPortrait ? "true" : "false",
                         mHidden ? "true" : "false",
                         mLowProfile ? "true" : "false",
                         mShowMenu ? "true" : "false"));
