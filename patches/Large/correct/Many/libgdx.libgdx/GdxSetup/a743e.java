diff --git a/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetup.java b/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetup.java
index 1b8ae82..2916fb9 100644
--- a/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetup.java
+++ b/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetup.java
@@ -42,7 +42,7 @@
 		
 		String packageDir = packageName.replace('.', '/');
 		String sdkPath = sdkLocation.replace('\\', '/');
-		if(isSdkLocationValid(sdkLocation)) {
+		if(!isSdkLocationValid(sdkLocation)) {
 			System.out.println("Android SDK location '" + sdkLocation + "' doesn't contain an SDK");
 		}
 
