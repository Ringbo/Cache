diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 492803d..c5e3ea8 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -1332,7 +1332,7 @@
 					// Get all/some restricted
 					if (mRestrictionName == null)
 						for (boolean restricted : PrivacyManager.getRestricted(holder.row.getContext(),
-								xAppInfo.getUid(), false)) {
+								xAppInfo.getUid(), true)) {
 							allRestricted = allRestricted && restricted;
 							someRestricted = someRestricted || restricted;
 						}
