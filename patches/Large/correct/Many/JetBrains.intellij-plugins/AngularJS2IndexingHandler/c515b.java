diff --git a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
index 89df615..3b5067e 100644
--- a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
@@ -295,16 +295,16 @@
     return descriptor != null ? descriptor.findProperty(name) : null;
   }
 
-  public static boolean isDirective(@NotNull String name) {
+  public static boolean isDirective(@Nullable String name) {
     return "Directive".equals(name) || "DirectiveAnnotation".equals(name) ||
            "Component".equals(name) || "ComponentAnnotation".equals(name);
   }
 
-  public static boolean isModule(@NotNull String name) {
+  public static boolean isModule(@Nullable String name) {
     return "NgModule".equals(name);
   }
 
-  private static boolean isPipe(String name) {
+  private static boolean isPipe(@Nullable String name) {
     return "Pipe".equals(name);
   }
 
