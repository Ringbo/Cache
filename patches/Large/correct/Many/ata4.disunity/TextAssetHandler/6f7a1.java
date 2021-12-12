diff --git a/src/info/ata4/unity/extract/handler/TextAssetHandler.java b/src/info/ata4/unity/extract/handler/TextAssetHandler.java
index b74b7bc..cc80e11 100644
--- a/src/info/ata4/unity/extract/handler/TextAssetHandler.java
+++ b/src/info/ata4/unity/extract/handler/TextAssetHandler.java
@@ -33,6 +33,6 @@
     public void extract(ObjectPath path, UnityObject obj) throws IOException {
         String name = obj.getValue("m_Name");
         String script = obj.getValue("m_Script");
-        writeFile(script.getBytes(), path.pathID, name);
+        writeFile(script.getBytes("UTF8"), path.pathID, name);
     }
 }
