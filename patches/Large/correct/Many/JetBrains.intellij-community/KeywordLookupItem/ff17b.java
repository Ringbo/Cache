diff --git a/codeInsight/impl/com/intellij/codeInsight/lookup/KeywordLookupItem.java b/codeInsight/impl/com/intellij/codeInsight/lookup/KeywordLookupItem.java
index d2df44f..a9dc100 100644
--- a/codeInsight/impl/com/intellij/codeInsight/lookup/KeywordLookupItem.java
+++ b/codeInsight/impl/com/intellij/codeInsight/lookup/KeywordLookupItem.java
@@ -17,11 +17,11 @@
 
   @Override
   public boolean equals(final Object o) {
-    return o instanceof KeywordLookupItem && getObject().equals(((KeywordLookupItem)o).getObject());
+    return o instanceof KeywordLookupItem && getLookupString().equals(((KeywordLookupItem)o).getLookupString());
   }
 
   @Override
   public int hashCode() {
-    return getObject().hashCode();
+    return getLookupString().hashCode();
   }
 }
