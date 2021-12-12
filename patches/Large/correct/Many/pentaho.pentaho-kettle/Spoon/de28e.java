diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index c28bb1e..67d94f5 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -4570,7 +4570,7 @@
         // is not, but we might.
       }
       if (id == SWT.YES) {
-        if (!export && !beforeFilename.equals(fname)) {
+        if (!export && !Const.isEmpty(beforeFilename) && !beforeFilename.equals(fname)) {
           meta.setName(Const.createName(fname));
           meta.setFilename(fname);
           // If the user hits cancel here, don't save anything
