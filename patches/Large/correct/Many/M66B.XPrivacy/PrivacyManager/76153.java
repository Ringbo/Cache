diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 17cbb4a..e3a1471 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -596,7 +596,7 @@
 					} else {
 						if (cursor.moveToNext()) {
 							value = cursor.getString(cursor.getColumnIndex(PrivacyProvider.COL_VALUE));
-							if (value == null)
+							if (value == null || value.equals(""))
 								value = defaultValue;
 							fallback = false;
 						} else {
