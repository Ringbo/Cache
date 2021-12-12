diff --git a/gdx/src/com/badlogic/gdx/InputMultiplexer.java b/gdx/src/com/badlogic/gdx/InputMultiplexer.java
index c918102..960ab83 100644
--- a/gdx/src/com/badlogic/gdx/InputMultiplexer.java
+++ b/gdx/src/com/badlogic/gdx/InputMultiplexer.java
@@ -74,10 +74,10 @@
 	}
 
 	public boolean keyDown (int keycode) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].keyDown(keycode)) return true;
+				if (((InputProcessor)items[i]).keyDown(keycode)) return true;
 		} finally {
 			processors.end();
 		}
@@ -85,10 +85,10 @@
 	}
 
 	public boolean keyUp (int keycode) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].keyUp(keycode)) return true;
+				if (((InputProcessor)items[i]).keyUp(keycode)) return true;
 		} finally {
 			processors.end();
 		}
@@ -96,10 +96,10 @@
 	}
 
 	public boolean keyTyped (char character) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].keyTyped(character)) return true;
+				if (((InputProcessor)items[i]).keyTyped(character)) return true;
 		} finally {
 			processors.end();
 		}
@@ -107,10 +107,10 @@
 	}
 
 	public boolean touchDown (int screenX, int screenY, int pointer, int button) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].touchDown(screenX, screenY, pointer, button)) return true;
+				if (((InputProcessor)items[i]).touchDown(screenX, screenY, pointer, button)) return true;
 		} finally {
 			processors.end();
 		}
@@ -118,10 +118,10 @@
 	}
 
 	public boolean touchUp (int screenX, int screenY, int pointer, int button) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].touchUp(screenX, screenY, pointer, button)) return true;
+				if (((InputProcessor)items[i]).touchUp(screenX, screenY, pointer, button)) return true;
 		} finally {
 			processors.end();
 		}
@@ -129,10 +129,10 @@
 	}
 
 	public boolean touchDragged (int screenX, int screenY, int pointer) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].touchDragged(screenX, screenY, pointer)) return true;
+				if (((InputProcessor)items[i]).touchDragged(screenX, screenY, pointer)) return true;
 		} finally {
 			processors.end();
 		}
@@ -140,10 +140,10 @@
 	}
 
 	public boolean mouseMoved (int screenX, int screenY) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].mouseMoved(screenX, screenY)) return true;
+				if (((InputProcessor)items[i]).mouseMoved(screenX, screenY)) return true;
 		} finally {
 			processors.end();
 		}
@@ -151,10 +151,10 @@
 	}
 
 	public boolean scrolled (int amount) {
-		InputProcessor[] items = processors.begin();
+		Object[] items = processors.begin();
 		try {
 			for (int i = 0, n = processors.size; i < n; i++)
-				if (items[i].scrolled(amount)) return true;
+				if (((InputProcessor)items[i]).scrolled(amount)) return true;
 		} finally {
 			processors.end();
 		}
