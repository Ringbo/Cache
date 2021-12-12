diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
index 6fb4dfa..7ab74cc 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
@@ -188,7 +188,7 @@
 		final OsmandTextFieldBoxes longitudeBox = (OsmandTextFieldBoxes) mainView.findViewById(R.id.longitude_box);
 		textFieldBoxes.add(longitudeBox);
 		final OsmandTextFieldBoxes nameBox = (OsmandTextFieldBoxes) mainView.findViewById(R.id.name_box);
-		nameBox.setEndIcon(iconsCache.getThemedIcon(R.drawable.ic_action_keyboard));
+		nameBox.setEndIcon(iconsCache.getIcon(R.drawable.ic_action_keyboard, R.color.coordinate_input_keyboard_icon_color));
 		nameBox.getEndIconImageButton().setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View view) {
