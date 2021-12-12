diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 34e0ce4..9a36b6b 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -895,7 +895,7 @@
         ClassNode type = getType(expression);
         ClassNode typeRe = type.redirect();
         ClassNode resultType;
-        if (isBigDecCategory(typeRe)) {
+        if (isDoubleCategory(typeRe)) {
             resultType = type;
         } else if (typeRe == ArrayList_TYPE) {
             resultType = ArrayList_TYPE;
