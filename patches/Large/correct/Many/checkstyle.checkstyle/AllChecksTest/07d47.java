diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/internal/AllChecksTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/internal/AllChecksTest.java
index ea875cd..d26c96a 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/internal/AllChecksTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/internal/AllChecksTest.java
@@ -40,7 +40,7 @@
 public class AllChecksTest extends BaseCheckTestSupport {
     @Test
     public void testAllChecksWithDefaultConfiguration() throws Exception {
-        final String inputFilePath = getNonCompilablePath("InputDefaultConfig.java");
+        final String inputFilePath = getPath("InputDefaultConfig.java");
         final String[] expected = ArrayUtils.EMPTY_STRING_ARRAY;
 
         for (Class<?> check : CheckUtil.getCheckstyleChecks()) {
