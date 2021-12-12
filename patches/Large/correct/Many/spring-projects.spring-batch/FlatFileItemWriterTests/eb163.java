diff --git a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/FlatFileItemWriterTests.java b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/FlatFileItemWriterTests.java
index 7d23c92..20451b4 100644
--- a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/FlatFileItemWriterTests.java
+++ b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/file/FlatFileItemWriterTests.java
@@ -516,8 +516,8 @@
 
 		assertEquals("footer", readLine(encoding));
 
-		// 3 lines were written to the file after restart
-		assertEquals(3, executionContext.getLong(ClassUtils.getShortName(FlatFileItemWriter.class) + ".written"));		
+		// 8 lines were written to the file in total
+		assertEquals(8, executionContext.getLong(ClassUtils.getShortName(FlatFileItemWriter.class) + ".written"));		
 	}
 
 	@Test
