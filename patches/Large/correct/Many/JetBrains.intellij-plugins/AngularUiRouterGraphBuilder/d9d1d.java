diff --git a/AngularJS/src/org/angularjs/codeInsight/router/AngularUiRouterGraphBuilder.java b/AngularJS/src/org/angularjs/codeInsight/router/AngularUiRouterGraphBuilder.java
index 2fbde04..7d4f6c1 100644
--- a/AngularJS/src/org/angularjs/codeInsight/router/AngularUiRouterGraphBuilder.java
+++ b/AngularJS/src/org/angularjs/codeInsight/router/AngularUiRouterGraphBuilder.java
@@ -102,7 +102,7 @@
 
         if (templateUrl != null) {
           final AngularUiRouterNode templateNode = getOrCreateTemplateNode(provider, templateUrl, null);
-          edges.add(new AngularUiRouterEdge(node, templateNode));
+          edges.add(new AngularUiRouterEdge(templateNode, node, "provides"));
 
           if (state.hasViews()) {
             if (state.isAbstract()) {
@@ -271,7 +271,7 @@
       final String fullUrl = templateUrl;
       final int idx = fullUrl.lastIndexOf('/');
       templateUrl = idx >= 0 ? templateUrl.substring(idx + 1) : templateUrl;
-      template = template == null ? myTemplatesMap.get(templateUrl) : template;
+      template = template == null ? myTemplatesMap.get(fullUrl) : template;
       if (template == null) {
         // file not found
         final DiagramObject templateObject = new DiagramObject(Type.template, templateUrl, null);
