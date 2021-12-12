diff --git a/flink-yarn/src/test/java/org/apache/flink/yarn/UtilsTests.java b/flink-yarn/src/test/java/org/apache/flink/yarn/UtilsTests.java
index 1d01b03..39a9c02 100644
--- a/flink-yarn/src/test/java/org/apache/flink/yarn/UtilsTests.java
+++ b/flink-yarn/src/test/java/org/apache/flink/yarn/UtilsTests.java
@@ -27,6 +27,6 @@
 
 		// ASSUMES DEFAULT Configuration values.
 		Assert.assertEquals(800, Utils.calculateHeapSize(1000) );
-		Assert.assertEquals(9500, Utils.calculateHeapSize(10000) );
+		Assert.assertEquals(9300, Utils.calculateHeapSize(10000) );
 	}
 }
