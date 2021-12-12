diff --git a/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/DegreeNGTest.java b/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/DegreeNGTest.java
index 6c9f1b5..bb5fd2c 100644
--- a/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/DegreeNGTest.java
+++ b/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/DegreeNGTest.java
@@ -176,7 +176,7 @@
         assertEquals(inDegree1, 0);
         assertEquals(inDegree2, 1);
         assertEquals(outDegree1, 1);
-        assertEquals(avDegree, 1.0);
+        assertEquals(avDegree, 0.5);
     }
 
     @Test
@@ -194,7 +194,7 @@
         assertEquals(inDegree3, 1);
         assertEquals(degree1, 2);
         assertEquals(outDegree5, 1);
-        assertEquals(avDegree, 2.0);
+        assertEquals(avDegree, 1.0);
     }
 
     @Test
