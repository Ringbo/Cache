diff --git a/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java b/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
index 9472871..4b64b50 100644
--- a/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
+++ b/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
@@ -212,7 +212,7 @@
     }
     TachyonURI path = new TachyonURI(Utils.getPathWithoutScheme(cPath));
     DeleteOptions options =
-        new DeleteOptions.Builder(ClientContext.getConf()).setRecursive(recursive).build();
+        new DeleteOptions.Builder().setRecursive(recursive).build();
     try {
       TachyonFile file = mTFS.open(path);
       mTFS.delete(file, options);
