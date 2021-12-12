diff --git a/sql/src/test/java/io/crate/operation/projectors/ProjectingBatchConsumerTest.java b/sql/src/test/java/io/crate/operation/projectors/ProjectingBatchConsumerTest.java
index 6f00400..80a3f29 100644
--- a/sql/src/test/java/io/crate/operation/projectors/ProjectingBatchConsumerTest.java
+++ b/sql/src/test/java/io/crate/operation/projectors/ProjectingBatchConsumerTest.java
@@ -103,7 +103,7 @@
 
         private final boolean requiresScroll;
 
-        public DummyBatchConsumer(boolean requiresScroll) {
+        DummyBatchConsumer(boolean requiresScroll) {
             this.requiresScroll = requiresScroll;
         }
 
@@ -113,13 +113,13 @@
 
         @Override
         public boolean requiresScroll() {
-            return true;
+            return requiresScroll;
         }
     }
 
 
     @Test
-    public void consumerRequiresScrollAndProjectorsDontSupportScrolling() throws Exception {
+    public void testConsumerRequiresScrollAndProjectorsDontSupportScrolling() throws Exception {
         EqOperator op = (EqOperator) functions.get(
             new FunctionIdent(EqOperator.NAME, ImmutableList.of(DataTypes.INTEGER, DataTypes.INTEGER)));
         Function function = new Function(op.info(), Arrays.asList(Literal.of(2), new InputColumn(1)));
@@ -135,7 +135,7 @@
     }
 
     @Test
-    public void consumerRequiresScrollAndProjectorsSupportScrolling() throws Exception {
+    public void testConsumerRequiresScrollAndProjectorsSupportScrolling() throws Exception {
         GroupProjection groupProjection = new GroupProjection(new ArrayList<>(), new ArrayList<>(), RowGranularity.DOC);
 
         BatchConsumer delegateConsumerRequiresScroll = new DummyBatchConsumer(true);
@@ -147,7 +147,7 @@
     }
 
     @Test
-    public void consumerDoesNotRequireScrollYieldsProjectingConsumerWithoutScrollRequirements() throws Exception {
+    public void testConsumerDoesNotRequireScrollYieldsProjectingConsumerWithoutScrollRequirements() throws Exception {
         GroupProjection groupProjection = new GroupProjection(new ArrayList<>(), new ArrayList<>(), RowGranularity.DOC);
         BatchConsumer delegateConsumerRequiresScroll = new DummyBatchConsumer(false);
 
