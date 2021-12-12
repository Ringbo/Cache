diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/events/MavenEventsManagerTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/events/MavenEventsManagerTest.java
index 29a72e6..26b61d9 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/events/MavenEventsManagerTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/events/MavenEventsManagerTest.java
@@ -54,7 +54,7 @@
                      "  </plugins>" +
                      "</build>");
 
-    assertKeymapContains(myProjectPom, "surefire:test");
+    assertKeymapContains(myProjectPom, "org.apache.maven.plugins:maven-surefire-plugin:2.4.2:test");
   }
 
   public void testRefreshingOnProjectAddition() throws Exception {
@@ -126,7 +126,7 @@
 
   private void assertKeymapContains(VirtualFile pomFile, String goal) {
     String id = myEventsManager.getActionId(pomFile.getPath(), goal);
-    assertTrue(getProjectActions().contains(id));
+    assertTrue(getProjectActions().toString(), getProjectActions().contains(id));
   }
 
   private void assertKeymapDoesNotContain(VirtualFile pomFile, String goal) {
