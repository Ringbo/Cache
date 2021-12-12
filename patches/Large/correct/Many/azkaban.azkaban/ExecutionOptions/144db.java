diff --git a/src/java/azkaban/executor/ExecutionOptions.java b/src/java/azkaban/executor/ExecutionOptions.java
index a91a6d0..687dd71 100644
--- a/src/java/azkaban/executor/ExecutionOptions.java
+++ b/src/java/azkaban/executor/ExecutionOptions.java
@@ -40,7 +40,7 @@
 	private Set<String> initiallyDisabledJobs = new HashSet<String>();
 	
 	public void setFlowParameters(Map<String,String> flowParam) {
-		flowParameters.get(flowParam);
+		flowParameters.putAll(flowParam);
 	}
 	
 	public Map<String,String> getFlowParameters() {
