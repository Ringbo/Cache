diff --git a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlParser.java b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlParser.java
index eaa6ea8..4a10c09 100644
--- a/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlParser.java
+++ b/tooling/metamodel-generator/src/main/java/org/hibernate/jpamodelgen/xml/XmlParser.java
@@ -219,7 +219,7 @@
 			if ( context.containsMetaEntity( fqcn ) ) {
 				context.logMessage(
 						Diagnostic.Kind.WARNING,
-						fqcn + " was already processed once. Skipping second occurance."
+						fqcn + " was already processed once. Skipping second occurrence."
 				);
 			}
 			context.addMetaEntity( fqcn, metaEntity );
@@ -244,7 +244,7 @@
 			if ( context.containsMetaEmbeddable( fqcn ) ) {
 				context.logMessage(
 						Diagnostic.Kind.WARNING,
-						fqcn + " was already processed once. Skipping second occurance."
+						fqcn + " was already processed once. Skipping second occurrence."
 				);
 			}
 			context.addMetaEmbeddable( fqcn, metaEntity );
@@ -271,10 +271,10 @@
 					mappedSuperClass, pkg, getXmlMappedType( fqcn ), context
 			);
 
-			if ( context.containsMetaEmbeddable( fqcn ) ) {
+			if ( context.containsMetaEntity( fqcn ) ) {
 				context.logMessage(
 						Diagnostic.Kind.WARNING,
-						fqcn + " was already processed once. Skipping second occurance."
+						fqcn + " was already processed once. Skipping second occurrence."
 				);
 			}
 			context.addMetaEntity( fqcn, metaEntity );
