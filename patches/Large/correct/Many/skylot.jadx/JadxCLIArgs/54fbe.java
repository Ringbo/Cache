diff --git a/jadx-cli/src/main/java/jadx/cli/JadxCLIArgs.java b/jadx-cli/src/main/java/jadx/cli/JadxCLIArgs.java
index 09dbddf..d01bc32 100644
--- a/jadx-cli/src/main/java/jadx/cli/JadxCLIArgs.java
+++ b/jadx-cli/src/main/java/jadx/cli/JadxCLIArgs.java
@@ -171,7 +171,7 @@
 			}
 			StringBuilder opt = new StringBuilder();
 			opt.append("  ").append(p.getNames());
-			addSpaces(opt, maxNamesLen - opt.length() + 2);
+			addSpaces(opt, maxNamesLen - opt.length() + 3);
 			opt.append("- ").append(p.getDescription());
 			out.println(opt);
 		}
