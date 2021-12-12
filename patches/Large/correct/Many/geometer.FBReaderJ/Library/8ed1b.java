diff --git a/src/org/geometerplus/fbreader/library/Library.java b/src/org/geometerplus/fbreader/library/Library.java
index 61f14b2..afe43d7 100644
--- a/src/org/geometerplus/fbreader/library/Library.java
+++ b/src/org/geometerplus/fbreader/library/Library.java
@@ -321,7 +321,7 @@
 					}
 				}
 			}
-			doGroupTitlesByFirstLetter = letterSet.size() > myBooks.size() + 4;
+			doGroupTitlesByFirstLetter = myBooks.size() > letterSet.size() * 5 / 4;
 		}
 		if (doGroupTitlesByFirstLetter) {
 			final HashMap<Character,TitleTree> letterTrees = new HashMap<Character,TitleTree>();
