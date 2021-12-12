diff --git a/src/info/ata4/unity/cli/extract/handler/AudioClipHandler.java b/src/info/ata4/unity/cli/extract/handler/AudioClipHandler.java
index 4a906e0..0151813 100644
--- a/src/info/ata4/unity/cli/extract/handler/AudioClipHandler.java
+++ b/src/info/ata4/unity/cli/extract/handler/AudioClipHandler.java
@@ -69,7 +69,7 @@
             
             // make sure the .resS is loaded
             if (audioBufferAux == null) {
-                L.log(Level.WARNING, "Audio clip {0} uses an external .resS file that doesn't exist!");
+                L.log(Level.WARNING, "Audio clip {0} uses an external .resS file that doesn't exist!", name);
                 return;
             }
             
