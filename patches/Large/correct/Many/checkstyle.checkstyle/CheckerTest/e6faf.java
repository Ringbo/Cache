diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/CheckerTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/CheckerTest.java
index c67d9aa..f1c1b3f 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/CheckerTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/CheckerTest.java
@@ -178,7 +178,7 @@
         final String[] fileExtensions = {"java", "xml", "properties"};
         c.setFileExtensions(fileExtensions);
         final int counter = c.process(files);
-        assertEquals(counter, 1); // comparing to 1 as there is only one legal file in input
+        assertEquals(1, counter); // comparing to 1 as there is only one legal file in input
     }
 
     @SuppressWarnings("deprecation")
