diff --git a/java/java-psi-impl/src/com/intellij/codeInsight/generation/OverrideImplementExploreUtil.java b/java/java-psi-impl/src/com/intellij/codeInsight/generation/OverrideImplementExploreUtil.java
index c64baf2..ee6f54a0 100644
--- a/java/java-psi-impl/src/com/intellij/codeInsight/generation/OverrideImplementExploreUtil.java
+++ b/java/java-psi-impl/src/com/intellij/codeInsight/generation/OverrideImplementExploreUtil.java
@@ -184,7 +184,7 @@
           if (c1.isInheritor(c2, true)) return -1;
           if (c2.isInheritor(c1, true)) return 1;
 
-          return StringUtil.notNullize(c1.getName()).compareTo(StringUtil.notNullize(c2.getName()));
+          return StringUtil.notNullize(c1.getQualifiedName()).compareTo(StringUtil.notNullize(c2.getQualifiedName()));
         }
         return m1.getTextOffset() - m2.getTextOffset();
       }
