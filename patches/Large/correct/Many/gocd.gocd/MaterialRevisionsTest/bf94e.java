diff --git a/common/test/unit/com/thoughtworks/go/domain/MaterialRevisionsTest.java b/common/test/unit/com/thoughtworks/go/domain/MaterialRevisionsTest.java
index 970f189..30e48d1 100644
--- a/common/test/unit/com/thoughtworks/go/domain/MaterialRevisionsTest.java
+++ b/common/test/unit/com/thoughtworks/go/domain/MaterialRevisionsTest.java
@@ -440,7 +440,7 @@
                 svnMaterialRevision(yesterdayMod, oneHourAgoMod)
         );
         assertThat(materialRevisions.getNamedRevisions().size(), is(1));
-        assertThat(materialRevisions.getNamedRevisions().get("Foo"), is("9"));
+        assertThat(materialRevisions.getNamedRevisions().get(new CaseInsensitiveString("Foo")), is("9"));
     }
 
     @Test
@@ -497,9 +497,9 @@
 
     @Test
     public void shouldUseUpstreamPipelineLabelForDependencyMaterial() {
-        String pipelineName = "upstream";
+        CaseInsensitiveString pipelineName = new CaseInsensitiveString("upstream");
         String pipelineLabel = "1.3.0-1234";
-        MaterialRevision materialRevision = ModificationsMother.dependencyMaterialRevision(pipelineName, 2, pipelineLabel, "dev", 1, new Date());
+        MaterialRevision materialRevision = ModificationsMother.dependencyMaterialRevision(pipelineName.toString(), 2, pipelineLabel, "dev", 1, new Date());
         MaterialRevisions materialRevisions = new MaterialRevisions(materialRevision);
 
         Map<CaseInsensitiveString, String> namedRevisions = materialRevisions.getNamedRevisions();
