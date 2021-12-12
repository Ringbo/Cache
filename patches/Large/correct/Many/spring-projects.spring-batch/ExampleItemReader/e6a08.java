diff --git a/archetypes/simple-cli/src/main/java/example/ExampleItemReader.java b/archetypes/simple-cli/src/main/java/example/ExampleItemReader.java
index a7c4fb2..eed8cab 100644
--- a/archetypes/simple-cli/src/main/java/example/ExampleItemReader.java
+++ b/archetypes/simple-cli/src/main/java/example/ExampleItemReader.java
@@ -6,7 +6,7 @@
 /**
  * {@link ItemReader} with hard-coded input data.
  */
-public class ExampleItemReader extends AbstractItemReader {
+public class ExampleItemReader extends AbstractItemReader<String> {
 	
 	private String[] input = {"Hello world!", null};
 	
@@ -15,7 +15,7 @@
 	/**
 	 * Reads next record from input
 	 */
-	public Object read() throws Exception {
+	public String read() throws Exception {
 		return input[index++];
 	}
 
