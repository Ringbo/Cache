diff --git a/BenchmarkDemo/app/src/main/java/com/bluelinelabs/logansquare/demo/MainActivity.java b/BenchmarkDemo/app/src/main/java/com/bluelinelabs/logansquare/demo/MainActivity.java
index 533c6ab..a4421cb 100644
--- a/BenchmarkDemo/app/src/main/java/com/bluelinelabs/logansquare/demo/MainActivity.java
+++ b/BenchmarkDemo/app/src/main/java/com/bluelinelabs/logansquare/demo/MainActivity.java
@@ -146,7 +146,7 @@
         } else if (parser instanceof JacksonDatabindParser) {
             mBarChart.addTiming(section, 1, parseResult.runDuration / 1000f);
         } else if (parser instanceof LoganSquareParser) {
-            mBarChart.addTiming(section, 4, parseResult.runDuration / 1000f);
+            mBarChart.addTiming(section, 2, parseResult.runDuration / 1000f);
         }
     }
 
@@ -175,7 +175,7 @@
         } else if (serializer instanceof JacksonDatabindSerializer) {
             mBarChart.addTiming(section, 1, serializeResult.runDuration / 1000f);
         } else if (serializer instanceof LoganSquareSerializer) {
-            mBarChart.addTiming(section, 4, serializeResult.runDuration / 1000f);
+            mBarChart.addTiming(section, 2, serializeResult.runDuration / 1000f);
         }
     }
 
