diff --git a/src/main/java/org/elasticsearch/index/codec/postingsformat/BloomFilterPostingsFormatProvider.java b/src/main/java/org/elasticsearch/index/codec/postingsformat/BloomFilterPostingsFormatProvider.java
index d681266..8a87d1b 100644
--- a/src/main/java/org/elasticsearch/index/codec/postingsformat/BloomFilterPostingsFormatProvider.java
+++ b/src/main/java/org/elasticsearch/index/codec/postingsformat/BloomFilterPostingsFormatProvider.java
@@ -42,7 +42,7 @@
         this.delegate = Helper.lookup(indexSettings, postingsFormatSettings.get("delegate"), postingFormatFactories);
         this.postingsFormat = new BloomFilterPostingsFormat(
                 delegate.get(),
-                BloomFilter.Factory.buildFromString(indexSettings.get("fpp"))
+                BloomFilter.Factory.buildFromString(postingsFormatSettings.get("fpp"))
         );
     }
 
