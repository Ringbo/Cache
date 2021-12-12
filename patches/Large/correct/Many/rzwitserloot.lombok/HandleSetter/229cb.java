diff --git a/src/core/lombok/eclipse/handlers/HandleSetter.java b/src/core/lombok/eclipse/handlers/HandleSetter.java
index d1f4751..7760acd 100644
--- a/src/core/lombok/eclipse/handlers/HandleSetter.java
+++ b/src/core/lombok/eclipse/handlers/HandleSetter.java
@@ -103,7 +103,7 @@
 		
 		int modifier = toEclipseModifier(level) | (field.modifiers & ClassFileConstants.AccStatic);
 		
-		switch (methodExists(setterName, fieldNode)) {
+		switch (methodExists(setterName, fieldNode, false)) {
 		case EXISTS_BY_LOMBOK:
 			return true;
 		case EXISTS_BY_USER:
