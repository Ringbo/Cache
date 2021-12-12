diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/preloader/PreloaderBundleGenerator.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/preloader/PreloaderBundleGenerator.java
index 63d0d38..ddf304f 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/preloader/PreloaderBundleGenerator.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/preloader/PreloaderBundleGenerator.java
@@ -229,7 +229,7 @@
 			String[] tokens = paths.split(",");
 			String path = null;
 			for(String token: tokens) {
-				if(new FileWrapper(token).exists()) {
+				if (new FileWrapper(token).exists() || new FileWrapper(token).mkdirs()) {
 					path = token;
 				}
 			}
