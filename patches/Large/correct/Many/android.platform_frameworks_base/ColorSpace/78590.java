diff --git a/graphics/java/android/graphics/ColorSpace.java b/graphics/java/android/graphics/ColorSpace.java
index 67504cf..f2957a3 100644
--- a/graphics/java/android/graphics/ColorSpace.java
+++ b/graphics/java/android/graphics/ColorSpace.java
@@ -1592,7 +1592,7 @@
                 Math.abs(a.a - b.a) < 1e-3 &&
                 Math.abs(a.b - b.b) < 1e-3 &&
                 Math.abs(a.c - b.c) < 1e-3 &&
-                Math.abs(a.d - b.d) < 1e-3 &&
+                Math.abs(a.d - b.d) < 2e-3 && // Special case for variations in sRGB OETF/EOTF
                 Math.abs(a.e - b.e) < 1e-3 &&
                 Math.abs(a.f - b.f) < 1e-3 &&
                 Math.abs(a.g - b.g) < 1e-3;
