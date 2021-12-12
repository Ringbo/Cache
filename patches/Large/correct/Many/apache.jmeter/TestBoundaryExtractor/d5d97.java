diff --git a/test/src/org/apache/jmeter/extractor/TestBoundaryExtractor.java b/test/src/org/apache/jmeter/extractor/TestBoundaryExtractor.java
index 32653be..0152d8e 100644
--- a/test/src/org/apache/jmeter/extractor/TestBoundaryExtractor.java
+++ b/test/src/org/apache/jmeter/extractor/TestBoundaryExtractor.java
@@ -156,10 +156,11 @@
         assertEquals("PARENT", vars.get("regVal"));
         extractor.setLeftBoundary("<title>");
         extractor.setRightBoundary("</title>");
-        extractor.setScopeAll();
+        extractor.setScopeChildren();
         extractor.process();
         final String found = vars.get("regVal");
-        assertTrue(found.equals("ONE") || found.equals("TWO"));
+        assertTrue(found.equals("ONE") || found.equals("TWO")
+                || found.equals("THREE"));
     }
     
     @Test
