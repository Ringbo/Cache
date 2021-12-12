diff --git a/ethereumj-core/src/main/java/org/ethereum/datasource/CountingBytesSource.java b/ethereumj-core/src/main/java/org/ethereum/datasource/CountingBytesSource.java
index 163157a..14d0a91 100644
--- a/ethereumj-core/src/main/java/org/ethereum/datasource/CountingBytesSource.java
+++ b/ethereumj-core/src/main/java/org/ethereum/datasource/CountingBytesSource.java
@@ -44,7 +44,7 @@
         synchronized (this) {
             byte[] srcVal = getSource().get(key);
             int srcCount = decodeCount(srcVal);
-            if (srcCount >= 1) moreThan2Bloom.add(key);
+            if (moreThan2Bloom != null && srcCount >= 1) moreThan2Bloom.add(key);
             getSource().put(key, encodeCount(val, srcCount + 1));
         }
     }
