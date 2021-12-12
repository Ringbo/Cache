diff --git a/platform/lang-impl/src/com/intellij/refactoring/classMembers/UsedByMemberDependencyGraph.java b/platform/lang-impl/src/com/intellij/refactoring/classMembers/UsedByMemberDependencyGraph.java
index 335c6e6..91a6659 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/classMembers/UsedByMemberDependencyGraph.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/classMembers/UsedByMemberDependencyGraph.java
@@ -36,7 +36,7 @@
   protected HashMap<T, HashSet<T>> myDependenciesToDependent = null;
   private final MemberDependenciesStorage<T, C> myMemberDependenciesStorage;
 
-  UsedByMemberDependencyGraph(C aClass) {
+  public UsedByMemberDependencyGraph(C aClass) {
     myMemberDependenciesStorage = new MemberDependenciesStorage<T, C>(aClass, null);
     mySelectedNormal = new HashSet<T>();
     mySelectedAbstract = new HashSet<T>();
