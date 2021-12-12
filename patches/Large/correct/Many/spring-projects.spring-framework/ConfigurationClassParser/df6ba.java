diff --git a/org.springframework.context/src/main/java/org/springframework/context/annotation/ConfigurationClassParser.java b/org.springframework.context/src/main/java/org/springframework/context/annotation/ConfigurationClassParser.java
index 87f2f41..9be1123 100644
--- a/org.springframework.context/src/main/java/org/springframework/context/annotation/ConfigurationClassParser.java
+++ b/org.springframework.context/src/main/java/org/springframework/context/annotation/ConfigurationClassParser.java
@@ -132,7 +132,7 @@
 
 	public void processImport(ConfigurationClass configClass, String[] classesToImport) throws IOException {
 		if (this.importStack.contains(configClass)) {
-			this.problemReporter.error(new CircularImportProblem(configClass, this.importStack));
+			this.problemReporter.error(new CircularImportProblem(configClass, this.importStack, configClass.getMetadata()));
 		}
 		else {
 			this.importStack.push(configClass);
@@ -148,7 +148,7 @@
 		AnnotationMetadata metadata = reader.getAnnotationMetadata();
 		if (!metadata.hasAnnotation(Configuration.class.getName())) {
 			this.problemReporter.error(
-					new NonAnnotatedConfigurationProblem(metadata.getClassName(), reader.getResource()));
+					new NonAnnotatedConfigurationProblem(metadata.getClassName(), reader.getResource(), metadata));
 		}
 		else {
 			processConfigurationClass(new ConfigurationClass(reader, null));
@@ -218,10 +218,10 @@
 	 */
 	private static class NonAnnotatedConfigurationProblem extends Problem {
 
-		public NonAnnotatedConfigurationProblem(String className, Resource resource) {
+		public NonAnnotatedConfigurationProblem(String className, Resource resource, AnnotationMetadata metadata) {
 			super(String.format("%s was imported as a @Configuration class but was not actually annotated " +
 					"with @Configuration. Annotate the class or do not attempt to process it.", className),
-					new Location(resource));
+					new Location(resource, metadata));
 		}
 
 	}
@@ -232,13 +232,13 @@
 	 */
 	private static class CircularImportProblem extends Problem {
 
-		public CircularImportProblem(ConfigurationClass attemptedImport, Stack<ConfigurationClass> importStack) {
+		public CircularImportProblem(ConfigurationClass attemptedImport, Stack<ConfigurationClass> importStack, AnnotationMetadata metadata) {
 			super(String.format("A circular @Import has been detected: " +
 			             "Illegal attempt by @Configuration class '%s' to import class '%s' as '%s' is " +
 			             "already present in the current import stack [%s]",
 			             importStack.peek().getSimpleName(), attemptedImport.getSimpleName(),
 			             attemptedImport.getSimpleName(), importStack),
-			      new Location(importStack.peek().getResource())
+			      new Location(importStack.peek().getResource(), metadata)
 			);
 		}
 	}
