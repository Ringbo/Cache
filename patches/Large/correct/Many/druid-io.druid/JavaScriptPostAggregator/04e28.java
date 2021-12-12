diff --git a/processing/src/main/java/io/druid/query/aggregation/post/JavaScriptPostAggregator.java b/processing/src/main/java/io/druid/query/aggregation/post/JavaScriptPostAggregator.java
index fea0c82..d297378 100644
--- a/processing/src/main/java/io/druid/query/aggregation/post/JavaScriptPostAggregator.java
+++ b/processing/src/main/java/io/druid/query/aggregation/post/JavaScriptPostAggregator.java
@@ -52,7 +52,7 @@
 
   private static Function compile(String function) {
     final ContextFactory contextFactory = ContextFactory.getGlobal();
-    Context context = contextFactory.enterContext();
+    final Context context = contextFactory.enterContext();
     context.setOptimizationLevel(9);
 
     final ScriptableObject scope = context.initStandardObjects();
@@ -90,9 +90,9 @@
       @JsonProperty("function") final String function
   )
   {
-    Preconditions.checkNotNull(name, "Must have a valid, non-null aggregator name");
+    Preconditions.checkNotNull(name, "Must have a valid, non-null post-aggregator name");
     Preconditions.checkNotNull(fieldNames, "Must have a valid, non-null fieldNames");
-    Preconditions.checkNotNull(function, "Must have a valid, non-null fnAggregate");
+    Preconditions.checkNotNull(function, "Must have a valid, non-null function");
 
     this.name = name;
     this.fieldNames = fieldNames;
@@ -116,7 +116,7 @@
   @Override
   public Object compute(Map<String, Object> combinedAggregators)
   {
-    Object[] args = new Object[fieldNames.size()];
+    final Object[] args = new Object[fieldNames.size()];
     int i = 0;
     for(String field : fieldNames) {
       args[i++] = combinedAggregators.get(field);
