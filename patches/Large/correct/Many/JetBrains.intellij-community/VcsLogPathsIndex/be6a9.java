diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPathsIndex.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPathsIndex.java
index fa4dc6b..90f0d76 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPathsIndex.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/index/VcsLogPathsIndex.java
@@ -291,7 +291,7 @@
   private static class ToLowerCaseStringDescriptor implements KeyDescriptor<String> {
     @Override
     public int getHashCode(String value) {
-      return CaseInsensitiveStringHashingStrategy.INSTANCE.hashCode();
+      return CaseInsensitiveStringHashingStrategy.INSTANCE.computeHashCode(value);
     }
 
     @Override
