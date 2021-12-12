diff --git a/core/java/android/view/HardwareRenderer.java b/core/java/android/view/HardwareRenderer.java
index 39deca2..da925c7 100644
--- a/core/java/android/view/HardwareRenderer.java
+++ b/core/java/android/view/HardwareRenderer.java
@@ -994,7 +994,7 @@
 
             EGLContext context = egl.eglCreateContext(eglDisplay, eglConfig, EGL_NO_CONTEXT,
                     mGlVersion != 0 ? attribs : null);
-            if (context == null) {
+            if (context == null || context == EGL_NO_CONTEXT) {
                 //noinspection ConstantConditions
                 throw new IllegalStateException(
                         "Could not create an EGL context. eglCreateContext failed with error: " +
