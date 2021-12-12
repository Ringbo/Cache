diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionsLoaderTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionsLoaderTest.java
index 8f9ef7c..a89bb16 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionsLoaderTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionsLoaderTest.java
@@ -61,7 +61,7 @@
         final FilterSet fc =
             SuppressionsLoader.loadSuppressions(getPath("suppressions_none.xml"));
         final FilterSet fc2 = new FilterSet();
-        assertEquals(fc, fc2);
+        assertEquals(fc2, fc);
     }
 
     @Test
@@ -120,7 +120,7 @@
         se3.setLines("1,2-3");
         se3.setColumns("1,2-3");
         fc2.addFilter(se3);
-        assertEquals(fc, fc2);
+        assertEquals(fc2, fc);
     }
 
     @Test
@@ -272,6 +272,6 @@
         final FilterSet fc =
             SuppressionsLoader.loadSuppressions(getPath("suppressions_none.xml"));
         final FilterSet fc2 = new FilterSet();
-        assertEquals(fc, fc2);
+        assertEquals(fc2, fc);
     }
 }
