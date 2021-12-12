diff --git a/gdx/src/com/badlogic/gdx/maps/loaders/GleedMapLoader.java b/gdx/src/com/badlogic/gdx/maps/loaders/GleedMapLoader.java
index b6cdca9..5973866 100644
--- a/gdx/src/com/badlogic/gdx/maps/loaders/GleedMapLoader.java
+++ b/gdx/src/com/badlogic/gdx/maps/loaders/GleedMapLoader.java
@@ -341,7 +341,7 @@
 		
 		Element position = item.getChildByName("Position");
 		rectangle.getRectangle().set(Float.parseFloat(position.getChildByName("X").getText()),
-											  Float.parseFloat(position.getChildByName("Y").getText()),
+											  -Float.parseFloat(position.getChildByName("Y").getText()),
 											  Float.parseFloat(item.getChildByName("Width").getText()),
 											  Float.parseFloat(item.getChildByName("Height").getText()));
 		
