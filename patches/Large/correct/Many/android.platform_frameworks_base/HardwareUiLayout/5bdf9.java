diff --git a/packages/SystemUI/src/com/android/systemui/HardwareUiLayout.java b/packages/SystemUI/src/com/android/systemui/HardwareUiLayout.java
index 3bdb247..98dc321 100644
--- a/packages/SystemUI/src/com/android/systemui/HardwareUiLayout.java
+++ b/packages/SystemUI/src/com/android/systemui/HardwareUiLayout.java
@@ -89,7 +89,7 @@
         mEdgeBleed = Settings.Secure.getInt(getContext().getContentResolver(),
                 EDGE_BLEED, 0) != 0;
         mRoundedDivider = Settings.Secure.getInt(getContext().getContentResolver(),
-                ROUNDED_DIVIDER, 1) != 0;
+                ROUNDED_DIVIDER, 0) != 0;
         updateEdgeMargin(mEdgeBleed ? 0 : getEdgePadding());
         mBackground = new HardwareBgDrawable(mRoundedDivider, !mEdgeBleed, getContext());
         if (mChild != null) {
