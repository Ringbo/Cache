diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindResultUsageInfo.java b/platform/lang-impl/src/com/intellij/find/impl/FindResultUsageInfo.java
index f3f207a..138af2c 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindResultUsageInfo.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindResultUsageInfo.java
@@ -83,7 +83,7 @@
 
     assert result.isStringFound();
 
-    if (myFindModel.isRegularExpressions()) {
+    if (myFindModel.isRegularExpressions() || myFindModel.isInCommentsOnly() || myFindModel.isInStringLiteralsOnly()) {
       myAnchor = SmartPointerManager.getInstance(getProject()).createSmartPsiFileRangePointer(file, TextRange.from(offset, 0));
     }
 
