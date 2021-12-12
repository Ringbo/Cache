diff --git a/graal/com.oracle.graal.options/src/com/oracle/graal/options/OptionProcessor.java b/graal/com.oracle.graal.options/src/com/oracle/graal/options/OptionProcessor.java
index 6331d88..d12e7ce 100644
--- a/graal/com.oracle.graal.options/src/com/oracle/graal/options/OptionProcessor.java
+++ b/graal/com.oracle.graal.options/src/com/oracle/graal/options/OptionProcessor.java
@@ -264,7 +264,7 @@
 
     private static Element topDeclaringType(Element element) {
         Element enclosing = element.getEnclosingElement();
-        if (element == null || enclosing.getKind() == ElementKind.PACKAGE) {
+        if (enclosing == null || enclosing.getKind() == ElementKind.PACKAGE) {
             assert element.getKind() == ElementKind.CLASS || element.getKind() == ElementKind.INTERFACE;
             return element;
         }
