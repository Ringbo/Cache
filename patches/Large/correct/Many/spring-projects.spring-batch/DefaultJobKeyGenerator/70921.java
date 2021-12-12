diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/DefaultJobKeyGenerator.java b/spring-batch-core/src/main/java/org/springframework/batch/core/DefaultJobKeyGenerator.java
index 410037d..bb9920c 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/DefaultJobKeyGenerator.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/DefaultJobKeyGenerator.java
@@ -43,14 +43,14 @@
 	public String generateKey(JobParameters source) {
 
 		Map<String, JobParameter> props = source.getParameters();
-		StringBuffer stringBuffer = new StringBuffer();
+		StringBuilder stringBuffer = new StringBuilder();
 		List<String> keys = new ArrayList<String>(props.keySet());
 		Collections.sort(keys);
 		for (String key : keys) {
 			JobParameter jobParameter = props.get(key);
 			if(jobParameter.isIdentifying()) {
 				String value = jobParameter.getValue()==null ? "" : jobParameter.toString();
-				stringBuffer.append(key + "=" + value + ";");
+				stringBuffer.append(key).append("=").append(value).append(";");
 			}
 		}
 
