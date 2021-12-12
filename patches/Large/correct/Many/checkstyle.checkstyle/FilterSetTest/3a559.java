diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/filters/FilterSetTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/filters/FilterSetTest.java
index 07c40e6..afebf11 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/filters/FilterSetTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/filters/FilterSetTest.java
@@ -32,11 +32,11 @@
 
 /** Tests SuppressElementFilter. */
 public class FilterSetTest {
-    private CSVFilter filter;
+    private CsvFilter filter;
 
     @Before
     public void setUp() {
-        filter = new CSVFilter("");
+        filter = new CsvFilter("");
     }
 
     @Test
