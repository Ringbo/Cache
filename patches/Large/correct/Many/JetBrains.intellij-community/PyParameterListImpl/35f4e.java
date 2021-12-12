diff --git a/python/src/com/jetbrains/python/psi/impl/PyParameterListImpl.java b/python/src/com/jetbrains/python/psi/impl/PyParameterListImpl.java
index 73d27ea..8eb46ef 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyParameterListImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyParameterListImpl.java
@@ -42,7 +42,7 @@
     if (paren != null && ")".equals(paren.getText())) {
       ASTNode beforeWhat = paren.getNode(); // the closing paren will be this
       PyParameter[] params = getParameters();
-      PyUtil.addListNode(this, param, beforeWhat, true, params.length == 0);
+      PyUtil.addListNode(this, param, beforeWhat, params.length == 0, true);
     }
   }
 
