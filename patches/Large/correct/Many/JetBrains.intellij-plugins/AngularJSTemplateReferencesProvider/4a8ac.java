diff --git a/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSTemplateReferencesProvider.java b/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSTemplateReferencesProvider.java
index 8344f4e..5583b3a 100644
--- a/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSTemplateReferencesProvider.java
+++ b/AngularJS/src/org/angularjs/codeInsight/refs/AngularJSTemplateReferencesProvider.java
@@ -48,7 +48,7 @@
         return ContainerUtil.skipNulls(Arrays.asList(file.getContainingDirectory(), directory));
       }
 
-      return super.getDefaultContexts();
+      return super.computeDefaultContexts();
     }
 
     @Override
