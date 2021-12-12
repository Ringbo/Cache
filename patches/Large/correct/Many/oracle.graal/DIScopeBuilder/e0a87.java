diff --git a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/DIScopeBuilder.java b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/DIScopeBuilder.java
index 92aeb80..20c69cd 100644
--- a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/DIScopeBuilder.java
+++ b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/DIScopeBuilder.java
@@ -178,7 +178,7 @@
         private final HashMap<Path, Source> sources;
         private final boolean extended;
 
-        public LazySourceSectionImpl(HashMap<Path, Source> sources, Path path, int line, int column, boolean extended) {
+        LazySourceSectionImpl(HashMap<Path, Source> sources, Path path, int line, int column, boolean extended) {
             this.sources = sources;
             this.path = path;
             this.line = line;
