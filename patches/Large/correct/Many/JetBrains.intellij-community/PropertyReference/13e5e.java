diff --git a/source/com/intellij/lang/properties/PropertyReference.java b/source/com/intellij/lang/properties/PropertyReference.java
index 3da455a..c9ce659 100644
--- a/source/com/intellij/lang/properties/PropertyReference.java
+++ b/source/com/intellij/lang/properties/PropertyReference.java
@@ -146,7 +146,7 @@
   }
 
   public boolean isSoft() {
-    return true;
+    return false;
   }
 
   public String getUnresolvedMessagePattern() {
