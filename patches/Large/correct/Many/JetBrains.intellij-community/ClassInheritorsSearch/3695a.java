diff --git a/java/java-indexing-api/src/com/intellij/psi/search/searches/ClassInheritorsSearch.java b/java/java-indexing-api/src/com/intellij/psi/search/searches/ClassInheritorsSearch.java
index 7bfc51d..be4c4f8 100644
--- a/java/java-indexing-api/src/com/intellij/psi/search/searches/ClassInheritorsSearch.java
+++ b/java/java-indexing-api/src/com/intellij/psi/search/searches/ClassInheritorsSearch.java
@@ -83,7 +83,7 @@
     });
   }
 
-  public static interface InheritanceChecker {
+  public interface InheritanceChecker {
     boolean checkInheritance(@NotNull PsiClass subClass, @NotNull PsiClass parentClass);
 
     InheritanceChecker DEFAULT = new InheritanceChecker() {
@@ -109,7 +109,7 @@
 
     public SearchParameters(@NotNull final PsiClass aClass, @NotNull SearchScope scope, final boolean checkDeep, final boolean checkInheritance,
                             boolean includeAnonymous, @NotNull final Condition<String> nameCondition) {
-      this(aClass, scope, checkDeep, checkInheritance, includeAnonymous, Condition.TRUE, InheritanceChecker.DEFAULT);
+      this(aClass, scope, checkDeep, checkInheritance, includeAnonymous, nameCondition, InheritanceChecker.DEFAULT);
     }
 
     public SearchParameters(@NotNull final PsiClass aClass, @NotNull SearchScope scope, final boolean checkDeep, final boolean checkInheritance,
