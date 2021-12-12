diff --git a/src/info/ata4/unity/struct/FieldTree.java b/src/info/ata4/unity/struct/FieldTree.java
index 4dd0196..72d34e3 100644
--- a/src/info/ata4/unity/struct/FieldTree.java
+++ b/src/info/ata4/unity/struct/FieldTree.java
@@ -30,7 +30,7 @@
     public int version;
     
     private int format;
-    private boolean standalone = true;
+    private boolean standalone = false;
     
     public int getFormat() {
         return format;
@@ -89,7 +89,7 @@
             L.log(Level.FINEST, "version = {0}", version);
         }
         
-        if (standalone) {
+        if (!standalone) {
             int fields = size();
             out.writeInt(fields);
             L.log(Level.FINEST, "fields = {0}", fields);
