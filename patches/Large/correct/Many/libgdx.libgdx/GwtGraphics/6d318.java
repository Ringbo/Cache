diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtGraphics.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtGraphics.java
index a21d1c3..356f702 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtGraphics.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtGraphics.java
@@ -264,7 +264,7 @@
 
 	@Override
 	public float getDensity () {
-		return 96.0 / 160;
+		return 96.0f / 160;
 	}
 
 	@Override
