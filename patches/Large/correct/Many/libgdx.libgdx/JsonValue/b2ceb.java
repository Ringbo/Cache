diff --git a/gdx/src/com/badlogic/gdx/utils/JsonValue.java b/gdx/src/com/badlogic/gdx/utils/JsonValue.java
index 184046b..7a4231f 100644
--- a/gdx/src/com/badlogic/gdx/utils/JsonValue.java
+++ b/gdx/src/com/badlogic/gdx/utils/JsonValue.java
@@ -244,9 +244,9 @@
 		case stringValue:
 			return stringValue.equalsIgnoreCase("true");
 		case doubleValue:
-			return doubleValue == 0;
+			return doubleValue != 0;
 		case longValue:
-			return longValue == 0;
+			return longValue != 0;
 		case booleanValue:
 			return longValue != 0;
 		}
