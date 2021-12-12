diff --git a/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/AndroidTestStarter.java b/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/AndroidTestStarter.java
index 1b5c574..04a96e3 100644
--- a/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/AndroidTestStarter.java
+++ b/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/AndroidTestStarter.java
@@ -52,7 +52,7 @@
 		Editor editor = prefs.edit();
 		editor.putInt("index", listView.getFirstVisiblePosition());
 		editor.putInt("top", listView.getChildAt(0) == null ? 0 : listView.getChildAt(0).getTop());
-		editor.commit();
+		editor.apply();
 
 		Object o = this.getListAdapter().getItem(position);
 		String testName = o.toString();
