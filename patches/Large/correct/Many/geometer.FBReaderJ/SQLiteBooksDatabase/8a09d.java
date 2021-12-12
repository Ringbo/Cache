diff --git a/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java b/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
index d1f2592..b2ea232 100644
--- a/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
+++ b/src/org/geometerplus/android/fbreader/libraryService/SQLiteBooksDatabase.java
@@ -1008,7 +1008,7 @@
 		statement.bindLong(2, lastModified);
 		try {
 			return statement.simpleQueryForString();
-		} catch (SQLiteDoneException e) {
+		} catch (SQLException e) {
 			return null;
 		}
 	}
