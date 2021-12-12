diff --git a/core/src/main/java/tachyon/master/EditLog.java b/core/src/main/java/tachyon/master/EditLog.java
index 713dbaa..e3b12f4 100644
--- a/core/src/main/java/tachyon/master/EditLog.java
+++ b/core/src/main/java/tachyon/master/EditLog.java
@@ -112,7 +112,7 @@
     UnderFileSystem ufs = UnderFileSystem.get(path);
 
     DataInputStream is = new DataInputStream(ufs.open(path));
-    JsonParser parser = JsonObject.createObjectMapper().getJsonFactory().createJsonParser(is);
+    JsonParser parser = JsonObject.createObjectMapper().getFactory().createParser(is);
 
     while (true) {
       EditLogOperation op;
