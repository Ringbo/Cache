diff --git a/app/models/MessagesService.java b/app/models/MessagesService.java
index 7be19c9..65a4ad0 100644
--- a/app/models/MessagesService.java
+++ b/app/models/MessagesService.java
@@ -82,11 +82,11 @@
         return Sets.newHashSet();
     }
 
-    public int total() {
+    public long total() {
         try {
-            return Cache.getOrElse(TOTAL_CNT_CACHE_KEY, new Callable<Integer>() {
+            return Cache.getOrElse(TOTAL_CNT_CACHE_KEY, new Callable<Long>() {
                 @Override
-                public Integer call() throws Exception {
+                public Long call() throws Exception {
                     MessageCountResponse response = api.get(MessageCountResponse.class).path("/count/total").execute();
                     return response.events;
                 }
