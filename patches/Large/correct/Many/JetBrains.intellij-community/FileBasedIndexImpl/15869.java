diff --git a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
index f0bb5a6..1b5fb3b 100644
--- a/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
+++ b/platform/lang-impl/src/com/intellij/util/indexing/FileBasedIndexImpl.java
@@ -1552,7 +1552,9 @@
     final long previousDocStamp = myLastIndexedDocStamps.getAndSet(document, requestedIndexId, currentDocStamp);
     if (currentDocStamp != previousDocStamp) {
       final String contentText = content.getText();
-      if (!isTooLarge(vFile, contentText.length()) && getInputFilter(requestedIndexId).acceptInput(vFile)) {
+      if (!isTooLarge(vFile, contentText.length()) &&
+          getAffectedIndexCandidates(vFile).contains(requestedIndexId) &&
+          getInputFilter(requestedIndexId).acceptInput(vFile)) {
         // Reasonably attempt to use same file content when calculating indices as we can evaluate them several at once and store in file content
         WeakReference<FileContentImpl> previousContentRef = document.getUserData(ourFileContentKey);
         FileContentImpl previousContent = previousContentRef != null ? previousContentRef.get() : null;
