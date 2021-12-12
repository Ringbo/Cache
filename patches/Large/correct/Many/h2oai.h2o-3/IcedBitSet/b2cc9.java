diff --git a/h2o-core/src/main/java/water/util/IcedBitSet.java b/h2o-core/src/main/java/water/util/IcedBitSet.java
index 5c4e8b5..75aaeab 100644
--- a/h2o-core/src/main/java/water/util/IcedBitSet.java
+++ b/h2o-core/src/main/java/water/util/IcedBitSet.java
@@ -27,7 +27,7 @@
   public IcedBitSet(int nbits) { this(nbits, 0); }
   public IcedBitSet(int nbits, int bitoff) {
     // For small bitsets, just use a no-offset fixed-length format
-    if( bitoff+nbits < 32 ) {  bitoff = 0;  nbits = 32;  }
+    if( bitoff+nbits <= 32 ) {  bitoff = 0;  nbits = 32;  }
     fill(nbits <= 0 ? null : new byte[bytes(nbits)], 0, nbits, bitoff);
   }
 
@@ -114,7 +114,7 @@
     for(int i = 0; i < bytes; i++) {
       if( i>0 ) sb.p(' ');
       for( int j=0; j<8; j++ )
-        sb.p((_val[_byteoff+i]>>j)&1);
+        sb.p((_val[i]>>j)&1);
     }
     return sb.p("}");
   }
