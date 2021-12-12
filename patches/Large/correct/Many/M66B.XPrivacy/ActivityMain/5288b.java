diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 071cd35..c369151 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -899,7 +899,7 @@
 					if (fRestricted)
 						if (mRestrictionName == null) {
 							for (boolean restricted : PrivacyManager.getRestricted(getApplicationContext(),
-									xAppInfo.getUid(), false))
+									xAppInfo.getUid(), true))
 								if (restricted) {
 									someRestricted = true;
 									break;
