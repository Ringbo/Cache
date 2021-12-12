diff --git a/graphics/java/android/graphics/drawable/Drawable.java b/graphics/java/android/graphics/drawable/Drawable.java
index cc2a595..b94d3f1 100644
--- a/graphics/java/android/graphics/drawable/Drawable.java
+++ b/graphics/java/android/graphics/drawable/Drawable.java
@@ -917,7 +917,7 @@
             InputStream is, String srcName, Theme theme) {
         Trace.traceBegin(Trace.TRACE_TAG_RESOURCES, srcName != null ? srcName : "Unknown drawable");
         try {
-            return createFromResourceStreamThemed(res, value, is, srcName, null, theme);
+            return createFromResourceStream(res, value, is, srcName, null);
         } finally {
             Trace.traceEnd(Trace.TRACE_TAG_RESOURCES);
         }
