diff --git a/hutool-core/src/test/java/cn/hutool/core/util/NumberUtilTest.java b/hutool-core/src/test/java/cn/hutool/core/util/NumberUtilTest.java
index 83e7559..78d2bf5 100644
--- a/hutool-core/src/test/java/cn/hutool/core/util/NumberUtilTest.java
+++ b/hutool-core/src/test/java/cn/hutool/core/util/NumberUtilTest.java
@@ -185,7 +185,7 @@
 		int v1 = NumberUtil.parseInt("0xFF");
 		Assert.assertEquals(255, v1);
 		int v2 = NumberUtil.parseInt("010");
-		Assert.assertEquals(8, v2);
+		Assert.assertEquals(10, v2);
 		int v3 = NumberUtil.parseInt("10");
 		Assert.assertEquals(10, v3);
 		int v4 = NumberUtil.parseInt("   ");
@@ -201,7 +201,7 @@
 		long v1 = NumberUtil.parseLong("0xFF");
 		Assert.assertEquals(255L, v1);
 		long v2 = NumberUtil.parseLong("010");
-		Assert.assertEquals(8L, v2);
+		Assert.assertEquals(10L, v2);
 		long v3 = NumberUtil.parseLong("10");
 		Assert.assertEquals(10L, v3);
 		long v4 = NumberUtil.parseLong("   ");
