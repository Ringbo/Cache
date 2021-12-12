diff --git a/mod/jodd-wot/src/jodd/db/type/CharacterSqlType.java b/mod/jodd-wot/src/jodd/db/type/CharacterSqlType.java
index 58c925d..34bd496 100644
--- a/mod/jodd-wot/src/jodd/db/type/CharacterSqlType.java
+++ b/mod/jodd-wot/src/jodd/db/type/CharacterSqlType.java
@@ -28,7 +28,7 @@
 		if (s.length() > 1) {
 			throw new DbSqlException("Char column size too long, should be 1.");
 		}
-		return Character.valueOf(s.charAt(1));
+		return Character.valueOf(s.charAt(0));
 	}
 
 	/**
