diff --git a/java/java-impl/src/com/intellij/codeInsight/completion/JavaCharFilter.java b/java/java-impl/src/com/intellij/codeInsight/completion/JavaCharFilter.java
index cb3543a..b9a1d30 100644
--- a/java/java-impl/src/com/intellij/codeInsight/completion/JavaCharFilter.java
+++ b/java/java-impl/src/com/intellij/codeInsight/completion/JavaCharFilter.java
@@ -49,7 +49,7 @@
     }
 
     LookupElement item = lookup.getCurrentItem();
-    if (item == null) return null;
+    if (item == null || !item.isValid()) return null;
 
     final Object o = item.getObject();
     if (c == '!') {
