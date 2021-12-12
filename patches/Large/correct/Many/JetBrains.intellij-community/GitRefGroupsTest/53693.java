diff --git a/plugins/git4idea/tests/git4idea/log/GitRefGroupsTest.java b/plugins/git4idea/tests/git4idea/log/GitRefGroupsTest.java
index 0b5ef97..9f285d9 100644
--- a/plugins/git4idea/tests/git4idea/log/GitRefGroupsTest.java
+++ b/plugins/git4idea/tests/git4idea/log/GitRefGroupsTest.java
@@ -31,7 +31,8 @@
 public class GitRefGroupsTest extends GitRefManagerTest {
   public void test_single_tracked_branch() throws IOException {
     check(given("HEAD", "master", "origin/master"), ContainerUtil.list("HEAD"), Pair.create("Local", ContainerUtil.list("master")),
-          Pair.create("Tracked", ContainerUtil.list("origin/master")));
+          Pair.create("Tracked", ContainerUtil.list("origin/master")),
+          Pair.create("origin/...", ContainerUtil.list("origin/master")));
   }
 
   public void test_single_local_branch() throws IOException {
@@ -41,7 +42,7 @@
   public void test_local_tracked_and_remote_branch() throws IOException {
     check(given("HEAD", "master", "origin/master", "origin/remote_branch", "local_branch"), ContainerUtil.list("HEAD"),
           Pair.create("Local", ContainerUtil.list("master", "local_branch")), Pair.create("Tracked", ContainerUtil.list("origin/master")),
-          Pair.create("origin/...", ContainerUtil.list("origin/remote_branch")));
+          Pair.create("origin/...", ContainerUtil.list("origin/master", "origin/remote_branch")));
   }
 
   private void check(@NotNull Collection<VcsRef> actual,
