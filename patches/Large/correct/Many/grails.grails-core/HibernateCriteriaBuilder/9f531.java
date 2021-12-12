diff --git a/src/persistence/grails/orm/HibernateCriteriaBuilder.java b/src/persistence/grails/orm/HibernateCriteriaBuilder.java
index 4cf8d7d..94392d2 100644
--- a/src/persistence/grails/orm/HibernateCriteriaBuilder.java
+++ b/src/persistence/grails/orm/HibernateCriteriaBuilder.java
@@ -965,7 +965,7 @@
                     this.logicalExpressionStack.add(new LogicalExpression(name));
                     invokeClosureNode(args[0]);
 
-                    LogicalExpression logicalExpression = logicalExpressionStack.get(logicalExpressionStack.size()-1);
+                    LogicalExpression logicalExpression = logicalExpressionStack.remove(logicalExpressionStack.size()-1);
                     addToCriteria(logicalExpression.toCriterion());
 
                     return name;
@@ -1003,7 +1003,7 @@
                         if(!aliasInstanceStack.isEmpty()) {
                             aliasInstanceStack.remove(aliasInstanceStack.size() - 1);
                         }
-                        LogicalExpression logicalExpression = (LogicalExpression) logicalExpressionStack.remove(logicalExpressionStack.size()-1);
+                        LogicalExpression logicalExpression = logicalExpressionStack.remove(logicalExpressionStack.size()-1);
                         if (!logicalExpression.args.isEmpty()) {
                             addToCriteria(logicalExpression.toCriterion());
                         }
