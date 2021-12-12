diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/Json.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/Json.java
index 51a1cf7..1539fad 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/Json.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/emu/com/badlogic/gdx/utils/Json.java
@@ -478,7 +478,7 @@
 			}
 
 			if (value instanceof Map) {
-				if (knownType == null) knownType = ReflectionCache.getType(OrderedMap.class);
+				if (knownType == null) knownType = ReflectionCache.getType(HashMap.class);
 				writeObjectStart(actualType.getClassOfType(), knownType.getClassOfType());
 				for (Map.Entry entry : ((Map<?, ?>)value).entrySet()) {
 					writer.name(convertToString(entry.getKey()));
