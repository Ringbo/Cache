diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/TopDownAnalysisContext.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/TopDownAnalysisContext.java
index 7680cee..90b3d0a 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/TopDownAnalysisContext.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/TopDownAnalysisContext.java
@@ -176,7 +176,7 @@
     @NotNull
     public Map<JetCallableDeclaration, CallableMemberDescriptor> getMembers() {
         if (members == null) {
-            members = Maps.newHashMap();
+            members = Maps.newLinkedHashMap();
             members.putAll(functions);
             members.putAll(properties);
             members.putAll(primaryConstructorParameterProperties);
