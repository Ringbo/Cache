diff --git a/src/web/core/src/main/java/org/geoserver/web/data/store/panel/ColorPickerPanel.java b/src/web/core/src/main/java/org/geoserver/web/data/store/panel/ColorPickerPanel.java
index 8a43a8a..2511ebe 100644
--- a/src/web/core/src/main/java/org/geoserver/web/data/store/panel/ColorPickerPanel.java
+++ b/src/web/core/src/main/java/org/geoserver/web/data/store/panel/ColorPickerPanel.java
@@ -26,11 +26,6 @@
 
 	/**
 	 * 
-	 * @param id
-	 * @param paramsMap
-	 * @param paramName
-	 * @param paramLabel
-	 * @param required
 	 * @param validators
 	 *            any extra validator that should be added to the input field,
 	 *            or {@code null}
@@ -52,8 +47,7 @@
 		// passing in a Color.class param is just a trick to force the component
 		// to use
 		// the converter both ways
-		ColorPickerField textField = new ColorPickerField("paramValue",
-				paramVale, Color.class) {
+		ColorPickerField textField = new ColorPickerField("paramValue", paramVale) {
 			@Override
 			public IConverter getConverter(Class type) {
 				return new IConverter() {
