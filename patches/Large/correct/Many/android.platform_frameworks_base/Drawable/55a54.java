diff --git a/graphics/java/android/graphics/drawable/Drawable.java b/graphics/java/android/graphics/drawable/Drawable.java
index f29b9f0..76dd1c8 100644
--- a/graphics/java/android/graphics/drawable/Drawable.java
+++ b/graphics/java/android/graphics/drawable/Drawable.java
@@ -908,7 +908,7 @@
             InputStream is, String srcName) {
         Trace.traceBegin(Trace.TRACE_TAG_RESOURCES, srcName != null ? srcName : "Unknown drawable");
         try {
-            return createFromResourceStream(res, value, is, srcName);
+            return createFromResourceStream(res, value, is, srcName, null);
         } finally {
             Trace.traceEnd(Trace.TRACE_TAG_RESOURCES);
         }
