diff --git a/subprojects/internal-testing/src/main/groovy/org/gradle/test/fixtures/file/TestFile.java b/subprojects/internal-testing/src/main/groovy/org/gradle/test/fixtures/file/TestFile.java
index 4c491f0..bc4281e 100644
--- a/subprojects/internal-testing/src/main/groovy/org/gradle/test/fixtures/file/TestFile.java
+++ b/subprojects/internal-testing/src/main/groovy/org/gradle/test/fixtures/file/TestFile.java
@@ -615,7 +615,7 @@
 
     public void assertHasChangedSince(Snapshot snapshot) {
         Snapshot now = snapshot();
-        assertTrue(now.modTime != snapshot.modTime || !Arrays.equals(now.hash, snapshot.hash));
+        assertTrue(String.format("contents or modification time of %s have not changed", this), now.modTime != snapshot.modTime || !Arrays.equals(now.hash, snapshot.hash));
     }
 
     public void assertContentsHaveChangedSince(Snapshot snapshot) {
