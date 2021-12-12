diff --git a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/transform/ItemTransformerItemWriterFunctionalTests.java b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/transform/ItemTransformerItemWriterFunctionalTests.java
index 614ad1f..32d2d1a 100644
--- a/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/transform/ItemTransformerItemWriterFunctionalTests.java
+++ b/spring-batch-infrastructure/src/test/java/org/springframework/batch/item/transform/ItemTransformerItemWriterFunctionalTests.java
@@ -85,9 +85,9 @@
 		}
 	}
 	
-	private static class BarWriter implements ItemWriter{
+	private static class BarWriter implements ItemWriter<Bar>{
 
-		public void write(Object item) throws Exception {
+		public void write(Bar item) throws Exception {
 		  assertTrue(item instanceof Bar);
 		}
 		
@@ -99,9 +99,9 @@
 		
 	}
 	
-	private static class FoobarWriter implements ItemWriter{
+	private static class FoobarWriter implements ItemWriter<Foobar>{
 
-		public void write(Object item) throws Exception {
+		public void write(Foobar item) throws Exception {
 		  assertTrue(item instanceof Foobar);
 		}
 		
