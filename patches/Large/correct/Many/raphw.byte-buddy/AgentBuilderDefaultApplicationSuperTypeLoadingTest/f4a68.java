diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationSuperTypeLoadingTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationSuperTypeLoadingTest.java
index 7201ad8..2b5e784 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationSuperTypeLoadingTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/agent/builder/AgentBuilderDefaultApplicationSuperTypeLoadingTest.java
@@ -48,7 +48,7 @@
     @Before
     public void setUp() throws Exception {
         classLoader = new ByteArrayClassLoader(ClassLoadingStrategy.BOOTSTRAP_LOADER,
-                ClassFileExtraction.of(Foo.class, Bar.class),
+                ClassFileExtraction.of(Foo.class, Bar.class, AgentBuilderDefaultApplicationSuperTypeLoadingTest.class),
                 ClassLoadingStrategy.NO_PROTECTION_DOMAIN,
                 ByteArrayClassLoader.PersistenceHandler.MANIFEST,
                 PackageDefinitionStrategy.NoOp.INSTANCE);
