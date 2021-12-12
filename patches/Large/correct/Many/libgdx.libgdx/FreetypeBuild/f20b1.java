diff --git a/extensions/gdx-freetype/src/com/badlogic/gdx/graphics/g2d/freetype/FreetypeBuild.java b/extensions/gdx-freetype/src/com/badlogic/gdx/graphics/g2d/freetype/FreetypeBuild.java
index d4208e2..fc22998 100644
--- a/extensions/gdx-freetype/src/com/badlogic/gdx/graphics/g2d/freetype/FreetypeBuild.java
+++ b/extensions/gdx-freetype/src/com/badlogic/gdx/graphics/g2d/freetype/FreetypeBuild.java
@@ -127,7 +127,7 @@
 		ios.cFlags += " -DFT2_BUILD_LIBRARY";
 		ios.cppFlags += " -DFT2_BUILD_LIBRARY";
 
-		new NativeCodeGenerator().generate();
+		new NativeCodeGenerator().generate("src", "bin:../../gdx/bin", "jni");
 		new AntScriptGenerator()
 			.generate(new BuildConfig("gdx-freetype"), win32home, win32, win64, lin32, lin64, mac, mac64, android, ios);
 // BuildExecutor.executeAnt("jni/build-windows32home.xml", "-v clean");
