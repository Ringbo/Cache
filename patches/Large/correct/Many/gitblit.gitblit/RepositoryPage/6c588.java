diff --git a/src/main/java/com/gitblit/wicket/pages/RepositoryPage.java b/src/main/java/com/gitblit/wicket/pages/RepositoryPage.java
index 9a806f4..8314617 100644
--- a/src/main/java/com/gitblit/wicket/pages/RepositoryPage.java
+++ b/src/main/java/com/gitblit/wicket/pages/RepositoryPage.java
@@ -431,9 +431,9 @@
 	}
 
 	protected void addFullText(String wicketId, String text, boolean substituteRegex) {
-		String html = StringUtils.escapeForHtml(text, true);
+		String html = StringUtils.escapeForHtml(text, false);
 		if (substituteRegex) {
-			html = GitBlit.self().processCommitMessage(repositoryName, text);
+			html = GitBlit.self().processCommitMessage(repositoryName, html);
 		} else {
 			html = StringUtils.breakLinesForHtml(html);
 		}
