diff --git a/hutool-core/src/test/java/cn/hutool/core/math/CombinationTest.java b/hutool-core/src/test/java/cn/hutool/core/math/CombinationTest.java
index 10bd9ea..97895de 100644
--- a/hutool-core/src/test/java/cn/hutool/core/math/CombinationTest.java
+++ b/hutool-core/src/test/java/cn/hutool/core/math/CombinationTest.java
@@ -19,7 +19,7 @@
 		Assert.assertEquals(10, result);
 		
 		long resultAll = Combination.countAll(5);
-		Assert.assertEquals(150, resultAll);
+		Assert.assertEquals(31, resultAll);
 	}
 
 	@Test
