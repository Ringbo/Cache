diff --git a/gdx/src/com/badlogic/gdx/utils/Json.java b/gdx/src/com/badlogic/gdx/utils/Json.java
index ffaeec4..7da25bc 100644
--- a/gdx/src/com/badlogic/gdx/utils/Json.java
+++ b/gdx/src/com/badlogic/gdx/utils/Json.java
@@ -460,7 +460,7 @@
 				return;
 			}
 			if (value instanceof Collection) {
-				if (knownType != null && actualType != knownType && actualType != ArrayList.class) {
+				if (typeName != null && actualType != ArrayList.class && (knownType == null || knownType != actualType)) {
 					writeObjectStart(actualType, knownType);
 					writeArrayStart("items");
 					for (Object item : (Collection)value)
@@ -520,7 +520,7 @@
 
 			// Enum special case.
 			if (ClassReflection.isAssignableFrom(Enum.class, actualType)) {
-				if (knownType == null || knownType != actualType) {
+				if (typeName != null && (knownType == null || knownType != actualType)) {
 					// Ensures that enums with specific implementations (abstract logic) serialize correctly.
 					if (actualType.getEnumConstants() == null) actualType = actualType.getSuperclass();
 
@@ -837,7 +837,7 @@
 				return readValue("value", type, jsonData);
 			}
 
-			if (ClassReflection.isAssignableFrom(Collection.class, type)) {
+			if (typeName != null && ClassReflection.isAssignableFrom(Collection.class, type)) {
 				// JSON object wrapper to specify type.
 				jsonData = jsonData.get("items");
 			} else {
