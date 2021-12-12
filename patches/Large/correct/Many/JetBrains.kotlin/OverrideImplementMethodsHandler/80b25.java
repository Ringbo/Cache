diff --git a/idea/src/org/jetbrains/jet/plugin/codeInsight/OverrideImplementMethodsHandler.java b/idea/src/org/jetbrains/jet/plugin/codeInsight/OverrideImplementMethodsHandler.java
index ce6ba4c..d4b668a 100644
--- a/idea/src/org/jetbrains/jet/plugin/codeInsight/OverrideImplementMethodsHandler.java
+++ b/idea/src/org/jetbrains/jet/plugin/codeInsight/OverrideImplementMethodsHandler.java
@@ -94,7 +94,7 @@
             }
             else if (descriptor instanceof PropertyDescriptor) {
                 JetElement target = overrideProperty(project, containingFile, (PropertyDescriptor)descriptor);
-                afterAnchor = body.addBefore(target, afterAnchor);
+                afterAnchor = body.addAfter(target, afterAnchor);
             }
         }
     }
