diff --git a/core/src/main/java/org/apache/druid/math/expr/ExprEval.java b/core/src/main/java/org/apache/druid/math/expr/ExprEval.java
index 2b649d4..4dad810 100644
--- a/core/src/main/java/org/apache/druid/math/expr/ExprEval.java
+++ b/core/src/main/java/org/apache/druid/math/expr/ExprEval.java
@@ -197,7 +197,7 @@
           return this;
         case LONG:
           if (value == null) {
-            return ExprEval.of(null);
+            return ExprEval.ofLong(null);
           } else {
             return ExprEval.of(asLong());
           }
@@ -239,7 +239,7 @@
       switch (castTo) {
         case DOUBLE:
           if (value == null) {
-            return ExprEval.of(null);
+            return ExprEval.ofDouble(null);
           } else {
             return ExprEval.of(asDouble());
           }
