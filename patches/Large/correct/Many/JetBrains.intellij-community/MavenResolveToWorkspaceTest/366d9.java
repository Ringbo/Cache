diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenResolveToWorkspaceTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenResolveToWorkspaceTest.java
index 3cfb1a4..4cf5b79 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenResolveToWorkspaceTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenResolveToWorkspaceTest.java
@@ -35,9 +35,9 @@
 /**
  * @author Sergey Evdokimov
  */
-public class MavenResolveToWorkspaceTest extends MavenImportingTestCase {
+public abstract class MavenResolveToWorkspaceTest extends MavenImportingTestCase {
 
-  public void _testIgnoredProject() throws Exception {
+  public void testIgnoredProject() throws Exception {
     createProjectPom("<groupId>test</groupId>" +
                      "<artifactId>project</artifactId>" +
                      "<version>1</version>" +
