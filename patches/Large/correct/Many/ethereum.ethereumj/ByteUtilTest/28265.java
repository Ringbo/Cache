diff --git a/ethereumj-core/src/test/java/test/ethereum/util/ByteUtilTest.java b/ethereumj-core/src/test/java/test/ethereum/util/ByteUtilTest.java
index c3fefee..c622694 100644
--- a/ethereumj-core/src/test/java/test/ethereum/util/ByteUtilTest.java
+++ b/ethereumj-core/src/test/java/test/ethereum/util/ByteUtilTest.java
@@ -246,20 +246,20 @@
 		 */
 		byte[] data = ByteBuffer.allocate(4).putInt(0).array();
 		int posBit = 24;
-		int expected = 128;
+		int expected = 16777216;
 		int result = -1;
 		byte[] ret = ByteUtil.setBit(data, posBit, 1);
 		result = ByteUtil.byteArrayToInt(ret);
 		assertTrue(expected == result);
 
 		posBit = 25;
-		expected = 192;
+		expected = 50331648;
 		ret = ByteUtil.setBit(data, posBit, 1);
 		result = ByteUtil.byteArrayToInt(ret);
 		assertTrue(expected == result);
 
 		posBit = 2;
-		expected = 536871104;
+		expected = 50331652;
 		ret = ByteUtil.setBit(data, posBit, 1);
 		result = ByteUtil.byteArrayToInt(ret);
 		assertTrue(expected == result);
@@ -268,13 +268,13 @@
 			Set off
 		 */
 		posBit = 24;
-		expected = 536870976;
+		expected = 33554436;
 		ret = ByteUtil.setBit(data, posBit, 0);
 		result = ByteUtil.byteArrayToInt(ret);
 		assertTrue(expected == result);
 
 		posBit = 25;
-		expected = 536870912;
+		expected = 4;
 		ret = ByteUtil.setBit(data, posBit, 0);
 		result = ByteUtil.byteArrayToInt(ret);
 		assertTrue(expected == result);
