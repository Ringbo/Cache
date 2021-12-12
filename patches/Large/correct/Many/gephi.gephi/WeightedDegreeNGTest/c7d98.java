diff --git a/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/WeightedDegreeNGTest.java b/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/WeightedDegreeNGTest.java
index 77afe32..1a6c81e 100644
--- a/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/WeightedDegreeNGTest.java
+++ b/modules/StatisticsPlugin/src/test/java/org/gephi/statistics/plugin/WeightedDegreeNGTest.java
@@ -181,7 +181,7 @@
         assertEquals(inDegree1, 0.0);
         assertEquals(inDegree2, 1.0);
         assertEquals(outDegree1, 1.0);
-        assertEquals(avDegree, 1.0);
+        assertEquals(avDegree, 0.5);
     }
 
     @Test
@@ -200,7 +200,7 @@
         assertEquals(inDegree3, 1.0);
         assertEquals(degree1, 2.0);
         assertEquals(outDegree5, 1.0);
-        assertEquals(avDegree, 2.0);
+        assertEquals(avDegree, 1.0);
     }
 
     @Test
