diff --git a/source/com/intellij/psi/filters/getters/AllWordsGetter.java b/source/com/intellij/psi/filters/getters/AllWordsGetter.java
index 807e283..529ee30 100644
--- a/source/com/intellij/psi/filters/getters/AllWordsGetter.java
+++ b/source/com/intellij/psi/filters/getters/AllWordsGetter.java
@@ -19,7 +19,7 @@
     IdTableBuilding.scanWords(new IdTableBuilding.ScanWordProcessor(){
       public void run(final char[] chars, final int start, final int end) {
         final int len = end - start;
-        if (completionContext == null || start > completionContext.offset || completionContext.offset >= end) {
+        if (completionContext == null || start > completionContext.offset || completionContext.offset > end) {
           objs.add(String.valueOf(chars, start, len));
         }
       }
