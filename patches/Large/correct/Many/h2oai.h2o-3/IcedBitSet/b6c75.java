diff --git a/h2o-core/src/main/java/water/util/IcedBitSet.java b/h2o-core/src/main/java/water/util/IcedBitSet.java
index a3289ed..5c4e8b5 100644
--- a/h2o-core/src/main/java/water/util/IcedBitSet.java
+++ b/h2o-core/src/main/java/water/util/IcedBitSet.java
@@ -77,7 +77,7 @@
 
   // Smaller compression format: just exactly 4 bytes
   public void compress2( AutoBuffer ab ) {
-    assert max() < 32;          // Expect a larger format
+    assert max() <= 32;          // Expect a larger format
     assert _byteoff == 0;       // This is only set on loading a pre-existing IcedBitSet
     assert _val.length==4;
     ab.putA1(_val,4);
@@ -89,7 +89,7 @@
 
   // Larger compression format: dump down bytes into the AutoBuffer.
   public void compress3( AutoBuffer ab ) {
-    assert max() >= 32;         // Expect a larger format
+    assert max() > 32;         // Expect a larger format
     assert _byteoff == 0;       // This is only set on loading a pre-existing IcedBitSet
     assert _val.length==numBytes();
     ab.put2((char)_bitoff);
@@ -114,7 +114,7 @@
     for(int i = 0; i < bytes; i++) {
       if( i>0 ) sb.p(' ');
       for( int j=0; j<8; j++ )
-        sb.p((_val[i]>>j)&1);
+        sb.p((_val[_byteoff+i]>>j)&1);
     }
     return sb.p("}");
   }
