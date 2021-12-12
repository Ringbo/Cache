diff --git a/src/core/lombok/eclipse/handlers/HandleGetter.java b/src/core/lombok/eclipse/handlers/HandleGetter.java
index a020aee..d786f20 100644
--- a/src/core/lombok/eclipse/handlers/HandleGetter.java
+++ b/src/core/lombok/eclipse/handlers/HandleGetter.java
@@ -99,7 +99,7 @@
 		int modifier = toEclipseModifier(level) | (field.modifiers & ClassFileConstants.AccStatic);
 		
 		for (String altName : TransformationsUtil.toAllGetterNames(fieldName, isBoolean)) {
-			switch (methodExists(altName, fieldNode)) {
+			switch (methodExists(altName, fieldNode, false)) {
 			case EXISTS_BY_LOMBOK:
 				return true;
 			case EXISTS_BY_USER:
