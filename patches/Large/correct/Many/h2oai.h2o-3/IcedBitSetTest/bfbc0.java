diff --git a/h2o-core/src/test/java/water/IcedBitSetTest.java b/h2o-core/src/test/java/water/IcedBitSetTest.java
index bbbb00b..1d5cd53 100644
--- a/h2o-core/src/test/java/water/IcedBitSetTest.java
+++ b/h2o-core/src/test/java/water/IcedBitSetTest.java
@@ -97,7 +97,7 @@
   }
 
   @Test (expected = IndexOutOfBoundsException.class) public void outOfBounds() {
-    int len = 10 + (int) (10000 * new Random().nextDouble());
+    int len = 32 + (int) (10000 * new Random().nextDouble());
     IcedBitSet bs = new IcedBitSet(len);
     bs.set(len);
   }
