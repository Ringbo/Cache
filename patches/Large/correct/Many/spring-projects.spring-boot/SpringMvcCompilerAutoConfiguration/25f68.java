diff --git a/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringMvcCompilerAutoConfiguration.java b/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringMvcCompilerAutoConfiguration.java
index 4210232..0aa0960 100644
--- a/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringMvcCompilerAutoConfiguration.java
+++ b/spring-bootstrap-cli/src/main/java/org/springframework/bootstrap/cli/compiler/autoconfigure/SpringMvcCompilerAutoConfiguration.java
@@ -50,7 +50,7 @@
 
 	@Override
 	public boolean matches(ClassNode classNode) {
-		return AstUtils.hasLeastOneAnnotation(classNode, "Controller", "EnableWebMvc");
+		return AstUtils.hasAtLeastOneAnnotation(classNode, "Controller", "EnableWebMvc");
 	}
 
 	@Override
