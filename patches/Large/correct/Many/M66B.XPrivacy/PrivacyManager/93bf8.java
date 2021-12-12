diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 159b154..9b3229e 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -875,12 +875,12 @@
 		// 1 m ~ 0,000009 degrees
 		// Christmas Island ~ -10.5 / 105.667
 
-		if (sLat == null)
+		if (sLat == null || "".equals(sLat))
 			location.setLatitude(-10.5);
 		else
 			location.setLatitude(Float.parseFloat(sLat) + (Math.random() * 2.0 - 1.0) * location.getAccuracy() * 9e-6);
 
-		if (sLon == null)
+		if (sLon == null || "".equals(sLon))
 			location.setLongitude(105.667);
 		else
 			location.setLongitude(Float.parseFloat(sLon) + (Math.random() * 2.0 - 1.0) * location.getAccuracy() * 9e-6);
