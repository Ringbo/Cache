diff --git a/java/org/apache/jasper/compiler/Validator.java b/java/org/apache/jasper/compiler/Validator.java
index fc1a902..8268952 100644
--- a/java/org/apache/jasper/compiler/Validator.java
+++ b/java/org/apache/jasper/compiler/Validator.java
@@ -1320,7 +1320,7 @@
                         validateFunctions(el, n);
 
                         result = new Node.JspAttribute(tai, qName, uri,
-                                localName, value, false, el, dynamic);
+                                localName, value, true, el, dynamic);
 
                         ELContextImpl ctx = new ELContextImpl();
                         ctx.setFunctionMapper(getFunctionMapper(el));
