diff --git a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/JPAMetaModelEntityProcessor.java b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/JPAMetaModelEntityProcessor.java
index 6c9cbd0..e7e75ce 100644
--- a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/JPAMetaModelEntityProcessor.java
+++ b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/JPAMetaModelEntityProcessor.java
@@ -259,11 +259,11 @@
 
 	private MetaEntity tryGettingExistingEntityFromContext(AnnotationMirror mirror, String fqn) {
 		MetaEntity alreadyExistingMetaEntity = null;
-		if ( TypeUtils.isAnnotationMirrorOfType( mirror, Constants.ENTITY ) ) {
+		if ( TypeUtils.isAnnotationMirrorOfType( mirror, Constants.ENTITY )
+				|| TypeUtils.isAnnotationMirrorOfType( mirror, Constants.MAPPED_SUPERCLASS )) {
 			alreadyExistingMetaEntity = context.getMetaEntity( fqn );
 		}
-		else if ( TypeUtils.isAnnotationMirrorOfType( mirror, Constants.MAPPED_SUPERCLASS )
-				|| TypeUtils.isAnnotationMirrorOfType( mirror, Constants.EMBEDDABLE ) ) {
+		else if ( TypeUtils.isAnnotationMirrorOfType( mirror, Constants.EMBEDDABLE ) ) {
 			alreadyExistingMetaEntity = context.getMetaEmbeddable( fqn );
 		}
 		return alreadyExistingMetaEntity;
