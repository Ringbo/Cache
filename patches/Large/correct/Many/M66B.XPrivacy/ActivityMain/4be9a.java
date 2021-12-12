diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 7cd07db..71125fe 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -526,7 +526,7 @@
 		if (checkField(WifiInfo.class, "mWifiSsid"))
 			try {
 				Class<?> clazz = Class.forName("android.net.wifi.WifiSsid");
-				if (!checkField(clazz, "octets", ByteArrayOutputStream.class))
+				if (!checkField(clazz, "octets"))
 					reportClass(clazz);
 			} catch (Throwable ex) {
 				sendSupportInfo(ex.toString());
