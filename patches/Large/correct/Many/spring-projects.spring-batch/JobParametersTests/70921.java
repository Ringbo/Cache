diff --git a/spring-batch-core/src/test/java/org/springframework/batch/core/JobParametersTests.java b/spring-batch-core/src/test/java/org/springframework/batch/core/JobParametersTests.java
index 3094ae9..1b7ff27 100644
--- a/spring-batch-core/src/test/java/org/springframework/batch/core/JobParametersTests.java
+++ b/spring-batch-core/src/test/java/org/springframework/batch/core/JobParametersTests.java
@@ -157,9 +157,9 @@
 	public void testToStringOrder() {
 
 		Map<String, JobParameter> props = parameters.getParameters();
-		StringBuffer stringBuilder = new StringBuffer();
+		StringBuilder stringBuilder = new StringBuilder();
 		for (Entry<String, JobParameter> entry : props.entrySet()) {
-			stringBuilder.append(entry.toString() + ";");
+			stringBuilder.append(entry.toString()).append(";");
 		}
 
 		String string1 = stringBuilder.toString();
@@ -177,9 +177,9 @@
 		JobParameters testProps = new JobParameters(parameterMap);
 
 		props = testProps.getParameters();
-		stringBuilder = new StringBuffer();
+		stringBuilder = new StringBuilder();
 		for (Entry<String, JobParameter> entry : props.entrySet()) {
-			stringBuilder.append(entry.toString() + ";");
+			stringBuilder.append(entry.toString()).append(";");
 		}
 		String string2 = stringBuilder.toString();
 
