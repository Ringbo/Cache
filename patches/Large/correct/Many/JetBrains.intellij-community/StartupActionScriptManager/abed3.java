diff --git a/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java b/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
index 2cf8452..5b1a45d 100644
--- a/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
+++ b/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
@@ -73,10 +73,10 @@
     File file = new File(getActionScriptPath());
     if (file.exists()) {
       boolean fileCorrupted = false;
-      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
+      FileInputStream fis = new FileInputStream(file);
       try {
-        //noinspection unchecked
-        return (List<ActionCommand>)ois.readObject();
+        //noinspection unchecked, IOResourceOpenedButNotSafelyClosed
+        return (List<ActionCommand>)new ObjectInputStream(fis).readObject();
       }
       catch (Throwable e) {    // ClassNotFoundException / IOException
         fileCorrupted = true;
@@ -88,7 +88,7 @@
       }
       finally {
         try {
-          ois.close();
+          fis.close();
         } finally {
           if (fileCorrupted) FileUtil.delete(file); // do not need corrupted file anymore
         }
