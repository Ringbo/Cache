diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/conformance/DisplayModeTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/conformance/DisplayModeTest.java
index b7eb995..5ee8872 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/conformance/DisplayModeTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/conformance/DisplayModeTest.java
@@ -47,9 +47,9 @@
 		if (a.length != b.length) {
 			throw new AssertionError("Display modes " + Arrays.toString(a) + " aren't equal to display modes " + Arrays.toString(b));
 		}
-		boolean equal = false;
+		boolean equal = true;
 		for (int i = 0; i < a.length; i++) {
-			equal = isDisplayModeEqual(a[i], b[i]);
+			equal = equal && isDisplayModeEqual(a[i], b[i]);
 		}
 		if (!equal) {
 			throw new AssertionError("Display modes " + Arrays.toString(a) + " aren't equal to display modes " + Arrays.toString(b));
