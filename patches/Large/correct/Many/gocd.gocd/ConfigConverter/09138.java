diff --git a/server/src/com/thoughtworks/go/config/ConfigConverter.java b/server/src/com/thoughtworks/go/config/ConfigConverter.java
index a89fba3..67f4785 100644
--- a/server/src/com/thoughtworks/go/config/ConfigConverter.java
+++ b/server/src/com/thoughtworks/go/config/ConfigConverter.java
@@ -299,12 +299,12 @@
             if (StringUtils.isBlank(gitBranch))
                 gitBranch = GitMaterialConfig.DEFAULT_BRANCH;
             return new GitMaterialConfig(new UrlArgument(git.getUrl()), gitBranch,
-                    null, git.isAutoUpdate(), filter, crScmMaterial.getDirectory(),
+                    null, git.isAutoUpdate(), filter, false, crScmMaterial.getDirectory(),
                     toMaterialName(materialName), git.shallowClone());
         } else if (crScmMaterial instanceof CRHgMaterial) {
             CRHgMaterial hg = (CRHgMaterial) crScmMaterial;
             return new HgMaterialConfig(new HgUrlArgument(hg.getUrl()),
-                    hg.isAutoUpdate(), toFilter(crScmMaterial), hg.getDirectory(),
+                    hg.isAutoUpdate(), toFilter(crScmMaterial), false, hg.getDirectory(),
                     toMaterialName(materialName));
         } else if (crScmMaterial instanceof CRP4Material) {
             CRP4Material crp4Material = (CRP4Material) crScmMaterial;
