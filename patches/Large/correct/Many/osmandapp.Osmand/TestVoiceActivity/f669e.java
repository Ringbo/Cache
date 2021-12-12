diff --git a/OsmAnd/src/net/osmand/plus/development/TestVoiceActivity.java b/OsmAnd/src/net/osmand/plus/development/TestVoiceActivity.java
index b08c8d5..db3f7c0 100644
--- a/OsmAnd/src/net/osmand/plus/development/TestVoiceActivity.java
+++ b/OsmAnd/src/net/osmand/plus/development/TestVoiceActivity.java
@@ -295,9 +295,9 @@
 		button.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
 		if (!description.startsWith("\u25BA (")) {
 			// Section headline buttons
-			button.setPadding(80, 20, 80, 5);
+			button.setPadding(10, 20, 10, 5);
 		} else {
-			button.setPadding(10, 5, 10, 5);
+			button.setPadding(50, 5, 10, 5);
 		}
 		if (description.startsWith("\u25BA (11.1)")) {
 			infoButton = button;
