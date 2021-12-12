diff --git a/src/core/lombok/eclipse/handlers/HandleData.java b/src/core/lombok/eclipse/handlers/HandleData.java
index 4e23bbf..bbf1822 100644
--- a/src/core/lombok/eclipse/handlers/HandleData.java
+++ b/src/core/lombok/eclipse/handlers/HandleData.java
@@ -119,7 +119,7 @@
 		}
 		
 		if (ann.staticConstructor().length() > 0) {
-			if (methodExists("of", typeNode) == MemberExistsResult.NOT_EXISTS) {
+			if (methodExists("of", typeNode, false) == MemberExistsResult.NOT_EXISTS) {
 				MethodDeclaration staticConstructor = createStaticConstructor(
 						ann.staticConstructor(), typeNode, nodesForConstructor, ast);
 				injectMethod(typeNode, staticConstructor);
