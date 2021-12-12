diff --git a/ethereumj-core/src/main/java/org/ethereum/core/Denomination.java b/ethereumj-core/src/main/java/org/ethereum/core/Denomination.java
index e8c8e41..8e2b6b9 100644
--- a/ethereumj-core/src/main/java/org/ethereum/core/Denomination.java
+++ b/ethereumj-core/src/main/java/org/ethereum/core/Denomination.java
@@ -23,6 +23,6 @@
 	}
 	
 	private static BigInteger newBigInt(int value) {
-		return BigInteger.valueOf(2).pow(value);
+		return BigInteger.valueOf(10).pow(value);
 	}
 }
