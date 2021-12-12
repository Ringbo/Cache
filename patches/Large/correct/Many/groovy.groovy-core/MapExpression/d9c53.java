diff --git a/src/main/org/codehaus/groovy/ast/expr/MapExpression.java b/src/main/org/codehaus/groovy/ast/expr/MapExpression.java
index 5dd8c64..a67cae7 100644
--- a/src/main/org/codehaus/groovy/ast/expr/MapExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/MapExpression.java
@@ -69,7 +69,7 @@
     }
 
     public String getText() {
-        StringBuffer sb = new StringBuffer(32);
+        StringBuilder sb = new StringBuilder(32);
         sb.append("[");
         int size = mapEntryExpressions.size();
         MapEntryExpression mapEntryExpression = null;
