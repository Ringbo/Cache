diff --git a/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java b/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
index fe5ae40..53f145e 100644
--- a/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
+++ b/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
@@ -442,7 +442,7 @@
     }
 
     private void pushTexCoord(Attributes attribs) throws SAXException{
-        if (texCoordIdx >= 1)
+        if (texCoordIdx >= 2)
             return; // TODO: More than 2 texcoords
 
         Type type = texCoordIdx == 0 ? Type.TexCoord : Type.TexCoord2;
