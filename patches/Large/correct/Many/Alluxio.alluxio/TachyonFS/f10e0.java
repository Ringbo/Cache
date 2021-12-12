diff --git a/core/src/main/java/tachyon/client/TachyonFS.java b/core/src/main/java/tachyon/client/TachyonFS.java
index 5d4165c..08daccc 100644
--- a/core/src/main/java/tachyon/client/TachyonFS.java
+++ b/core/src/main/java/tachyon/client/TachyonFS.java
@@ -87,7 +87,7 @@
     if (tempAddress.contains(Constants.PATH_SEPARATOR)) {
       masterAddress = tempAddress.substring(0, tempAddress.indexOf(Constants.PATH_SEPARATOR));
     }
-    Preconditions.checkArgument(masterAddress.split(":").length != 2, "Illegal Tachyon Master Address: " + tachyonPath);
+    Preconditions.checkArgument(masterAddress.split(":").length == 2, "Illegal Tachyon Master Address: " + tachyonPath);
 
     String masterHost = masterAddress.split(":")[0];
     int masterPort = Integer.parseInt(masterAddress.split(":")[1]);
