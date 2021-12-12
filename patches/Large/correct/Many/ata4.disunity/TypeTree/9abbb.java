diff --git a/src/info/ata4/unity/struct/TypeTree.java b/src/info/ata4/unity/struct/TypeTree.java
index 403ffef..1095552 100644
--- a/src/info/ata4/unity/struct/TypeTree.java
+++ b/src/info/ata4/unity/struct/TypeTree.java
@@ -52,7 +52,7 @@
     public void read(DataInputReader in) throws IOException {
         // TODO: validate
         if (format >= 7) {
-            revision = in.readStringNull(8);
+            revision = in.readStringNull(10);
             L.log(Level.FINEST, "revision = {0}", revision);
 
             version = in.readInt();
