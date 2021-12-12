diff --git a/src/main/java/com/google/devtools/build/lib/query2/engine/VariableContext.java b/src/main/java/com/google/devtools/build/lib/query2/engine/VariableContext.java
index a75f890..1c23334 100644
--- a/src/main/java/com/google/devtools/build/lib/query2/engine/VariableContext.java
+++ b/src/main/java/com/google/devtools/build/lib/query2/engine/VariableContext.java
@@ -52,7 +52,7 @@
       Set<T> value) {
     ImmutableMap.Builder<String, Set<T>> newContextBuilder = ImmutableMap.builder();
     for (Map.Entry<String, Set<T>> entry : variableContext.context.entrySet()) {
-      if (entry.getKey().equals(name)) {
+      if (!entry.getKey().equals(name)) {
         // The binding of 'name' to 'value' should override any existing binding of name in
         // 'variableContext'. These are the semantics we want in order for nested let-expressions
         // to have the semantics we want.
