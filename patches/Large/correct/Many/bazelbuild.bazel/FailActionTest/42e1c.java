diff --git a/src/test/java/com/google/devtools/build/lib/actions/FailActionTest.java b/src/test/java/com/google/devtools/build/lib/actions/FailActionTest.java
index bc8f364..e21ed94 100644
--- a/src/test/java/com/google/devtools/build/lib/actions/FailActionTest.java
+++ b/src/test/java/com/google/devtools/build/lib/actions/FailActionTest.java
@@ -43,7 +43,7 @@
   protected MutableActionGraph actionGraph = new MapBasedActionGraph();
 
   @Before
-  public void setUp() throws Exception {
+  public final void setUp() throws Exception  {
     errorMessage = "An error just happened.";
     anOutput = new Artifact(scratch.file("/out/foo"),
         Root.asDerivedRoot(scratch.dir("/"), scratch.dir("/out")));
