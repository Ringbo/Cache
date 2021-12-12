diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/CharacterTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/CharacterTest.java
index 936f163..a422b17 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/CharacterTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/CharacterTest.java
@@ -69,16 +69,16 @@
 		disposables.add(texture);
 		final Material material = new Material(TextureAttribute.createDiffuse(texture), ColorAttribute.createSpecular(1,1,1,1), FloatAttribute.createShininess(8f));
 		final long attributes = Usage.Position | Usage.Normal | Usage.TextureCoordinates;
-		final Model capsule = modelBuilder.createCapsule(1.75f, 4.25f, 16, material, attributes);
+		final Model capsule = modelBuilder.createCapsule(2f, 6f, 16, material, attributes);
 		disposables.add(capsule);
 		world.addConstructor("capsule", new BulletConstructor(capsule, null));
-		character = world.add("capsule", 5f, 2.125f, 5f);
+		character = world.add("capsule", 5f, 3f, 5f);
 		characterTransform = character.transform; // Set by reference
 		
 		// Create the physics representation of the character
 		ghostObject = new btPairCachingGhostObject();
 		ghostObject.setWorldTransform(characterTransform);
-		ghostShape = new btCapsuleShape(1.75f, 1.75f);
+		ghostShape = new btCapsuleShape(2f, 2f);
 		ghostObject.setCollisionShape(ghostShape);
 		ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
 		characterController = new btKinematicCharacterController(ghostObject, ghostShape, .35f);
