diff --git a/src/main/java/org/elasticsearch/index/fielddata/ordinals/SinglePackedOrdinals.java b/src/main/java/org/elasticsearch/index/fielddata/ordinals/SinglePackedOrdinals.java
index 5a3d692..7b46ec1 100644
--- a/src/main/java/org/elasticsearch/index/fielddata/ordinals/SinglePackedOrdinals.java
+++ b/src/main/java/org/elasticsearch/index/fielddata/ordinals/SinglePackedOrdinals.java
@@ -116,7 +116,7 @@
         public IntArrayRef getOrds(int docId) {
             int ordinal = (int) reader.get(docId);
             if (ordinal == 0) return IntArrayRef.EMPTY;
-            intsScratch.values[0] = docId;
+            intsScratch.values[0] = ordinal;
             return intsScratch;
         }
 
