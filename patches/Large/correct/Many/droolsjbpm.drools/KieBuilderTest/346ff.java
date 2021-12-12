diff --git a/drools-compiler/src/test/java/org/drools/builder/KieBuilderTest.java b/drools-compiler/src/test/java/org/drools/builder/KieBuilderTest.java
index b43156b..e2f3fc4 100644
--- a/drools-compiler/src/test/java/org/drools/builder/KieBuilderTest.java
+++ b/drools-compiler/src/test/java/org/drools/builder/KieBuilderTest.java
@@ -181,17 +181,17 @@
         KieModuleModel kProj = ks.newKieModuleModel();
         
         
-        GAV gav = KieServices.Factory.get().newGav( namespace, "memory", "1.0-SNAPSHOT" );
+        ReleaseId releaseId = KieServices.Factory.get().newReleaseId(namespace, "memory", "1.0-SNAPSHOT");
         
         KieFileSystem kfs = KieServices.Factory.get().newKieFileSystem();
         generateKProjectXML( kfs, namespace, kProj );
-        generatePomXML(kfs, gav);
+        generatePomXML(kfs, releaseId);
         generateMessageClass( kfs, namespace );
         generateRule( kfs, namespace );
         
         MemoryFileSystem mfs = ((KieFileSystemImpl)kfs).asMemoryFileSystem();
                
-        createAndTestKieContainer(gav, createKieBuilder(kfs), null );
+        createAndTestKieContainer(releaseId, createKieBuilder(kfs), null );
     }      
     
     public void testNoPomAndProjectXml() throws ClassNotFoundException, InterruptedException, IOException {
