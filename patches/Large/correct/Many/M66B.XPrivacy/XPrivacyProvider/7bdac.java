diff --git a/src/biz/bokhorst/xprivacy/XPrivacyProvider.java b/src/biz/bokhorst/xprivacy/XPrivacyProvider.java
index fa54f9b..20ffa2c 100644
--- a/src/biz/bokhorst/xprivacy/XPrivacyProvider.java
+++ b/src/biz/bokhorst/xprivacy/XPrivacyProvider.java
@@ -74,7 +74,7 @@
 				return mc;
 			} else if (sUriMatcher.match(uri) == TYPE_LASTUSE && selectionArgs.length == 1) {
 				// Return usage
-				int uid = Integer.parseInt(selectionArgs[1]);
+				int uid = Integer.parseInt(selectionArgs[0]);
 				MatrixCursor mc = new MatrixCursor(new String[] { COL_UID, COL_NAME, COL_LASTUSE });
 				mc.addRow(new Object[] { uid, permissionName, prefs.getLong(getUsagePref(uid, permissionName), 0) });
 				return mc;
