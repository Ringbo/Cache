diff --git a/engine/src/desktop/com/jme3/system/Natives.java b/engine/src/desktop/com/jme3/system/Natives.java
index fb0ba22..778436a 100644
--- a/engine/src/desktop/com/jme3/system/Natives.java
+++ b/engine/src/desktop/com/jme3/system/Natives.java
@@ -152,7 +152,7 @@
         // Also check for binaries that are not packed in folders by jme team, e.g. maven artifacts
         if(url == null){
             path = fullname;
-            if(sysName.equals("macosx") && !fullname.contains(".")){
+            if(sysName.equals("macosx") && !name.contains(".")){
                 path = path.replaceAll("dylib","jnilib");
             }
             url = Thread.currentThread().getContextClassLoader().getResource(path);
