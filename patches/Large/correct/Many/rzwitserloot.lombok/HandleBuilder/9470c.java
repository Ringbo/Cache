diff --git a/src/core/lombok/eclipse/handlers/HandleBuilder.java b/src/core/lombok/eclipse/handlers/HandleBuilder.java
index d4cdc65..331fbde 100644
--- a/src/core/lombok/eclipse/handlers/HandleBuilder.java
+++ b/src/core/lombok/eclipse/handlers/HandleBuilder.java
@@ -434,7 +434,7 @@
 		
 		if (constructorExists(builderType) == MemberExistsResult.NOT_EXISTS) {
 			ConstructorDeclaration cd = HandleConstructor.createConstructor(
-				AccessLevel.PACKAGE, builderType, Collections.<EclipseNode>emptyList(), false,
+				AccessLevel.PACKAGE, builderType, Collections.<EclipseNode>emptyList(), false, true,
 				annotationNode, Collections.<Annotation>emptyList());
 			if (cd != null) injectMethod(builderType, cd);
 		}
@@ -569,7 +569,7 @@
 		
 		for (BuilderFieldData bfd : builderFields) {
 			if (bfd.singularData != null && bfd.singularData.getSingularizer() != null) {
-				bfd.singularData.getSingularizer().appendBuildCode(bfd.singularData, type, statements, bfd.name);
+				bfd.singularData.getSingularizer().appendBuildCode(bfd.singularData, type, statements, bfd.name, "this");
 			}
 		}
 		
@@ -640,7 +640,7 @@
 		return trs;
 	}
 	
-	public MethodDeclaration generateDefaultProvider(char[] methodName, TypeParameter[] typeParameters, EclipseNode fieldNode, ASTNode source) {
+	public static MethodDeclaration generateDefaultProvider(char[] methodName, TypeParameter[] typeParameters, EclipseNode fieldNode, ASTNode source) {
 		int pS = source.sourceStart, pE = source.sourceEnd;
 		
 		MethodDeclaration out = new MethodDeclaration(((CompilationUnitDeclaration) fieldNode.top().get()).compilationResult);
