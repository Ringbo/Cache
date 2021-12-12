diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/ExitStatus.java b/spring-batch-core/src/main/java/org/springframework/batch/core/ExitStatus.java
index 29de454..cd5c129 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/ExitStatus.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/ExitStatus.java
@@ -242,7 +242,7 @@
 	 * description
 	 */
 	public ExitStatus addExitDescription(String description) {
-		StringBuffer buffer = new StringBuffer();
+		StringBuilder buffer = new StringBuilder();
 		boolean changed = StringUtils.hasText(description) && !exitDescription.equals(description);
 		if (StringUtils.hasText(exitDescription)) {
 			buffer.append(exitDescription);
