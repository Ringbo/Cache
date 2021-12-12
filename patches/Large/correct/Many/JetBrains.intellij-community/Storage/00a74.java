diff --git a/util/src/com/intellij/util/io/storage/Storage.java b/util/src/com/intellij/util/io/storage/Storage.java
index aeafb54..184fb75 100644
--- a/util/src/com/intellij/util/io/storage/Storage.java
+++ b/util/src/com/intellij/util/io/storage/Storage.java
@@ -206,7 +206,7 @@
     synchronized (lock) {
       for (AppenderCacheKey key : new ArrayList<AppenderCacheKey>(ourAppendersCache.keySet())) {
         AppenderStream stream = ourAppendersCache.get(key);
-        if (stream.myStorage == this) {
+        if (stream != null && stream.myStorage == this) {
           try {
             stream.realClose();
           }
