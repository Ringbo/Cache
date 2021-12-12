diff --git a/main/tests/server/src/com/google/refine/tests/exporters/XlsExporterTests.java b/main/tests/server/src/com/google/refine/tests/exporters/XlsExporterTests.java
index 9f463f0..c72623a 100644
--- a/main/tests/server/src/com/google/refine/tests/exporters/XlsExporterTests.java
+++ b/main/tests/server/src/com/google/refine/tests/exporters/XlsExporterTests.java
@@ -84,7 +84,7 @@
 
     @BeforeMethod
     public void SetUp(){
-        SUT = new XlsExporter();
+        SUT = new XlsExporter(false);
         stream = new ByteArrayOutputStream();
         ProjectManager.singleton = new ProjectManagerStub();
         projectMetadata = new ProjectMetadata();
