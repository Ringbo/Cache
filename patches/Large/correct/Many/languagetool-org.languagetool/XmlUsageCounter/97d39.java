diff --git a/languagetool-dev/src/main/java/org/languagetool/dev/XmlUsageCounter.java b/languagetool-dev/src/main/java/org/languagetool/dev/XmlUsageCounter.java
index 1c1aaf1..8d1c60e 100644
--- a/languagetool-dev/src/main/java/org/languagetool/dev/XmlUsageCounter.java
+++ b/languagetool-dev/src/main/java/org/languagetool/dev/XmlUsageCounter.java
@@ -103,10 +103,10 @@
     counter.printResult();
   }
 
-  class ElemCount {
+  static class ElemCount {
     String elem;
     Integer count;
-    public ElemCount(String elem, Integer count) {
+    ElemCount(String elem, Integer count) {
       this.elem = elem;
       this.count = count;
     }
