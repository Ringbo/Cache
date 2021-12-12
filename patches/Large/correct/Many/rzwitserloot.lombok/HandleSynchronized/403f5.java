diff --git a/src/core/lombok/eclipse/handlers/HandleSynchronized.java b/src/core/lombok/eclipse/handlers/HandleSynchronized.java
index 4623451..620e786 100644
--- a/src/core/lombok/eclipse/handlers/HandleSynchronized.java
+++ b/src/core/lombok/eclipse/handlers/HandleSynchronized.java
@@ -100,7 +100,9 @@
 			fieldDecl.type = new QualifiedTypeReference(TypeConstants.JAVA_LANG_OBJECT, new long[] { 0, 0, 0 });
 			Eclipse.setGeneratedBy(fieldDecl.type, source);
 			fieldDecl.initialization = arrayAlloc;
-			injectFieldSuppressWarnings(annotationNode.up().up(), fieldDecl);
+			// TODO temporary workaround for issue 217. http://code.google.com/p/projectlombok/issues/detail?id=217
+			// injectFieldSuppressWarnings(annotationNode.up().up(), fieldDecl);
+			injectField(annotationNode.up().up(), fieldDecl);
 		}
 		
 		return lockName;
