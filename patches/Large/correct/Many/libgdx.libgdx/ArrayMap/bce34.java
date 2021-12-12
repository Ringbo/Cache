diff --git a/gdx/src/com/badlogic/gdx/utils/ArrayMap.java b/gdx/src/com/badlogic/gdx/utils/ArrayMap.java
index f460df5..b95e415 100644
--- a/gdx/src/com/badlogic/gdx/utils/ArrayMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/ArrayMap.java
@@ -136,12 +136,12 @@
 	public K getKey (V value, boolean identity) {
 		Object[] values = this.values;
 		int i = size - 1;
-		if (identity || values == null) {
+		if (identity || value == null) {
 			for (; i >= 0; i--)
-				if (values[i] == values) return keys[i];
+				if (values[i] == value) return keys[i];
 		} else {
 			for (; i >= 0; i--)
-				if (values.equals(values[i])) return keys[i];
+				if (value.equals(values[i])) return keys[i];
 		}
 		return null;
 	}
