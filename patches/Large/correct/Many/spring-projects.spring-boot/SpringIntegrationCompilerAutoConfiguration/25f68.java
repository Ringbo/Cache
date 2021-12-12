diff --git a/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringIntegrationCompilerAutoConfiguration.java b/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringIntegrationCompilerAutoConfiguration.java
index 8b12cc5..6092c21 100644
--- a/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringIntegrationCompilerAutoConfiguration.java
+++ b/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringIntegrationCompilerAutoConfiguration.java
@@ -29,7 +29,7 @@
 import org.springframework.bootstrap.cli.compiler.DependencyCustomizer;
 
 /**
- * {@link CompilerAutoConfiguration} for Spring Batch.
+ * {@link CompilerAutoConfiguration} for Spring Integration.
  * 
  * @author Dave Syer
  */
@@ -39,7 +39,7 @@
 	public boolean matches(ClassNode classNode) {
 		// Slightly weird detection algorithm because there is no @Enable annotation for
 		// Integration
-		return AstUtils.hasLeastOneAnnotation(classNode, "MessageEndpoint",
+		return AstUtils.hasAtLeastOneAnnotation(classNode, "MessageEndpoint",
 				"EnableIntegrationPatterns");
 	}
 
