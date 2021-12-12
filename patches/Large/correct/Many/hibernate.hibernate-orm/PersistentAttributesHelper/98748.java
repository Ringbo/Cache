diff --git a/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java b/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
index f8a775a..5fa7494 100644
--- a/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
+++ b/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
@@ -310,7 +310,7 @@
 
 	private static String inferFieldTypeName(CtField field) {
 		try {
-			if ( field.getFieldInfo().getAttribute( SignatureAttribute.tag ) == null ){
+			if ( field.getFieldInfo2().getAttribute( SignatureAttribute.tag ) == null ) {
 				return field.getType().getName();
 			}
 			return inferGenericTypeName(
@@ -328,7 +328,7 @@
 
 	private static String inferMethodTypeName(CtMethod method) {
 		try {
-			if ( method.getMethodInfo().getAttribute( SignatureAttribute.tag ) == null ){
+			if ( method.getMethodInfo2().getAttribute( SignatureAttribute.tag ) == null ) {
 				return method.getReturnType().getName();
 			}
 			return inferGenericTypeName(
