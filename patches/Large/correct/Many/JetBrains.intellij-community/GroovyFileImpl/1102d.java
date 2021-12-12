diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
index 299a371..3eec133 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
@@ -381,12 +381,12 @@
       fileNode.replaceChild(currNode, newNode);
     } else {
       ASTNode anchor = fileNode.getFirstChildNode();
-      if (anchor.getElementType() == GroovyTokenTypes.mSH_COMMENT) {
+      if (anchor != null && anchor.getElementType() == GroovyTokenTypes.mSH_COMMENT) {
         anchor = anchor.getTreeNext();
         fileNode.addLeaf(GroovyTokenTypes.mNLS, "\n", anchor);
       }
       fileNode.addChild(newNode, anchor);
-      if (!anchor.getText().startsWith("\n\n")) {
+      if (anchor != null && !anchor.getText().startsWith("\n\n")) {
         fileNode.addLeaf(GroovyTokenTypes.mNLS, "\n", anchor);
       }
     }
