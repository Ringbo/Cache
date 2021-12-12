diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/PlayerFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/PlayerFieldSetMapper.java
index 9f222bf..d4f0c29 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/PlayerFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/PlayerFieldSetMapper.java
@@ -4,9 +4,9 @@
 import org.springframework.batch.item.file.mapping.FieldSetMapper;
 import org.springframework.batch.sample.domain.Player;
 
-public class PlayerFieldSetMapper implements FieldSetMapper {
+public class PlayerFieldSetMapper implements FieldSetMapper<Player> {
 
-	public Object mapLine(FieldSet fs, int lineNum) {
+	public Player mapLine(FieldSet fs, int lineNum) {
 		
 		if(fs == null){
 			return null;
