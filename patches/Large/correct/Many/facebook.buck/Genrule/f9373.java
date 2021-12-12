diff --git a/src/com/facebook/buck/shell/Genrule.java b/src/com/facebook/buck/shell/Genrule.java
index a63061f..e9d3994 100644
--- a/src/com/facebook/buck/shell/Genrule.java
+++ b/src/com/facebook/buck/shell/Genrule.java
@@ -111,7 +111,7 @@
   /**
    * The order in which elements are specified in the {@code srcs} attribute of a genrule matters.
    */
-  protected final ImmutableSortedSet<String> srcs;
+  protected final ImmutableList<String> srcs;
 
   protected final String cmd;
 
@@ -132,7 +132,7 @@
       String out,
       Function<String, String> relativeToAbsolutePathFunction) {
     super(buildRuleParams);
-    this.srcs = ImmutableSortedSet.<String>naturalOrder().addAll(srcs).build();
+    this.srcs = ImmutableList.copyOf(srcs);
     this.cmd = Preconditions.checkNotNull(cmd);
     this.srcsToAbsolutePaths = Maps.toMap(srcs, relativeToAbsolutePathFunction);
 
@@ -171,7 +171,7 @@
 
   @Override
   protected ImmutableSortedSet<String> getInputsToCompareToOutput() {
-    return srcs;
+    return ImmutableSortedSet.copyOf(srcs);
   }
 
   @Override
