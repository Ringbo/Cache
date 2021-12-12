diff --git a/javaparser-symbol-solver-testing/src/test/java/com/github/javaparser/symbolsolver/resolution/ConstructorsResolutionTest.java b/javaparser-symbol-solver-testing/src/test/java/com/github/javaparser/symbolsolver/resolution/ConstructorsResolutionTest.java
index de13f6e..a04effb 100644
--- a/javaparser-symbol-solver-testing/src/test/java/com/github/javaparser/symbolsolver/resolution/ConstructorsResolutionTest.java
+++ b/javaparser-symbol-solver-testing/src/test/java/com/github/javaparser/symbolsolver/resolution/ConstructorsResolutionTest.java
@@ -105,7 +105,7 @@
 
 		CompilationUnit cu = parseSample("ConstructorCallsEnum");
 		EnumDeclaration enumDeclaration = Navigator.demandEnum(cu, "ConstructorCallsEnum");
-		ConstructorDeclaration constructor = (ConstructorDeclaration) enumDeclaration.getChildNodes().get(2);
+		ConstructorDeclaration constructor = (ConstructorDeclaration) enumDeclaration.getChildNodes().get(3);
 
 		ResolvedConstructorDeclaration resolvedConstructor = constructor.resolve();
 
