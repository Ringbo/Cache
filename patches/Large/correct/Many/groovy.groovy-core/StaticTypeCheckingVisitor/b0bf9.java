diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 1f666e5..32d9a2a 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -850,7 +850,7 @@
         ClassNode type = getType(expression);
         ClassNode typeRe = type.redirect();
         ClassNode resultType;
-        if (isBigDecCategory(typeRe)) {
+        if (isDoubleCategory(typeRe)) {
             resultType = type;
         } else if (typeRe == ArrayList_TYPE) {
             resultType = ArrayList_TYPE;
