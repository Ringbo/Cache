diff --git a/ethereumj-core/src/test/java/org/ethereum/util/StandaloneBlockchainTest.java b/ethereumj-core/src/test/java/org/ethereum/util/StandaloneBlockchainTest.java
index 3132a9c..f3ece9c 100644
--- a/ethereumj-core/src/test/java/org/ethereum/util/StandaloneBlockchainTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/util/StandaloneBlockchainTest.java
@@ -121,7 +121,7 @@
         a.callFunction("f", "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
         BigInteger r = (BigInteger) a.callConstFunction("a")[0];
         System.out.println(r.toString(16));
-        Assert.assertEquals(new BigInteger(Hex.decode("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff")), r);
+        Assert.assertEquals(new BigInteger(1, Hex.decode("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff")), r);
     }
 
     @Test
