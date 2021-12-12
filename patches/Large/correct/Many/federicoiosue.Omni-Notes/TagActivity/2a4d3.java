diff --git a/src/it/feio/android/omninotes/TagActivity.java b/src/it/feio/android/omninotes/TagActivity.java
index 8fd9e38..3176630 100644
--- a/src/it/feio/android/omninotes/TagActivity.java
+++ b/src/it/feio/android/omninotes/TagActivity.java
@@ -119,7 +119,7 @@
 		description.setText(tag.getDescription());
 		// Reset picker to saved color
 		String color = tag.getColor();
-		if (color.length() > 0) {
+		if (color != null && color.length() > 0) {
 			picker.setColor(Integer.parseInt(color));
 			picker.setOldCenterColor(Integer.parseInt(color));
 		}
