diff --git a/core/tests/coretests/src/android/text/SpannableStringNoCopyTest.java b/core/tests/coretests/src/android/text/SpannableStringNoCopyTest.java
index c205f96..6c05601 100644
--- a/core/tests/coretests/src/android/text/SpannableStringNoCopyTest.java
+++ b/core/tests/coretests/src/android/text/SpannableStringNoCopyTest.java
@@ -54,7 +54,7 @@
         first.setSpan(new UnderlineSpan(), 0, first.length(), Spanned.SPAN_PRIORITY);
 
         // Do not copy NoCopySpan if specified so.
-        final SpannedString copied = new SpannedString(first, false /* copyNoCopySpan */);
+        final SpannedString copied = new SpannedString(first, true /* ignoreNoCopySpan */);
         final Object[] spans = copied.getSpans(0, copied.length(), Object.class);
         assertNotNull(spans);
         assertEquals(2, spans.length);
@@ -87,7 +87,7 @@
 
         // Do not copy NoCopySpan if specified so.
         final SpannedString copied = new SpannedString(
-                new CustomSpannable(first), false /* copyNoCopySpan */);
+                new CustomSpannable(first), true /* ignoreNoCopySpan */);
         final Object[] spans = copied.getSpans(0, copied.length(), Object.class);
         assertNotNull(spans);
         assertEquals(2, spans.length);
