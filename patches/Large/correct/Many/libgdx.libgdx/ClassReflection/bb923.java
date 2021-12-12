diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/reflect/ClassReflection.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/reflect/ClassReflection.java
index 6db7964..3ad2cea 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/reflect/ClassReflection.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/reflect/ClassReflection.java
@@ -34,7 +34,7 @@
 
 	/** Returns the simple name of the underlying class as supplied in the source code. */
 	static public String getSimpleName (Class c) {
-		return c.getName();
+		return c.getSimpleName();
 	}
 
 	/** Determines if the supplied Object is assignment-compatible with the object represented by supplied Class. */
