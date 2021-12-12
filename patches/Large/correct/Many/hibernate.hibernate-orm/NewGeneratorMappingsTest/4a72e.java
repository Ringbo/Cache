diff --git a/annotations/src/test/java/org/hibernate/test/annotations/id/generationmappings/NewGeneratorMappingsTest.java b/annotations/src/test/java/org/hibernate/test/annotations/id/generationmappings/NewGeneratorMappingsTest.java
index 399d2f7..d67cd18 100644
--- a/annotations/src/test/java/org/hibernate/test/annotations/id/generationmappings/NewGeneratorMappingsTest.java
+++ b/annotations/src/test/java/org/hibernate/test/annotations/id/generationmappings/NewGeneratorMappingsTest.java
@@ -113,8 +113,8 @@
 		assertEquals( TableGenerator.DEF_SEGMENT_COLUMN, tabGenerator.getSegmentColumnName() );
 		assertEquals( "MINIMAL_TBL", tabGenerator.getSegmentValue() );
 		assertEquals( TableGenerator.DEF_VALUE_COLUMN, tabGenerator.getValueColumnName() );
-		// 0 is the annotation default
-		assertEquals( 0, tabGenerator.getInitialValue() );
+		// 0 is the annotation default, but its expected to be treated as 1
+		assertEquals( 1, tabGenerator.getInitialValue() );
 		// 50 is the annotation default
 		assertEquals( 50, tabGenerator.getIncrementSize() );
 		assertTrue( OptimizerFactory.PooledOptimizer.class.isInstance( tabGenerator.getOptimizer() ) );
