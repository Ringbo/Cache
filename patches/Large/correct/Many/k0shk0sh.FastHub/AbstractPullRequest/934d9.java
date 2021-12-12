diff --git a/app/src/main/java/com/fastaccess/data/dao/model/AbstractPullRequest.java b/app/src/main/java/com/fastaccess/data/dao/model/AbstractPullRequest.java
index c239a51..bc2d709 100644
--- a/app/src/main/java/com/fastaccess/data/dao/model/AbstractPullRequest.java
+++ b/app/src/main/java/com/fastaccess/data/dao/model/AbstractPullRequest.java
@@ -157,7 +157,7 @@
                             .append("/")
                             .bold(parser.getRepoId())
                             .append(" ")
-                            .append("#").append(String.valueOf(pullRequest.getNumber()))
+                            .bold("#").bold(String.valueOf(pullRequest.getNumber()))
                             .append(" ");
             } else {
                 builder.bold("#" + pullRequest.getNumber())
@@ -187,7 +187,7 @@
                             .append("/")
                             .bold(parser.getRepoId())
                             .append(" ")
-                            .append("#").append(String.valueOf(pullRequest.getNumber()))
+                            .bold("#").bold(String.valueOf(pullRequest.getNumber()))
                             .append(" ");
                 }
             } else {
