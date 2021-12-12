diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DemoStatusIcons.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DemoStatusIcons.java
index 682c01c..6cb5bcc 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/DemoStatusIcons.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/DemoStatusIcons.java
@@ -159,7 +159,7 @@
             }
         }
         StatusBarIcon icon = new StatusBarIcon(iconPkg, UserHandle.CURRENT, iconId, 0, 0, "Demo");
-        StatusBarIconView v = new StatusBarIconView(getContext(), null);
+        StatusBarIconView v = new StatusBarIconView(getContext(), null, null);
         v.setTag(slot);
         v.set(icon);
         addView(v, 0, new LinearLayout.LayoutParams(mIconSize, mIconSize));
