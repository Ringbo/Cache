diff --git a/src/java/net/sf/jabref/AuthorList.java b/src/java/net/sf/jabref/AuthorList.java
index cf97f83..089d972 100644
--- a/src/java/net/sf/jabref/AuthorList.java
+++ b/src/java/net/sf/jabref/AuthorList.java
@@ -1043,7 +1043,7 @@
 		 */
 		private boolean properBrackets(String s) {
 			// nested construct is there, check for "proper" nesting
-			int i = 1;
+			int i = 0;
 			int level = 0;
 			loop: do {
 				char c = s.charAt(i);
