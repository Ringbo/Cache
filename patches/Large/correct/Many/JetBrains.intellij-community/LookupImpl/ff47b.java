diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
index bf41121..a811c65 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
@@ -783,7 +783,7 @@
     
     final String prefix = itemPattern(item);
     final int length = prefix.length();
-    if (length == 0) return lookupString;
+    if (length == 0 || !StringUtil.startsWithIgnoreCase(lookupString, prefix)) return lookupString;
     boolean isAllLower = true;
     boolean isAllUpper = true;
     boolean sameCase = true;
