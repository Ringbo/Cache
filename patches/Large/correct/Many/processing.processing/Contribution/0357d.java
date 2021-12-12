diff --git a/app/src/processing/app/contrib/Contribution.java b/app/src/processing/app/contrib/Contribution.java
index f651c28..c67b5b1 100644
--- a/app/src/processing/app/contrib/Contribution.java
+++ b/app/src/processing/app/contrib/Contribution.java
@@ -178,7 +178,7 @@
 
 
   public boolean isCompatible(int versionNum) {
-    return ((maxRevision == 0 || versionNum < maxRevision) && versionNum > minRevision);
+    return ((maxRevision == 0 || versionNum <= maxRevision) && versionNum >= minRevision);
   }
 
 
