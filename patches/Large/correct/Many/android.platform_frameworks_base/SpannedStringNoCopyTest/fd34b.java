diff --git a/core/tests/coretests/src/android/text/SpannedStringNoCopyTest.java b/core/tests/coretests/src/android/text/SpannedStringNoCopyTest.java
index 0680924..380e315 100644
--- a/core/tests/coretests/src/android/text/SpannedStringNoCopyTest.java
+++ b/core/tests/coretests/src/android/text/SpannedStringNoCopyTest.java
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
-                new CustomSpanned(first), false /* copyNoCopySpan */);
+                new CustomSpanned(first), true /* ignoreNoCopySpan */);
         final Object[] spans = copied.getSpans(0, copied.length(), Object.class);
         assertNotNull(spans);
         assertEquals(2, spans.length);
