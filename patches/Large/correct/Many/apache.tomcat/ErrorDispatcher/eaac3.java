diff --git a/java/org/apache/jasper/compiler/ErrorDispatcher.java b/java/org/apache/jasper/compiler/ErrorDispatcher.java
index 927f25c..565b764 100644
--- a/java/org/apache/jasper/compiler/ErrorDispatcher.java
+++ b/java/org/apache/jasper/compiler/ErrorDispatcher.java
@@ -397,7 +397,8 @@
         if ((errNode != null) && (errNode.getStart() != null)) {
             // If this is a scriplet node then there is a one to one mapping
             // between JSP lines and Java lines
-            if (errVisitor.getJspSourceNode() instanceof Node.Scriptlet) {
+            if (errVisitor.getJspSourceNode() instanceof Node.Scriptlet ||
+                    errVisitor.getJspSourceNode() instanceof Node.Declaration) {
                 javacError = new JavacErrorDetail(
                         fname,
                         lineNum,
