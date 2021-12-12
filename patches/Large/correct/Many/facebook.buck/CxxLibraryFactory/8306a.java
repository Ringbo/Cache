diff --git a/src/com/facebook/buck/cxx/CxxLibraryFactory.java b/src/com/facebook/buck/cxx/CxxLibraryFactory.java
index 853a46e..85d992d 100644
--- a/src/com/facebook/buck/cxx/CxxLibraryFactory.java
+++ b/src/com/facebook/buck/cxx/CxxLibraryFactory.java
@@ -303,7 +303,7 @@
               cxxBuckConfig,
               cxxPlatform,
               args,
-              cxxDeps.get(resolver, cxxPlatform),
+              cxxDeps.get(ruleResolverInner, cxxPlatform),
               CxxFlags.getFlagsWithMacrosWithPlatformMacroExpansion(
                   args.getLinkerFlags(), args.getPlatformLinkerFlags(), cxxPlatform),
               CxxFlags.getFlagsWithMacrosWithPlatformMacroExpansion(
