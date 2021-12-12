diff --git a/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java b/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
index 04714f1..f8a775a 100644
--- a/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
+++ b/hibernate-core/src/main/java/org/hibernate/bytecode/enhance/internal/PersistentAttributesHelper.java
@@ -207,7 +207,7 @@
 				PersistentAttributesHelper.hasAnnotation( persistentField, ManyToMany.class );
 	}
 
-	public static String getMappedBy(CtField persistentField, CtClass targetEntity, EnhancementContext context) {
+	public static String getMappedBy(CtField persistentField, CtClass targetEntity, EnhancementContext context) throws NotFoundException {
 		final String local = getMappedByFromAnnotation( persistentField );
 		return local.isEmpty() ? getMappedByFromTargetEntity( persistentField, targetEntity, context ) : local;
 	}
@@ -233,10 +233,12 @@
 	private static String getMappedByFromTargetEntity(
 			CtField persistentField,
 			CtClass targetEntity,
-			EnhancementContext context) {
+			EnhancementContext context) throws NotFoundException {
 		// get mappedBy value by searching in the fields of the target entity class
 		for ( CtField f : targetEntity.getDeclaredFields() ) {
-			if ( context.isPersistentField( f ) && getMappedByFromAnnotation( f ).equals( persistentField.getName() ) ) {
+			if ( context.isPersistentField( f )
+					&& getMappedByFromAnnotation( f ).equals( persistentField.getName() )
+					&& isAssignable( persistentField.getDeclaringClass(), inferFieldTypeName( f ) ) ) {
 				log.debugf(
 						"mappedBy association for field [%s#%s] is [%s#%s]",
 						persistentField.getDeclaringClass().getName(),
