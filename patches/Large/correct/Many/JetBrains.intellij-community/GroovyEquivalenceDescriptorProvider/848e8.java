diff --git a/plugins/structuralsearch/groovy-support/src/com/intellij/structuralsearch/GroovyEquivalenceDescriptorProvider.java b/plugins/structuralsearch/groovy-support/src/com/intellij/structuralsearch/GroovyEquivalenceDescriptorProvider.java
index d0f7157..e36d263 100644
--- a/plugins/structuralsearch/groovy-support/src/com/intellij/structuralsearch/GroovyEquivalenceDescriptorProvider.java
+++ b/plugins/structuralsearch/groovy-support/src/com/intellij/structuralsearch/GroovyEquivalenceDescriptorProvider.java
@@ -81,7 +81,7 @@
         .element(f.getIteratedExpression());
     }
     else if (e instanceof GrReferenceList) {
-      return builder.inAnyOrder(((GrReferenceList)e).getReferenceElements());
+      return builder.inAnyOrder(((GrReferenceList)e).getReferenceElementsGroovy());
     }
     else if (e instanceof GrCodeBlock) {
       return builder.codeBlock(((GrStatementOwner)e).getStatements());
