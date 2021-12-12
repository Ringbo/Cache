diff --git a/flink-tests/src/test/java/org/apache/flink/test/javaApiOperators/GroupReduceITCase.java b/flink-tests/src/test/java/org/apache/flink/test/javaApiOperators/GroupReduceITCase.java
index 075e60c..6f93722 100644
--- a/flink-tests/src/test/java/org/apache/flink/test/javaApiOperators/GroupReduceITCase.java
+++ b/flink-tests/src/test/java/org/apache/flink/test/javaApiOperators/GroupReduceITCase.java
@@ -1033,7 +1033,7 @@
 
 		// check if automatic type registration with Kryo worked
 		Assert.assertTrue(ec.getRegisteredKryoTypes().contains(BigInt.class));
-		Assert.assertTrue(ec.getRegisteredKryoTypes().contains(java.sql.Date.class));
+		Assert.assertFalse(ec.getRegisteredKryoTypes().contains(java.sql.Date.class));
 
 		String expected = null;
 
