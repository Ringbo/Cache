diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/ElementUtils.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/ElementUtils.java
index b4677d9..882f33a 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/ElementUtils.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/ElementUtils.java
@@ -569,7 +569,7 @@
     public static TypeElement findNearestEnclosingType(Element element) {
         List<Element> elements = getElementHierarchy(element);
         for (Element e : elements) {
-            if (e.getKind().isClass()) {
+            if (e.getKind().isClass() || e.getKind().isInterface()) {
                 return (TypeElement) e;
             }
         }
