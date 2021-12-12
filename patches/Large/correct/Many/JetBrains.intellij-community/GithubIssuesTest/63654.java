diff --git a/plugins/github/test/org/jetbrains/plugins/github/GithubIssuesTest.java b/plugins/github/test/org/jetbrains/plugins/github/GithubIssuesTest.java
index e1f6a92..80220e0 100644
--- a/plugins/github/test/org/jetbrains/plugins/github/GithubIssuesTest.java
+++ b/plugins/github/test/org/jetbrains/plugins/github/GithubIssuesTest.java
@@ -68,7 +68,7 @@
       }
     });
 
-    List<Long> expected = Arrays.asList(1L, 2L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 13L);
+    List<Long> expected = Arrays.asList(1L, 2L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 13L, 14L);
 
     assertTrue(Comparing.haveEqualElements(issues, expected));
   }
