diff --git a/java/org/apache/jasper/compiler/Validator.java b/java/org/apache/jasper/compiler/Validator.java
index 8268952..da81d47 100644
--- a/java/org/apache/jasper/compiler/Validator.java
+++ b/java/org/apache/jasper/compiler/Validator.java
@@ -1177,7 +1177,7 @@
                                             .getLocalName(i),
                                     attrs.getValue(i), false, null, false);
                         }
-                        if (jspAttrs[i].isExpression()) {
+                        if (expression) {
                             tagDataAttrs.put(attrs.getQName(i),
                                     TagData.REQUEST_TIME_VALUE);
                         } else {
@@ -1320,7 +1320,7 @@
                         validateFunctions(el, n);
 
                         result = new Node.JspAttribute(tai, qName, uri,
-                                localName, value, true, el, dynamic);
+                                localName, value, false, el, dynamic);
 
                         ELContextImpl ctx = new ELContextImpl();
                         ctx.setFunctionMapper(getFunctionMapper(el));
