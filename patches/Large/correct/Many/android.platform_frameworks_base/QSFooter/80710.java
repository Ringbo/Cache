diff --git a/packages/SystemUI/src/com/android/systemui/qs/QSFooter.java b/packages/SystemUI/src/com/android/systemui/qs/QSFooter.java
index 4ac629d..ccb28e9 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/QSFooter.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/QSFooter.java
@@ -188,7 +188,8 @@
                         profileOwner, profileVpn, primaryVpn);
             } else {
                 if (isBranded) {
-                    return mContext.getString(R.string.branded_monitoring_description_app_personal);
+                    return mContext.getString(R.string.branded_monitoring_description_app_personal,
+                            primaryVpn);
                 } else {
                     return mContext.getString(R.string.monitoring_description_app_personal,
                             primaryVpn);
