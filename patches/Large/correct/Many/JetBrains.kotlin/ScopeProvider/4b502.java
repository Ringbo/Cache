diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/ScopeProvider.java b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/ScopeProvider.java
index f1ca58c..0c96673 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/ScopeProvider.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/resolve/lazy/ScopeProvider.java
@@ -47,7 +47,7 @@
     public ScopeProvider(@NotNull ResolveSession resolveSession) {
         this.resolveSession = resolveSession;
 
-        this.fileScopes = resolveSession.getStorageManager().createWeaklyRetainedMemoizedFunction(new Function1<JetFile, JetScope>() {
+        this.fileScopes = resolveSession.getStorageManager().createMemoizedFunction(new Function1<JetFile, JetScope>() {
             @Override
             public JetScope invoke(@NotNull JetFile file) {
                 return createFileScope(file);
