diff --git a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/ControllerActionTransformer.java b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/ControllerActionTransformer.java
index f12249c..e6b7766 100644
--- a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/ControllerActionTransformer.java
+++ b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/ControllerActionTransformer.java
@@ -214,7 +214,7 @@
 
         List<MethodNode> deferredNewMethods = new ArrayList<MethodNode>();
         for (MethodNode method : classNode.getMethods()) {
-            if (!method.isStatic() && method.isPublic() &&
+            if (!method.isStatic() && method.isPublic() && !method.isAbstract() &&
                     method.getAnnotations(ACTION_ANNOTATION_NODE.getClassNode()).isEmpty() &&
                     method.getLineNumber() >= 0) {
 
