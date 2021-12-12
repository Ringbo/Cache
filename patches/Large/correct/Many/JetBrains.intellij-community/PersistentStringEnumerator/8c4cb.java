diff --git a/util/src/com/intellij/util/io/PersistentStringEnumerator.java b/util/src/com/intellij/util/io/PersistentStringEnumerator.java
index 5076aea..e8da57a 100644
--- a/util/src/com/intellij/util/io/PersistentStringEnumerator.java
+++ b/util/src/com/intellij/util/io/PersistentStringEnumerator.java
@@ -238,7 +238,7 @@
   }
 
   public void flush() throws IOException {
-    if (myStorage.isMapped()) {
+    if (myStorage.isMapped() || isDirty()) {
       markDirty(false);
       myStorage.flush();
     }
