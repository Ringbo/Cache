diff --git a/java/org/apache/jasper/compiler/Validator.java b/java/org/apache/jasper/compiler/Validator.java
index 21c111d..4d95a3f 100644
--- a/java/org/apache/jasper/compiler/Validator.java
+++ b/java/org/apache/jasper/compiler/Validator.java
@@ -509,7 +509,7 @@
         public void visit(Node.JspRoot n) throws JasperException {
             JspUtil.checkAttributes("Jsp:root", n, jspRootAttrs, err);
             String version = n.getTextAttribute("version");
-            if (!version.equals("1.2") && !version.equals("2.0")) {
+            if (!version.equals("1.2") && !version.equals("2.0") && !version.equals("2.1")) {
                 err.jspError(n, "jsp.error.jsproot.version.invalid", version);
             }
             visitBody(n);
