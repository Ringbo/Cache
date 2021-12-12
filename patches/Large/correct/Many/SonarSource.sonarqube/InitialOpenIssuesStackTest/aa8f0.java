diff --git a/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/InitialOpenIssuesStackTest.java b/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/InitialOpenIssuesStackTest.java
index 3f9144b..590f9bd 100644
--- a/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/InitialOpenIssuesStackTest.java
+++ b/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/InitialOpenIssuesStackTest.java
@@ -128,7 +128,7 @@
     assertThat(stack.selectAllIssues()).hasSize(1);
 
     stack.clear();
-    assertThat(stack.selectAllIssues()).hasSize(0);
+    assertThat(stack.selectAllIssues()).isEmpty();
   }
 
   @Test
@@ -138,6 +138,6 @@
     assertThat(stack.selectChangelog("ISSUE-1")).hasSize(1);
 
     stack.clear();
-    assertThat(stack.selectChangelog("ISSUE-1")).isNull();
+    assertThat(stack.selectChangelog("ISSUE-1")).isEmpty();
   }
 }
