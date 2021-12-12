diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index b96cdda..56ec6ad 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -819,7 +819,7 @@
 
 		if (name.equals("GSF_ID")) {
 			long v = r.nextLong();
-			return Long.toHexString(v).toUpperCase();
+			return Long.toString(v, 16).toUpperCase();
 		}
 
 		if (name.equals("AdvertisingId"))
