diff --git a/gdx/src/com/badlogic/gdx/utils/Json.java b/gdx/src/com/badlogic/gdx/utils/Json.java
index c82366c..67c6273 100644
--- a/gdx/src/com/badlogic/gdx/utils/Json.java
+++ b/gdx/src/com/badlogic/gdx/utils/Json.java
@@ -43,7 +43,7 @@
  * https://code.google.com/p/libgdx/wiki/JsonParsing
  * @author Nathan Sweet */
 public class Json {
-	private static final boolean debug = false;
+	private static final boolean debug = true;
 
 	private JsonWriter writer;
 	private String typeName = "class";
@@ -428,7 +428,7 @@
 			}
 
 			if (value instanceof Array) {
-				if (knownType != null && actualType != knownType)
+				if (knownType != null && actualType != knownType && actualType != Array.class)
 					throw new SerializationException("Serialization of an Array other than the known type is not supported.\n"
 						+ "Known type: " + knownType + "\nActual type: " + actualType);
 				writeArrayStart();
