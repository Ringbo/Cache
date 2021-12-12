diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
index 9e28b69..79ae7ad 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
@@ -1,5 +1,5 @@
 /*
- * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
+ * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
  *
  * This code is free software; you can redistribute it and/or modify it
@@ -70,7 +70,7 @@
                 ResolvedJavaMethod resolvedMethod = type.findUniqueConcreteMethod(method);
                 if (resolvedMethod != null && !type.isInterface() && method.getDeclaringClass().isAssignableFrom(type)) {
                     tool.assumptions().recordConcreteMethod(method, type, resolvedMethod);
-                    return ConstantNode.forConstant(resolvedMethod.getEncoding(), tool.getMetaAccess(), graph());
+                    return ConstantNode.forConstant(resolvedMethod.getEncoding(), tool.getMetaAccess());
                 }
             }
         }
@@ -96,9 +96,9 @@
              * This really represent a misuse of LoadMethod since we're loading from a class which
              * isn't known to implement the original method but for now at least fold it away.
              */
-            return ConstantNode.forConstant(Constant.NULL_OBJECT, null, graph());
+            return ConstantNode.forConstant(Constant.NULL_OBJECT, null);
         } else {
-            return ConstantNode.forConstant(newMethod.getEncoding(), tool.getMetaAccess(), graph());
+            return ConstantNode.forConstant(newMethod.getEncoding(), tool.getMetaAccess());
         }
     }
 
