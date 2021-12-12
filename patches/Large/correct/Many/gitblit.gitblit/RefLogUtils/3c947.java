diff --git a/src/main/java/com/gitblit/utils/RefLogUtils.java b/src/main/java/com/gitblit/utils/RefLogUtils.java
index af24773..d19e892 100644
--- a/src/main/java/com/gitblit/utils/RefLogUtils.java
+++ b/src/main/java/com/gitblit/utils/RefLogUtils.java
@@ -642,7 +642,7 @@
                             if (ref.getName().startsWith(Constants.R_TAGS)) {
                                 // treat tags as special events in the log
                                 if (!tags.containsKey(dateStr)) {
-                        			UserModel tagUser = newUserModelFrom(commit.getAuthorIdent());
+                        			UserModel tagUser = newUserModelFrom(ref.getAuthorIdent());
                         			Date tagDate = commit.getAuthorIdent().getWhen();
                         			tags.put(dateStr, new DailyLogEntry(repositoryName, tagDate, tagUser));
                                 }
@@ -653,7 +653,7 @@
                             } else if (ref.getName().startsWith(Constants.R_PULL)) {
                                 // treat pull requests as special events in the log
                                 if (!pulls.containsKey(dateStr)) {
-                        			UserModel commitUser = newUserModelFrom(commit.getAuthorIdent());
+                        			UserModel commitUser = newUserModelFrom(ref.getAuthorIdent());
                         			Date commitDate = commit.getAuthorIdent().getWhen();
                         			pulls.put(dateStr, new DailyLogEntry(repositoryName, commitDate, commitUser));
                                 }
