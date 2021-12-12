diff --git a/OsmAnd/src/net/osmand/plus/audionotes/SettingsAudioVideoActivity.java b/OsmAnd/src/net/osmand/plus/audionotes/SettingsAudioVideoActivity.java
index ea791d2..babd535 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/SettingsAudioVideoActivity.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/SettingsAudioVideoActivity.java
@@ -200,19 +200,19 @@
 
 			List<String> qNames = new ArrayList<>();
 			List<Integer> qValues = new ArrayList<>();
-			if (CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_LOW)) {
+			if (Build.VERSION.SDK_INT < 11 || CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_LOW)) {
 				qNames.add(getString(R.string.av_video_quality_low));
 				qValues.add(CamcorderProfile.QUALITY_LOW);
 			}
-			if (CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_480P)) {
+			if (Build.VERSION.SDK_INT >= 11 && CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_480P)) {
 				qNames.add("720 x 480 (480p)");
 				qValues.add(CamcorderProfile.QUALITY_480P);
 			}
-			if (CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_720P)) {
+			if (Build.VERSION.SDK_INT >= 11 && CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_720P)) {
 				qNames.add("1280 x 720 (720p)");
 				qValues.add(CamcorderProfile.QUALITY_720P);
 			}
-			if (CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_1080P)) {
+			if (Build.VERSION.SDK_INT >= 11 && CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_1080P)) {
 				qNames.add("1920 x 1080 (1080p)");
 				qValues.add(CamcorderProfile.QUALITY_1080P);
 			}
@@ -220,7 +220,7 @@
 				qNames.add("3840x2160 (2160p)");
 				qValues.add(CamcorderProfile.QUALITY_2160P);
 			}
-			if (CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_HIGH)) {
+			if (Build.VERSION.SDK_INT < 11 || CamcorderProfile.hasProfile(CamcorderProfile.QUALITY_HIGH)) {
 				qNames.add(getString(R.string.av_video_quality_high));
 				qValues.add(CamcorderProfile.QUALITY_HIGH);
 			}
