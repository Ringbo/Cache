diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index fd58743..d050db0 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -2553,7 +2553,7 @@
                 return Number_TYPE;
             } else if (isBitOperator(op)) {
                 if (isIntCategory(leftRedirect) && isIntCategory(rightRedirect)) return int_TYPE;
-                if (isLongCategory(leftRedirect) && isLongCategory(rightRedirect)) return Long_TYPE;
+                if (isLongCategory(leftRedirect) && isLongCategory(rightRedirect)) return long_TYPE;
                 if (isBigIntCategory(leftRedirect) && isBigIntCategory(rightRedirect)) return BigInteger_TYPE;
             } else if (isCompareToBoolean(op) || op == COMPARE_EQUAL) {
                 return boolean_TYPE;
