diff --git a/src/main/java/com/google/devtools/build/lib/rules/android/DexArchiveProvider.java b/src/main/java/com/google/devtools/build/lib/rules/android/DexArchiveProvider.java
index ed75111..237f2a1 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/android/DexArchiveProvider.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/android/DexArchiveProvider.java
@@ -85,7 +85,7 @@
       Artifact old =
           dexArchives.put(
               ImmutableSet.copyOf(dexopts), checkNotNull(dexedJar, "dexedJar"), dexArchive);
-      checkArgument(old == null || old.equals(dexedJar),
+      checkArgument(old == null || old.equals(dexArchive),
           "We already had mapping %s-%s for dexopts %s, so we don't also need %s",
           dexedJar, old, dexopts, dexArchive);
       return this;
