diff --git a/src/biz/bokhorst/xprivacy/PrivacyService.java b/src/biz/bokhorst/xprivacy/PrivacyService.java
index 57da778..e6cb9cc 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyService.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyService.java
@@ -167,7 +167,7 @@
 			XActivityManagerService.setSemaphore(mOndemandSemaphore);
 
 			// Get context
-			Field fContext = am.getClass().getDeclaredField("mContext");
+			Field fContext = am.getClass().getField("mContext");
 			fContext.setAccessible(true);
 			mContext = (Context) fContext.get(am);
 
