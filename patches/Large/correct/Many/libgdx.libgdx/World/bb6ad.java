diff --git a/gdx/src/com/badlogic/gdx/physics/box2d/World.java b/gdx/src/com/badlogic/gdx/physics/box2d/World.java
index 7754a6f..14dbbc7 100644
--- a/gdx/src/com/badlogic/gdx/physics/box2d/World.java
+++ b/gdx/src/com/badlogic/gdx/physics/box2d/World.java
@@ -526,7 +526,7 @@
 
 	private void endContact (long contactAddr) {
 		contact.addr = contactAddr;
-		contact.GetWorldManifold();
+		contact.getWorldManifold();
 		if (contactListener != null) contactListener.endContact(contact);
 	}
 
