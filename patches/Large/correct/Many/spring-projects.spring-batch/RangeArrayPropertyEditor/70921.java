diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/transform/RangeArrayPropertyEditor.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/transform/RangeArrayPropertyEditor.java
index 71bf99a..58d479c 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/transform/RangeArrayPropertyEditor.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/file/transform/RangeArrayPropertyEditor.java
@@ -98,7 +98,7 @@
 	public String getAsText() {
 		Range[] ranges = (Range[])getValue();
 		
-		StringBuffer sb = new StringBuffer();
+		StringBuilder sb = new StringBuilder();
 
 		for (int i = 0; i < ranges.length; i++) {
 			if(i>0) {
