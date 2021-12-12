diff --git a/src/test/benchmarks/io/vertx/benchmarks/HttpServerHandlerBenchmark.java b/src/test/benchmarks/io/vertx/benchmarks/HttpServerHandlerBenchmark.java
index 9e2be18..1aae26a 100644
--- a/src/test/benchmarks/io/vertx/benchmarks/HttpServerHandlerBenchmark.java
+++ b/src/test/benchmarks/io/vertx/benchmarks/HttpServerHandlerBenchmark.java
@@ -84,7 +84,7 @@
 
     @Override
     public ByteBuf buffer(int initialCapacity) {
-      if (initialCapacity < capacity) {
+      if (initialCapacity <= capacity) {
         return buffer();
       } else {
         throw new IllegalArgumentException();
@@ -93,7 +93,7 @@
 
     @Override
     public ByteBuf buffer(int initialCapacity, int maxCapacity) {
-      if (initialCapacity < capacity) {
+      if (initialCapacity <= capacity) {
         return buffer();
       } else {
         throw new IllegalArgumentException();
