diff --git a/src/main/java/graphql/execution/ExecutionStrategyParameters.java b/src/main/java/graphql/execution/ExecutionStrategyParameters.java
index 48dde27..e8cb7d5 100644
--- a/src/main/java/graphql/execution/ExecutionStrategyParameters.java
+++ b/src/main/java/graphql/execution/ExecutionStrategyParameters.java
@@ -49,7 +49,7 @@
         return nonNullableFieldValidator;
     }
 
-    public ExecutionParameters transform(Consumer<Builder> builderConsumer) {
+    public ExecutionStrategyParameters transform(Consumer<Builder> builderConsumer) {
         Builder builder = newParameters(this);
         builderConsumer.accept(builder);
         return builder.build();
@@ -59,7 +59,7 @@
         return new Builder();
     }
 
-    public static Builder newParameters(ExecutionParameters oldParameters) {
+    public static Builder newParameters(ExecutionStrategyParameters oldParameters) {
         return new Builder(oldParameters);
     }
 
@@ -79,7 +79,7 @@
         private Builder() {
         }
 
-        private Builder(ExecutionParameters oldParameters) {
+        private Builder(ExecutionStrategyParameters oldParameters) {
             this.typeInfo = oldParameters.typeInfo;
             this.source = oldParameters.source;
             this.fields = oldParameters.fields;
