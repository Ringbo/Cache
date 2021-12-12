diff --git a/common/test/unit/com/thoughtworks/go/domain/BasicPipelineConfigsTest.java b/common/test/unit/com/thoughtworks/go/domain/BasicPipelineConfigsTest.java
index 66b5e7b..3686a42 100644
--- a/common/test/unit/com/thoughtworks/go/domain/BasicPipelineConfigsTest.java
+++ b/common/test/unit/com/thoughtworks/go/domain/BasicPipelineConfigsTest.java
@@ -55,7 +55,7 @@
     public void shouldReturnSelfForGetLocalWhenOriginIsNull()
     {
         PipelineConfigs pipelineConfigs = createEmpty();
-        assertThat(pipelineConfigs.getLocal().size(), is(1));
+        assertThat(pipelineConfigs.getLocal().size(), is(0));
         assertSame(pipelineConfigs,pipelineConfigs.getLocal());
     }
     @Test
@@ -63,7 +63,7 @@
     {
         PipelineConfigs pipelineConfigs = createEmpty();
         pipelineConfigs.setOrigins(new FileConfigOrigin());
-        assertThat(pipelineConfigs.getLocal().size(), is(1));
+        assertThat(pipelineConfigs.getLocal().size(), is(0));
         assertSame(pipelineConfigs, pipelineConfigs.getLocal());
     }
     @Test
