diff --git a/jest-common/src/main/java/io/searchbox/indices/IndicesExists.java b/jest-common/src/main/java/io/searchbox/indices/IndicesExists.java
index 8aa7182..b00b824 100644
--- a/jest-common/src/main/java/io/searchbox/indices/IndicesExists.java
+++ b/jest-common/src/main/java/io/searchbox/indices/IndicesExists.java
@@ -27,7 +27,7 @@
         }
 
         public Builder(Collection<? extends String> indices){
-            addIndex(indices);
+            addIndices(indices);
         }
 
         @Override
