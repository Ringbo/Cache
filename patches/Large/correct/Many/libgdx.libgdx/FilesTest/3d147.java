diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/FilesTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/FilesTest.java
index 3321c61..14f714e 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/FilesTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/FilesTest.java
@@ -386,7 +386,7 @@
 		if (handle.delete()) fail();
 		if (handle.list().length != 0) fail();
 		if (handle.child("meow").exists()) fail();
-		if (handle.parent().exists()) fail();
+		if (!handle.parent().exists()) fail();
 		try {
 			handle.read().close();
 			fail();
