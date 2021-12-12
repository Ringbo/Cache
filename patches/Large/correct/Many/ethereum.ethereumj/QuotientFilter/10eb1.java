diff --git a/ethereumj-core/src/main/java/org/ethereum/datasource/QuotientFilter.java b/ethereumj-core/src/main/java/org/ethereum/datasource/QuotientFilter.java
index 6e66ca0..54fa2b5 100644
--- a/ethereumj-core/src/main/java/org/ethereum/datasource/QuotientFilter.java
+++ b/ethereumj-core/src/main/java/org/ethereum/datasource/QuotientFilter.java
@@ -135,7 +135,7 @@
     }
 
     static int TABLE_SIZE(int quotientBits, int remainderBits) {
-        long bits = (1 << quotientBits) * (remainderBits + 3);
+        long bits = (1L << quotientBits) * (remainderBits + 3);
         long longs = bits / 64;
         return Ints.checkedCast((bits % 64) > 0 ? (longs + 1) : longs);
     }
@@ -192,7 +192,7 @@
         INDEX_MASK = LOW_MASK(QUOTIENT_BITS);
         REMAINDER_MASK = LOW_MASK(REMAINDER_BITS);
         ELEMENT_MASK = LOW_MASK(ELEMENT_BITS);
-        MAX_SIZE = 1 << QUOTIENT_BITS;
+        MAX_SIZE = 1L << QUOTIENT_BITS;
         MAX_INSERTIONS = (long) (MAX_SIZE * .75);
         table = new long[TABLE_SIZE(QUOTIENT_BITS, REMAINDER_BITS)];
         entries = 0;
