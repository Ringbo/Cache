diff --git a/benchmarks/src/main/java/okhttp3/benchmarks/OkHttp.java b/benchmarks/src/main/java/okhttp3/benchmarks/OkHttp.java
index 7c90e5e..7460aa6 100644
--- a/benchmarks/src/main/java/okhttp3/benchmarks/OkHttp.java
+++ b/benchmarks/src/main/java/okhttp3/benchmarks/OkHttp.java
@@ -61,7 +61,7 @@
   class OkHttpRequest implements Runnable {
     private final Call call;
 
-    public OkHttpRequest(Call call) {
+    OkHttpRequest(Call call) {
       this.call = call;
     }
 
