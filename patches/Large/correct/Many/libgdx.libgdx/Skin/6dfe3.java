diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/scenes/scene2d/ui/Skin.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
index ed1e7de..c0583c1 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/scenes/scene2d/ui/Skin.java
@@ -393,7 +393,7 @@
 					try {
 						add(valueEntry.name(), object, addType);
 					} catch (Exception ex) {
-						throw new SerializationException("Error reading " + type.getSimpleName() + ": " + valueEntry.name(), ex);
+						throw new SerializationException("Error reading " + type.getName() + ": " + valueEntry.name(), ex);
 					}
 				}
 			}
