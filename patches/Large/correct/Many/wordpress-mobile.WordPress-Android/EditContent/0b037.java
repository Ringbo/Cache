diff --git a/src/org/wordpress/android/EditContent.java b/src/org/wordpress/android/EditContent.java
index 3a3e7f3..83a2d1c 100644
--- a/src/org/wordpress/android/EditContent.java
+++ b/src/org/wordpress/android/EditContent.java
@@ -730,7 +730,7 @@
 	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
 		super.onActivityResult(requestCode, resultCode, data);
 		if (data != null
-				&& (resultCode != RESULT_CANCELED || (requestCode == 1 || requestCode == 3))) {
+				|| (resultCode != RESULT_CANCELED || (requestCode == 1 || requestCode == 3))) {
 			Bundle extras;
 			switch (requestCode) {
 			case 0:
