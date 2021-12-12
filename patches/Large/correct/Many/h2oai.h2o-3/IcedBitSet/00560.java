diff --git a/h2o-core/src/main/java/water/util/IcedBitSet.java b/h2o-core/src/main/java/water/util/IcedBitSet.java
index 13effbc..d38e745 100644
--- a/h2o-core/src/main/java/water/util/IcedBitSet.java
+++ b/h2o-core/src/main/java/water/util/IcedBitSet.java
@@ -77,7 +77,7 @@
 
   // Smaller compression format: just exactly 4 bytes
   public void compress2( AutoBuffer ab ) {
-    assert max() <= 32;         // Expect a larger format
+    assert max() < 32;          // Expect a larger format
     assert _byteoff == 0;       // This is only set on loading a pre-existing IcedBitSet
     assert _val.length==4;
     ab.putA1(_val,4);
@@ -89,7 +89,7 @@
 
   // Larger compression format: dump down bytes into the AutoBuffer.
   public void compress3( AutoBuffer ab ) {
-    assert max() > 32;          // Expect a larger format
+    assert max() >= 32;         // Expect a larger format
     assert _byteoff == 0;       // This is only set on loading a pre-existing IcedBitSet
     assert _val.length==numBytes();
     ab.put2((char)_bitoff);
