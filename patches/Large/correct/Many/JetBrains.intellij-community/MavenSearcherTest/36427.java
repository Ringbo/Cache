diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/indices/MavenSearcherTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/indices/MavenSearcherTest.java
index 57302eb..91b1506 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/indices/MavenSearcherTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/indices/MavenSearcherTest.java
@@ -129,7 +129,7 @@
 
   private void assertArtifactSearchResults(String pattern, String... expected) {
     List<String> actual = new ArrayList<String>();
-    for (MavenArtifactSearchResult eachResult : new MavenArtifactSearcher().search(myProject, pattern, 100)) {
+    for (MavenArtifactSearchResult eachResult : new MavenArtifactSearcher(true).search(myProject, pattern, 100)) {
       String s = "";
       for (MavenArtifactInfo eachVersion : eachResult.versions) {
         if (s.length() > 0) s += " ";
