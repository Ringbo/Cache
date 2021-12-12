diff --git a/packages/SystemUI/src/com/android/systemui/qs/tileimpl/QSIconViewImpl.java b/packages/SystemUI/src/com/android/systemui/qs/tileimpl/QSIconViewImpl.java
index a751ef4..5be1ec6 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/tileimpl/QSIconViewImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/tileimpl/QSIconViewImpl.java
@@ -89,7 +89,7 @@
                     : state.icon.getInvisibleDrawable(mContext) : null;
             int padding = state.icon != null ? state.icon.getPadding() : 0;
             if (d != null) {
-                d.setAutoMirrored(true);
+                d.setAutoMirrored(false);
             }
             iv.setImageDrawable(d);
             iv.setTag(R.id.qs_icon_tag, state.icon);
