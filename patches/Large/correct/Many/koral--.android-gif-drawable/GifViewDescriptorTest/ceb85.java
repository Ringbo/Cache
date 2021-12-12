diff --git a/android-gif-drawable/src/androidTest/java/pl/droidsonroids/gif/GifViewDescriptorTest.java b/android-gif-drawable/src/androidTest/java/pl/droidsonroids/gif/GifViewDescriptorTest.java
index 1508c7f..4a7a5ed 100644
--- a/android-gif-drawable/src/androidTest/java/pl/droidsonroids/gif/GifViewDescriptorTest.java
+++ b/android-gif-drawable/src/androidTest/java/pl/droidsonroids/gif/GifViewDescriptorTest.java
@@ -45,7 +45,7 @@
 		final GifTextView view = (GifTextView) rootView.findViewById(R.id.textView);
 
 		assertThat(view.getBackground()).hasLoopCountEqualTo(TEXT_VIEW_LOOP_COUNT);
-		for (final Drawable drawable : view.getCompoundDrawables()) {
+		for (final Drawable drawable : view.getCompoundDrawablesRelative()) {
 			assertThat(drawable).hasLoopCountEqualTo(TEXT_VIEW_LOOP_COUNT);
 		}
 	}
