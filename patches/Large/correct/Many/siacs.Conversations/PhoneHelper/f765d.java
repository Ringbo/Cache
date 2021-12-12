diff --git a/src/eu/siacs/conversations/utils/PhoneHelper.java b/src/eu/siacs/conversations/utils/PhoneHelper.java
index bccd721..67623ea 100644
--- a/src/eu/siacs/conversations/utils/PhoneHelper.java
+++ b/src/eu/siacs/conversations/utils/PhoneHelper.java
@@ -74,7 +74,7 @@
 		Cursor mProfileCursor = context.getContentResolver().query(
 				Profile.CONTENT_URI, mProjection, null, null, null);
 
-		if (mProfileCursor.getCount() == 0) {
+		if (mProfileCursor == null || mProfileCursor.getCount() == 0) {
 			return null;
 		} else {
 			mProfileCursor.moveToFirst();
