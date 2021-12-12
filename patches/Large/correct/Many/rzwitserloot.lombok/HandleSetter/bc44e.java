diff --git a/src/lombok/eclipse/handlers/HandleSetter.java b/src/lombok/eclipse/handlers/HandleSetter.java
index 70eb855..b08f298 100644
--- a/src/lombok/eclipse/handlers/HandleSetter.java
+++ b/src/lombok/eclipse/handlers/HandleSetter.java
@@ -95,7 +95,7 @@
 	private boolean createSetterForField(AccessLevel level, Node fieldNode, Node errorNode, ASTNode pos, boolean whineIfExists) {
 		if ( fieldNode.getKind() != Kind.FIELD ) {
 			errorNode.addError("@Setter is only supported on a field.");
-			return false;
+			return true;
 		}
 		
 		FieldDeclaration field = (FieldDeclaration) fieldNode.get();
@@ -110,7 +110,7 @@
 			if ( whineIfExists ) errorNode.addWarning(
 					String.format("Not generating %s(%s %s): A method with that name already exists",
 					setterName, field.type, new String(field.name)));
-			return false;
+			return true;
 		default:
 		case NOT_EXISTS:
 			//continue with creating the setter
@@ -121,7 +121,7 @@
 		
 		injectMethod(fieldNode.up(), method);
 		
-		return false;
+		return true;
 	}
 	
 	private MethodDeclaration generateSetter(TypeDeclaration parent, FieldDeclaration field, String name,
