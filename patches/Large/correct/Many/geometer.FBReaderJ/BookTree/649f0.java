diff --git a/src/org/geometerplus/fbreader/library/BookTree.java b/src/org/geometerplus/fbreader/library/BookTree.java
index 0325e10..7e6ffa5 100644
--- a/src/org/geometerplus/fbreader/library/BookTree.java
+++ b/src/org/geometerplus/fbreader/library/BookTree.java
@@ -35,7 +35,7 @@
 
 	public String getSummary() {
 		if (!myShowAuthors) {
-			return super.getSecondString();
+			return super.getSummary();
 		}
 		StringBuilder builder = new StringBuilder();
 		int count = 0;
