diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgIgnoredFileHolder.java b/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgIgnoredFileHolder.java
index e2c1e61..a1b2ece 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgIgnoredFileHolder.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgIgnoredFileHolder.java
@@ -19,7 +19,7 @@
   private final HgRepositoryManager myManager;
 
   public HgIgnoredFileHolder(@NotNull Project project, @NotNull HgRepositoryManager manager) {
-    super(project, manager);
+    super(manager);
     myProject = project;
     myManager = manager;
   }
