diff --git a/FlipView/Demo/src/com/aphidmobile/flip/demo/MainActivity.java b/FlipView/Demo/src/com/aphidmobile/flip/demo/MainActivity.java
index 55b7e47..2337774 100644
--- a/FlipView/Demo/src/com/aphidmobile/flip/demo/MainActivity.java
+++ b/FlipView/Demo/src/com/aphidmobile/flip/demo/MainActivity.java
@@ -77,7 +77,7 @@
     List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
     addItem(data, "TextViews", FlipTextViewActivity.class);
     addItem(data, "Buttons", FlipButtonActivity.class);
-    addItem(data, "Complex Layouts", FlipDeleteAdapterActivity.class);
+    addItem(data, "Complex Layouts", FlipComplexLayoutActivity.class);
     addItem(data, "Async Content", FlipAsyncContentActivity.class);
     addItem(data, "Event Listener", FlipTextViewAltActivity.class);
     addItem(data, "Horizontal", FlipHorizontalLayoutActivity.class);
