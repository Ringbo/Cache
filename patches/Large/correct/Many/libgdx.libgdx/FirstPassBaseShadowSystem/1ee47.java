diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/g3d/shadows/system/FirstPassBaseShadowSystem.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/g3d/shadows/system/FirstPassBaseShadowSystem.java
index 9fe937c..cefd722 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/g3d/shadows/system/FirstPassBaseShadowSystem.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/g3d/shadows/system/FirstPassBaseShadowSystem.java
@@ -53,7 +53,7 @@
 
 	@Override
 	protected void endPass (int n) {
-		super.beginPass(n);
+		super.endPass(n);
 		if (n == FIRST_PASS) endPass1();
 	};
 
