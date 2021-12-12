diff --git a/graphics/java/android/graphics/ComposeShader.java b/graphics/java/android/graphics/ComposeShader.java
index e88211a..8d5c913 100644
--- a/graphics/java/android/graphics/ComposeShader.java
+++ b/graphics/java/android/graphics/ComposeShader.java
@@ -43,7 +43,7 @@
                 (mode != null) ? mode.native_instance : 0);
         if (mode instanceof PorterDuffXfermode) {
             PorterDuff.Mode pdMode = ((PorterDuffXfermode) mode).mode;
-            native_shader = nativePostCreate1(native_instance, shaderA.native_shader,
+            native_shader = nativePostCreate2(native_instance, shaderA.native_shader,
                     shaderB.native_shader, pdMode != null ? pdMode.nativeInt : 0);
         } else {
             native_shader = nativePostCreate1(native_instance, shaderA.native_shader,
