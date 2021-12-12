diff --git a/plugins/maven/facade-impl/test/org/jetbrains/idea/maven/embedder/MavenFacadeEmbedderTest.java b/plugins/maven/facade-impl/test/org/jetbrains/idea/maven/embedder/MavenFacadeEmbedderTest.java
index d0a4c5c..b57d888 100644
--- a/plugins/maven/facade-impl/test/org/jetbrains/idea/maven/embedder/MavenFacadeEmbedderTest.java
+++ b/plugins/maven/facade-impl/test/org/jetbrains/idea/maven/embedder/MavenFacadeEmbedderTest.java
@@ -51,7 +51,7 @@
     super.tearDown();
   }
 
-  private void initEmbedder() {
+  private void initEmbedder() throws RemoteException {
     if (myEmbedder != null) releaseEmbedder();
 
     myEmbedderImpl = MavenFacadeEmbedderImpl.create(MavenFacadeManager.convertSettings(getMavenGeneralSettings()));
