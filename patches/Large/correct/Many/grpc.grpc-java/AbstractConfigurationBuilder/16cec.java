diff --git a/benchmarks/src/main/java/io/grpc/benchmarks/qps/AbstractConfigurationBuilder.java b/benchmarks/src/main/java/io/grpc/benchmarks/qps/AbstractConfigurationBuilder.java
index 639d2f0..b9eed9c 100644
--- a/benchmarks/src/main/java/io/grpc/benchmarks/qps/AbstractConfigurationBuilder.java
+++ b/benchmarks/src/main/java/io/grpc/benchmarks/qps/AbstractConfigurationBuilder.java
@@ -212,7 +212,7 @@
   private static String wordWrap(String text, int startPos, int maxPos) {
     StringBuilder builder = new StringBuilder();
     int pos = startPos;
-    String[] parts = text.split("\\n");
+    String[] parts = text.split("\\n", -1);
     boolean isBulleted = parts.length > 1;
     for (String part : parts) {
       int lineStart = startPos;
