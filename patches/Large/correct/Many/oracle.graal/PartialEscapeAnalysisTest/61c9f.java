diff --git a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
index 0d09c7d..3c5d140 100644
--- a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
+++ b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
@@ -126,7 +126,7 @@
 
     @Test
     public void testCache() {
-        testMaterialize("testCacheSnippet", 0.5, 1);
+        testMaterialize("testCacheSnippet", 0.75, 1);
     }
 
     public static class CacheKey {
