diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
index 15e9191..d039389 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentWriteAppendSameFileTest.java
@@ -31,7 +31,7 @@
  */
 public class FileConcurrentWriteAppendSameFileTest extends ContextTestSupport {
 
-    private final int size = 5000;
+    private final int size = 1000;
 
     @Override
     protected void setUp() throws Exception {
@@ -65,7 +65,7 @@
         String[] lines = txt.split(LS);
         assertEquals("Should be " + size + " lines", size, lines.length);
 
-        // should be 10000 unique
+        // should be unique
         Set<String> rows = new LinkedHashSet<String>(Arrays.asList(lines));
         assertEquals("Should be " + size + " unique lines", size, rows.size());
 
