diff --git a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlMetaEntity.java b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlMetaEntity.java
index 23ac234..97bbf44 100644
--- a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlMetaEntity.java
+++ b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlMetaEntity.java
@@ -82,7 +82,7 @@
 	protected AccessTypeInformation accessTypeInfo;
 
 	public XmlMetaEntity(Entity ormEntity, String defaultPackageName, TypeElement element, Context context) {
-		this( ormEntity.getClazz(), defaultPackageName, element, context, ormEntity.isMetadataComplete() );
+		this( ormEntity.getClazz(), defaultPackageName, element, context, ormEntity.getMetadataComplete() );
 		this.attributes = ormEntity.getAttributes();
 		this.embeddableAttributes = null;
 		// entities can be directly initialised
@@ -91,7 +91,11 @@
 
 	protected XmlMetaEntity(MappedSuperclass mappedSuperclass, String defaultPackageName, TypeElement element, Context context) {
 		this(
-				mappedSuperclass.getClazz(), defaultPackageName, element, context, mappedSuperclass.isMetadataComplete()
+				mappedSuperclass.getClazz(),
+				defaultPackageName,
+				element,
+				context,
+				mappedSuperclass.getMetadataComplete()
 		);
 		this.attributes = mappedSuperclass.getAttributes();
 		this.embeddableAttributes = null;
@@ -100,7 +104,7 @@
 	}
 
 	protected XmlMetaEntity(Embeddable embeddable, String defaultPackageName, TypeElement element, Context context) {
-		this( embeddable.getClazz(), defaultPackageName, element, context, embeddable.isMetadataComplete() );
+		this( embeddable.getClazz(), defaultPackageName, element, context, embeddable.getMetadataComplete() );
 		this.attributes = null;
 		this.embeddableAttributes = embeddable.getAttributes();
 	}
