diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/GeneratingItemReader.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/GeneratingItemReader.java
index c8c4e92..3dbd88b 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/GeneratingItemReader.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/GeneratingItemReader.java
@@ -13,7 +13,7 @@
  * 
  * @author Robert Kasanicky
  */
-public class GeneratingItemReader implements ItemReader, ItemRecoverer {
+public class GeneratingItemReader implements ItemReader<Trade>, ItemRecoverer {
 
 	private int limit = 1;
 	
@@ -21,7 +21,7 @@
 
 	private int marked;
 	
-	public Object read() throws Exception {
+	public Trade read() throws Exception {
 		if (counter < limit) {
 			counter++;
 			return new Trade(
