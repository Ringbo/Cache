diff --git a/plugins/hg4idea/testSrc/hg4idea/test/repo/HgRepositoryReaderTest.java b/plugins/hg4idea/testSrc/hg4idea/test/repo/HgRepositoryReaderTest.java
index c770de2..c7bc0f5 100644
--- a/plugins/hg4idea/testSrc/hg4idea/test/repo/HgRepositoryReaderTest.java
+++ b/plugins/hg4idea/testSrc/hg4idea/test/repo/HgRepositoryReaderTest.java
@@ -85,18 +85,18 @@
   }
 
   public void testBookmarks() {
-    Collection<String> bookmarks = myRepositoryReader.readBookmarks();
+    Collection<String> bookmarks = HgUtil.getNamesWithoutHashes(myRepositoryReader.readBookmarks());
     VcsTestUtil.assertEqualCollections(bookmarks, myBookmarks);
   }
 
   public void testTags() {
     Collection<String> tags = HgUtil.getNamesWithoutHashes(myRepositoryReader.readTags());
-    TestRepositoryUtil.assertEqualCollections(tags, myTags);
+    VcsTestUtil.assertEqualCollections(tags, myTags);
   }
 
   public void testLocalTags() {
     Collection<String> localTags = HgUtil.getNamesWithoutHashes(myRepositoryReader.readLocalTags());
-    TestRepositoryUtil.assertEqualCollections(localTags, myLocalTags);
+    VcsTestUtil.assertEqualCollections(localTags, myLocalTags);
   }
 
   @NotNull
