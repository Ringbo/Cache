diff --git a/source/com/intellij/ide/structureView/impl/VisibilityComparator.java b/source/com/intellij/ide/structureView/impl/VisibilityComparator.java
index b2ae7cf..ecc5618 100644
--- a/source/com/intellij/ide/structureView/impl/VisibilityComparator.java
+++ b/source/com/intellij/ide/structureView/impl/VisibilityComparator.java
@@ -24,7 +24,7 @@
   public int compare(Object descriptor1, Object descriptor2) {
     int accessLevel1 = getAccessLevel(descriptor1);
     int accessLevel2 = getAccessLevel(descriptor2);
-    if (accessLevel1 == accessLevel2) {
+    if (accessLevel1 == accessLevel2 && myNextComparator != null) {
       return myNextComparator.compare(descriptor1, descriptor2);
     }
     return accessLevel2 - accessLevel1;
