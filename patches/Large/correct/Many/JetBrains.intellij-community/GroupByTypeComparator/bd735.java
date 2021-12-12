diff --git a/lang-impl/src/com/intellij/ide/projectView/impl/GroupByTypeComparator.java b/lang-impl/src/com/intellij/ide/projectView/impl/GroupByTypeComparator.java
index 468c618..ac88f09 100644
--- a/lang-impl/src/com/intellij/ide/projectView/impl/GroupByTypeComparator.java
+++ b/lang-impl/src/com/intellij/ide/projectView/impl/GroupByTypeComparator.java
@@ -86,7 +86,7 @@
   }
 
   private boolean isAbbreviateQualifiedNames() {
-    return myProjectView != null && myProjectView.isSortByType(myPaneId);
+    return myProjectView != null && myProjectView.isAbbreviatePackageNames(myPaneId);
   }
 
 }
