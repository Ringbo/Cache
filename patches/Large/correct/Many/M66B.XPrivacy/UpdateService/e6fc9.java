diff --git a/src/biz/bokhorst/xprivacy/UpdateService.java b/src/biz/bokhorst/xprivacy/UpdateService.java
index 7c6e807..0ed4238 100644
--- a/src/biz/bokhorst/xprivacy/UpdateService.java
+++ b/src/biz/bokhorst/xprivacy/UpdateService.java
@@ -125,7 +125,7 @@
 			if (first == 0)
 				if (listSetting.size() > 0 || listRestriction.size() > 0)
 					first = i;
-			if (first > 0)
+			if (first > 0 && first < listApp.size())
 				notifyProgress(context, Util.NOTIFY_MIGRATE, format, 100 * (i - first) / (listApp.size() - first));
 		}
 		if (first == 0)
@@ -157,7 +157,7 @@
 				if (first == 0)
 					if (listRestriction.size() > 0)
 						first = i;
-				if (first > 0)
+				if (first > 0 && first < listApp.size())
 					notifyProgress(context, Util.NOTIFY_UPGRADE, format, 100 * (i - first) / (listApp.size() - first));
 			}
 			if (first == 0)
@@ -185,7 +185,7 @@
 			if (first == 0)
 				if (listSetting.size() > 0)
 					first = i;
-			if (first > 0)
+			if (first > 0 && first < listApp.size())
 				notifyProgress(context, Util.NOTIFY_RANDOMIZE, format, 100 * (i - first) / (listApp.size() - first));
 		}
 		if (first == 0)
