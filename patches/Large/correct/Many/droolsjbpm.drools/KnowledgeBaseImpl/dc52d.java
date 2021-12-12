diff --git a/drools-core/src/main/java/org/drools/core/impl/KnowledgeBaseImpl.java b/drools-core/src/main/java/org/drools/core/impl/KnowledgeBaseImpl.java
index 4a1ec83..e059711 100644
--- a/drools-core/src/main/java/org/drools/core/impl/KnowledgeBaseImpl.java
+++ b/drools-core/src/main/java/org/drools/core/impl/KnowledgeBaseImpl.java
@@ -919,7 +919,7 @@
             byte [] def = runtime.getClassDefinition(convertClassToResourcePath(className));
             Class<?> definedKlass = registerAndLoadTypeDefinition( className, def );
 
-            if ( definedKlass == null && typeDeclaration.isNovel() ) {
+            if ( definedKlass == null && newDecl.isNovel() ) {
                 throw new RuntimeException( "Registering null bytes for class " + className );
             }
 
