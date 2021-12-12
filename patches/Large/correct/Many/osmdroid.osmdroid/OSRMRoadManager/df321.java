diff --git a/osmdroid-android/src/main/java/org/osmdroid/bonuspack/routing/OSRMRoadManager.java b/osmdroid-android/src/main/java/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
index 8533ecb..7c64916 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
@@ -199,7 +199,7 @@
 		String url = getUrl(waypoints);
 		Log.d(BonusPackHelper.LOG_TAG, "OSRMRoadManager.getRoad:"+url);
 
-		String jString = BonusPackHelper.requestStringFromUrl(mUserAgent);
+		String jString = BonusPackHelper.requestStringFromUrl(url, mUserAgent);
 		if (jString == null) {
 			Log.e(BonusPackHelper.LOG_TAG, "OSRMRoadManager::getRoad: request failed.");
 			return new Road(waypoints);
