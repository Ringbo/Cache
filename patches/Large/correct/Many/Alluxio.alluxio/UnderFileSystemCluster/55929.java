diff --git a/core/src/test/java/tachyon/UnderFileSystemCluster.java b/core/src/test/java/tachyon/UnderFileSystemCluster.java
index d328d60..6094918 100644
--- a/core/src/test/java/tachyon/UnderFileSystemCluster.java
+++ b/core/src/test/java/tachyon/UnderFileSystemCluster.java
@@ -72,8 +72,8 @@
     if (mUfsClz != null && !mUfsClz.equals("")) {
       try {
         UnderFileSystemCluster ufsCluster =
-            (UnderFileSystemCluster) Class.forName(mUfsClz).getConstructor(String.class)
-                .newInstance(baseDir);
+            (UnderFileSystemCluster) Class.forName(mUfsClz).getConstructor(String.class,
+                TachyonConf.class).newInstance(baseDir, tachyonConf);
         return ufsCluster;
       } catch (Exception e) {
         System.out.println("Failed to initialize the ufsCluster of " + mUfsClz
