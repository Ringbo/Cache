diff --git a/src/main/java/org/elasticsearch/index/fielddata/ordinals/SingleArrayOrdinals.java b/src/main/java/org/elasticsearch/index/fielddata/ordinals/SingleArrayOrdinals.java
index ae93b8a..60870d5 100644
--- a/src/main/java/org/elasticsearch/index/fielddata/ordinals/SingleArrayOrdinals.java
+++ b/src/main/java/org/elasticsearch/index/fielddata/ordinals/SingleArrayOrdinals.java
@@ -112,7 +112,7 @@
         public IntArrayRef getOrds(int docId) {
             int ordinal = ordinals[docId];
             if (ordinal == 0) return IntArrayRef.EMPTY;
-            intsScratch.values[0] = docId;
+            intsScratch.values[0] = ordinal;
             return intsScratch;
         }
 
