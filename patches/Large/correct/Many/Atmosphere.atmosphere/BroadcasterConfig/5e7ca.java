diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java b/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
index d1e9f5b..ec3aece 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/BroadcasterConfig.java
@@ -81,7 +81,7 @@
     }
 
     protected void configExecutors() {
-        executorService = Executors.newCachedThreadPool(new ThreadFactory(){
+        executorService = Executors.newSingleThreadExecutor(new ThreadFactory(){
 
             private AtomicInteger count = new AtomicInteger();
 
