diff --git a/hibernate-core/src/test/java/org/hibernate/id/enhanced/OptimizerUnitTest.java b/hibernate-core/src/test/java/org/hibernate/id/enhanced/OptimizerUnitTest.java
index d63af91..808b3ed 100644
--- a/hibernate-core/src/test/java/org/hibernate/id/enhanced/OptimizerUnitTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/id/enhanced/OptimizerUnitTest.java
@@ -75,7 +75,7 @@
 
 		// test historic sequence behavior, where the initial values start at 1...
 		SourceMock sequence = new SourceMock( 1 );
-		Optimizer optimizer = buildHiloOptimizer( -1, incremepnt );
+		Optimizer optimizer = buildHiloOptimizer( -1, increment );
 		for ( int i = 1; i <= increment; i++ ) {
 			next = ( Long ) optimizer.generate( sequence );
 			assertEquals( i, next.intValue() );
