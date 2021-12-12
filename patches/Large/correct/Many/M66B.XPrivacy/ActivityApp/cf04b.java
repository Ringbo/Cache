diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index 134452d..d99b980 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -190,7 +190,7 @@
 				@Override
 				public void onClick(View view) {
 					boolean ondemand = !PrivacyManager.getSettingBool(-mAppInfo.getUid(),
-							PrivacyManager.cSettingOnDemand, true, false);
+							PrivacyManager.cSettingOnDemand, false, false);
 					PrivacyManager.setSetting(mAppInfo.getUid(), PrivacyManager.cSettingOnDemand,
 							Boolean.toString(ondemand));
 					imgCbOnDemand.setImageBitmap(ondemand ? getOnDemandCheckBox() : getOffCheckBox());
