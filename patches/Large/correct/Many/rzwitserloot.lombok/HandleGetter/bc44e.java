diff --git a/src/lombok/eclipse/handlers/HandleGetter.java b/src/lombok/eclipse/handlers/HandleGetter.java
index 78b399c..b69a43f 100644
--- a/src/lombok/eclipse/handlers/HandleGetter.java
+++ b/src/lombok/eclipse/handlers/HandleGetter.java
@@ -90,7 +90,7 @@
 	private boolean createGetterForField(AccessLevel level, Node fieldNode, Node errorNode, ASTNode pos, boolean whineIfExists) {
 		if ( fieldNode.getKind() != Kind.FIELD ) {
 			errorNode.addError("@Getter is only supported on a field.");
-			return false;
+			return true;
 		}
 		
 		FieldDeclaration field = (FieldDeclaration) fieldNode.get();
@@ -106,7 +106,7 @@
 		case EXISTS_BY_USER:
 			if ( whineIfExists ) errorNode.addWarning(
 					String.format("Not generating %s(): A method with that name already exists",  getterName));
-			return false;
+			return true;
 		default:
 		case NOT_EXISTS:
 			//continue with creating the getter
