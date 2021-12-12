diff --git a/platform/analysis-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java b/platform/analysis-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
index 582c728..69c2b0c 100644
--- a/platform/analysis-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
+++ b/platform/analysis-impl/src/com/intellij/psi/impl/source/resolve/reference/impl/providers/FileReference.java
@@ -198,7 +198,7 @@
   }
 
   public String getFileNameToCreate() {
-    return getCanonicalText();
+    return decode(getCanonicalText());
   }
 
   public
