diff --git a/src/com/maddyhome/idea/vim/group/SearchGroup.java b/src/com/maddyhome/idea/vim/group/SearchGroup.java
index 237d833..26ad116 100644
--- a/src/com/maddyhome/idea/vim/group/SearchGroup.java
+++ b/src/com/maddyhome/idea/vim/group/SearchGroup.java
@@ -326,7 +326,7 @@
                     firstMatch = false;
                 }
 
-                String match = sp.vim_regsub_multi(regmatch, lnum, sub, 1, true);
+                String match = sp.vim_regsub_multi(regmatch, lnum, sub, 1, false);
                 //logger.debug("found match[" + spos + "," + epos + "] - replace " + match);
 
                 int line = lnum + regmatch.startpos[0].lnum;
