diff --git a/arquillian/container-common/src/test/java/org/jboss/as/arquillian/container/common/ModuleApplicationProcessorTestCase.java b/arquillian/container-common/src/test/java/org/jboss/as/arquillian/container/common/ModuleApplicationProcessorTestCase.java
index 83e7b48..6486c4a 100644
--- a/arquillian/container-common/src/test/java/org/jboss/as/arquillian/container/common/ModuleApplicationProcessorTestCase.java
+++ b/arquillian/container-common/src/test/java/org/jboss/as/arquillian/container/common/ModuleApplicationProcessorTestCase.java
@@ -77,7 +77,7 @@
         Node node = archive.get(MANIFEST);
         Assert.assertNotNull(node);
 
-        Manifest mf = processor.getOrCreateManifest(archive);
+        Manifest mf = ManifestUtils.getOrCreateManifest(archive);
         Attributes attributes = mf.getMainAttributes();
         String value = attributes.getValue("Dependencies");
         Set<String> deps = new HashSet<String>();
