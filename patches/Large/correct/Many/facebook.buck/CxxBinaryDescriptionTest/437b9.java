diff --git a/test/com/facebook/buck/cxx/CxxBinaryDescriptionTest.java b/test/com/facebook/buck/cxx/CxxBinaryDescriptionTest.java
index e1eec05..b02992d 100644
--- a/test/com/facebook/buck/cxx/CxxBinaryDescriptionTest.java
+++ b/test/com/facebook/buck/cxx/CxxBinaryDescriptionTest.java
@@ -388,11 +388,11 @@
     binaryBuilder.setSrcs(ImmutableSortedSet.of(SourceWithFlags.of(FakeSourcePath.of("foo.c"))));
     TargetGraph targetGraph = TargetGraphFactory.newInstance(binaryBuilder.build());
     ActionGraphBuilder graphBuilder = new TestActionGraphBuilder(targetGraph);
-    BuildRule resultRule = binaryBuilder.build(graphBuilder, filesystem, targetGraph);
+    CxxBinary resultRule = binaryBuilder.build(graphBuilder, filesystem, targetGraph);
     assertThat(resultRule, Matchers.instanceOf(CxxBinary.class));
-    assertThat(((CxxBinary) resultRule).getLinkRule(), Matchers.instanceOf(CxxStrip.class));
+    assertThat(resultRule.getLinkRule(), Matchers.instanceOf(CxxStrip.class));
 
-    CxxStrip strip = (CxxStrip) ((CxxBinary) resultRule).getLinkRule();
+    CxxStrip strip = (CxxStrip) resultRule.getLinkRule();
     assertThat(strip.getStripStyle(), equalTo(StripStyle.ALL_SYMBOLS));
   }
 
