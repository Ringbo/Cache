diff --git a/plugins/git4idea/tests/git4idea/tests/GitBranchTest.java b/plugins/git4idea/tests/git4idea/tests/GitBranchTest.java
index dca2123..ccc72d1 100644
--- a/plugins/git4idea/tests/git4idea/tests/GitBranchTest.java
+++ b/plugins/git4idea/tests/git4idea/tests/GitBranchTest.java
@@ -90,7 +90,7 @@
   @Test
   public void testList() throws VcsException {
     List<GitBranch> branches = new ArrayList<GitBranch>();
-    GitBranch.list(myProject, myDir, true, true, branches);
+    GitBranch.list(myProject, myDir, true, true, branches, null);
     assertEqualBranchLists(branches, myBranches);
   }
 
@@ -99,7 +99,7 @@
     checkoutRemoteBranch();
 
     List<GitBranch> branches = new ArrayList<GitBranch>();
-    GitBranch.list(myProject, myDir, true, true, branches);
+    GitBranch.list(myProject, myDir, true, true, branches, null);
     assertEqualBranchLists(branches, myBranches);
   }
 
