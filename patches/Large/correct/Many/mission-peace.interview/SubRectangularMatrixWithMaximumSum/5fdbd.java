diff --git a/src/com/interview/dynamic/SubRectangularMatrixWithMaximumSum.java b/src/com/interview/dynamic/SubRectangularMatrixWithMaximumSum.java
index f6221a4..58f5cec 100644
--- a/src/com/interview/dynamic/SubRectangularMatrixWithMaximumSum.java
+++ b/src/com/interview/dynamic/SubRectangularMatrixWithMaximumSum.java
@@ -91,7 +91,7 @@
                 max = maxSoFar;
             }
         }
-        return new KadaneResult(maxSoFar, maxStart, maxEnd);
+        return new KadaneResult(max, maxStart, maxEnd);
     }
     
     
