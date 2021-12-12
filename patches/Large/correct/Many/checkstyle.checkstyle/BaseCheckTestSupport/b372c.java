diff --git a/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java b/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
index bb6aab9..f35f19e 100644
--- a/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
+++ b/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
@@ -126,10 +126,10 @@
         final int errs = aC.process(theFiles);
 
         // process each of the lines
-        final ByteArrayInputStream bais =
+        final ByteArrayInputStream localStream =
             new ByteArrayInputStream(stream.toByteArray());
         final LineNumberReader lnr =
-            new LineNumberReader(new InputStreamReader(bais, StandardCharsets.UTF_8));
+            new LineNumberReader(new InputStreamReader(localStream, StandardCharsets.UTF_8));
 
         for (int i = 0; i < aExpected.length; i++) {
             final String expected = aMessageFileName + ":" + aExpected[i];
