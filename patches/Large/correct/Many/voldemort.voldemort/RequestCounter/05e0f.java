diff --git a/src/java/voldemort/store/stats/RequestCounter.java b/src/java/voldemort/store/stats/RequestCounter.java
index f7c68fa..204ad9a 100644
--- a/src/java/voldemort/store/stats/RequestCounter.java
+++ b/src/java/voldemort/store/stats/RequestCounter.java
@@ -39,7 +39,7 @@
         if(elapsed > 0f) {
             return (float) (oldv.count / elapsed);
         } else {
-            return 0f;
+            return -1f;
         }
     }
 
@@ -132,7 +132,7 @@
         }
 
         public double getAverageTimeNS() {
-            return count > 0 ? 1f * totalTimeNS / count : 0f;
+            return count > 0 ? 1f * totalTimeNS / count : -0f;
         }
     }
 }
