diff --git a/core/src/test/java/org/apache/mahout/df/split/OptIgSplitTest.java b/core/src/test/java/org/apache/mahout/df/split/OptIgSplitTest.java
index 95eb33f..3d83259 100644
--- a/core/src/test/java/org/apache/mahout/df/split/OptIgSplitTest.java
+++ b/core/src/test/java/org/apache/mahout/df/split/OptIgSplitTest.java
@@ -53,7 +53,7 @@
       Split expected = ref.computeSplit(data, attr);
       Split actual = opt.computeSplit(data, attr);
 
-      assertEquals(expected.ig, actual.ig);
+      assertEquals(expected.ig, actual.ig, 0.0000001);
       assertEquals(expected.split, actual.split);
     }
   }
