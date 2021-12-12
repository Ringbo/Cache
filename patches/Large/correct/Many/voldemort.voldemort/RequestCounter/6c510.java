diff --git a/src/java/voldemort/store/stats/RequestCounter.java b/src/java/voldemort/store/stats/RequestCounter.java
index 204ad9a..f7c68fa 100644
--- a/src/java/voldemort/store/stats/RequestCounter.java
+++ b/src/java/voldemort/store/stats/RequestCounter.java
@@ -39,7 +39,7 @@
         if(elapsed > 0f) {
             return (float) (oldv.count / elapsed);
         } else {
-            return -1f;
+            return 0f;
         }
     }
 
@@ -132,7 +132,7 @@
         }
 
         public double getAverageTimeNS() {
-            return count > 0 ? 1f * totalTimeNS / count : -0f;
+            return count > 0 ? 1f * totalTimeNS / count : 0f;
         }
     }
 }
