diff --git a/junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java b/junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java
index 78a5c68..a126eef 100644
--- a/junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java
+++ b/junit-vintage-engine/src/main/java/org/junit/vintage/engine/descriptor/RunnerTestDescriptor.java
@@ -41,7 +41,7 @@
 	private boolean wasFiltered;
 
 	public RunnerTestDescriptor(UniqueId uniqueId, Class<?> testClass, Runner runner) {
-		super(uniqueId, runner.getDescription(), testClass.getName(), ClassSource.from(testClass));
+		super(uniqueId, runner.getDescription(), testClass.getSimpleName(), ClassSource.from(testClass));
 		this.runner = runner;
 	}
 
