diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestRandomChains.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestRandomChains.java
index f4b12bf..b40022a 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestRandomChains.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestRandomChains.java
@@ -190,7 +190,7 @@
             // TODO: also look for other variants and handle them special
             int idx = random.nextInt(charfilters.size());
             try {
-              Constructor<? extends Reader> c = charfilters.get(idx).getConstructor(Reader.class);
+              Constructor<? extends CharStream> c = charfilters.get(idx).getConstructor(Reader.class);
               spec.reader = c.newInstance(spec.reader);
             } catch (NoSuchMethodException e) {
               Constructor<? extends CharStream> c = charfilters.get(idx).getConstructor(CharStream.class);
