diff --git a/app/src/main/java/com/fastaccess/ui/adapter/viewholder/IssuesViewHolder.java b/app/src/main/java/com/fastaccess/ui/adapter/viewholder/IssuesViewHolder.java
index 1877acc..f0213bb 100644
--- a/app/src/main/java/com/fastaccess/ui/adapter/viewholder/IssuesViewHolder.java
+++ b/app/src/main/java/com/fastaccess/ui/adapter/viewholder/IssuesViewHolder.java
@@ -60,15 +60,15 @@
                 if (parser != null) builder.bold(parser.getLogin())
                         .append("/")
                         .bold(parser.getRepoId())
-                        .append("#")
-                        .append(String.valueOf(issueModel.getNumber())).append(" ")
+                        .bold("#")
+                        .bold(String.valueOf(issueModel.getNumber())).append(" ")
                         .append(" ");
             }
             if (!showRepoName) {
                 if (issueModel.getState() == IssueState.closed) {
                     if (issueModel.getClosedBy() == null) {
-                        builder.append("#")
-                                .append(String.valueOf(issueModel.getNumber())).append(" ")
+                        builder.bold("#")
+                                .bold(String.valueOf(issueModel.getNumber())).append(" ")
                                 .append(" ");
                     } else {
                         builder.append("#")
@@ -77,8 +77,8 @@
                                 .append(" ");
                     }
                 } else {
-                    builder.append("#")
-                            .append(String.valueOf(issueModel.getNumber())).append(" ")
+                    builder.bold("#")
+                            .bold(String.valueOf(issueModel.getNumber())).append(" ")
                             .append(issueModel.getUser().getLogin())
                             .append(" ");
                 }
