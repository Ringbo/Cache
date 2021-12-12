diff --git a/bottomsheet-sample/src/main/java/com/flipboard/bottomsheet/sample/PickerActivity.java b/bottomsheet-sample/src/main/java/com/flipboard/bottomsheet/sample/PickerActivity.java
index 95bc653..829a9ec 100644
--- a/bottomsheet-sample/src/main/java/com/flipboard/bottomsheet/sample/PickerActivity.java
+++ b/bottomsheet-sample/src/main/java/com/flipboard/bottomsheet/sample/PickerActivity.java
@@ -67,7 +67,7 @@
 
                 // Add custom mixin example
                 Drawable customDrawable = ResourcesCompat.getDrawable(getResources(), R.mipmap.ic_launcher, null);
-                IntentPickerSheetView.ActivityInfo customInfo = new IntentPickerSheetView.ActivityInfo(customDrawable, "Custom mix-in", MainActivity.class);
+                IntentPickerSheetView.ActivityInfo customInfo = new IntentPickerSheetView.ActivityInfo(customDrawable, "Custom mix-in", PickerActivity.this, MainActivity.class);
                 intentPickerSheet.setMixins(Collections.singletonList(customInfo));
 
                 bottomSheetLayout.showWithSheetView(intentPickerSheet);
