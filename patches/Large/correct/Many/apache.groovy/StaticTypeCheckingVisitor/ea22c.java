diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 4d8c9fd..50dad52 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -1001,11 +1001,11 @@
 
                     FieldNode field = current.getDeclaredField(propertyName);
                     field  = allowStaticAccessToMember(field, staticOnly);
-                    if (storeField(field, isAttributeExpression, pexp, objectExpressionType, visitor, receiver.getData())) return true;
+                    if (storeField(field, isAttributeExpression, pexp, current, visitor, receiver.getData())) return true;
 
                     PropertyNode propertyNode = current.getProperty(propertyName);
                     propertyNode = allowStaticAccessToMember(propertyNode, staticOnly);
-                    if (storeProperty(propertyNode, pexp, objectExpressionType, visitor, receiver.getData())) return true;
+                    if (storeProperty(propertyNode, pexp, current, visitor, receiver.getData())) return true;
 
                     boolean isThisExpression = objectExpression instanceof VariableExpression && 
                                                 ((VariableExpression)objectExpression).isThisExpression();
@@ -1051,11 +1051,11 @@
                     }
                     foundGetterOrSetter = foundGetterOrSetter || setter!=null || getter!=null;
 
-                    if (storeField(field, true, pexp, objectExpressionType, visitor, receiver.getData())) return true;
+                    if (storeField(field, true, pexp, current, visitor, receiver.getData())) return true;
                     // if the property expression is an attribute expression (o.@attr), then
                     // we stop now, otherwise we must check the parent class
                     if (/*!isAttributeExpression && */current.getSuperClass() != null) {
-                        queue.add(current.getSuperClass());
+                        queue.add(current.getUnresolvedSuperClass());
                     }
                 }
                 // GROOVY-5568, the property may be defined by DGM
