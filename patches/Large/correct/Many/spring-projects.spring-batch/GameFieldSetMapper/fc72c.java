diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/GameFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/GameFieldSetMapper.java
index 1c51190..c5c6f04 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/GameFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/GameFieldSetMapper.java
@@ -4,9 +4,9 @@
 import org.springframework.batch.item.file.mapping.FieldSetMapper;
 import org.springframework.batch.sample.domain.Game;
 
-public class GameFieldSetMapper implements FieldSetMapper {
+public class GameFieldSetMapper implements FieldSetMapper<Game> {
 
-	public Object mapLine(FieldSet fs, int lineNum) {
+	public Game mapLine(FieldSet fs, int lineNum) {
 		
 		if(fs == null){
 			return null;
