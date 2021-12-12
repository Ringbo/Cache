diff --git a/android/app/src/main/java/com/tencent/wstt/gt/activity/GTACSettingActivity.java b/android/app/src/main/java/com/tencent/wstt/gt/activity/GTACSettingActivity.java
index 64064f0..48dcd97 100644
--- a/android/app/src/main/java/com/tencent/wstt/gt/activity/GTACSettingActivity.java
+++ b/android/app/src/main/java/com/tencent/wstt/gt/activity/GTACSettingActivity.java
@@ -90,7 +90,7 @@
 
 	@Override
 	protected void onPause() {
-		super.onResume();
+		super.onPause();
 		cb_show_Switch.setOnCheckedChangeListener(null);
 		this.show_quickswitch.setOnCheckedChangeListener(null);
 	}
