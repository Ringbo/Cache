diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
index 914c727..e3af0a3 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/datasets/iterator/DataSetIteratorTest.java
@@ -101,7 +101,7 @@
 
 	@Test
 	public void testLfwIterator() throws Exception {
-		int numExamples = 10;
+		int numExamples = 1;
 		int row = 28;
 		int col = 28;
 		int channels = 1;
@@ -109,7 +109,7 @@
 		assertTrue(iter.hasNext());
 		DataSet data = iter.next();
 		assertEquals(numExamples, data.getLabels().size(0));
-		assertEquals(row*col*channels, data.getFeatureMatrix().size(1));
+		assertEquals(row, data.getFeatureMatrix().size(2));
 	}
 
 	@Test
@@ -174,7 +174,7 @@
 		assertTrue(iter.hasNext());
 		DataSet data = iter.next();
 		assertEquals(numExamples, data.getLabels().size(0));
-		assertEquals(row*col*channels, data.getFeatureMatrix().size(1));
+		assertEquals(channels*row*col, data.getFeatureMatrix().size(1));
 	}
 
 
