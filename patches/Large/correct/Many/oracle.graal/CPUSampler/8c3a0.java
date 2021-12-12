diff --git a/truffle/src/com.oracle.truffle.tools.profiler/src/com/oracle/truffle/tools/profiler/CPUSampler.java b/truffle/src/com.oracle.truffle.tools.profiler/src/com/oracle/truffle/tools/profiler/CPUSampler.java
index 5139ff3..0e872f3 100644
--- a/truffle/src/com.oracle.truffle.tools.profiler/src/com/oracle/truffle/tools/profiler/CPUSampler.java
+++ b/truffle/src/com.oracle.truffle.tools.profiler/src/com/oracle/truffle/tools/profiler/CPUSampler.java
@@ -420,7 +420,7 @@
 
     private static SourceSectionFilter combine(SourceSectionFilter filter, Mode mode) {
         List<Class<?>> tags = new ArrayList<>();
-        if (mode == Mode.COMPILED && mode == Mode.ROOTS) {
+        if (mode == Mode.COMPILED || mode == Mode.ROOTS) {
             tags.add(StandardTags.RootTag.class);
         }
         if (mode == Mode.STATEMENTS) {
