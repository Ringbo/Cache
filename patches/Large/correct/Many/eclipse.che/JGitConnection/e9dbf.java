diff --git a/wsagent/che-core-git-impl-jgit/src/main/java/org/eclipse/che/git/impl/jgit/JGitConnection.java b/wsagent/che-core-git-impl-jgit/src/main/java/org/eclipse/che/git/impl/jgit/JGitConnection.java
index b19b038..e9820fe 100644
--- a/wsagent/che-core-git-impl-jgit/src/main/java/org/eclipse/che/git/impl/jgit/JGitConnection.java
+++ b/wsagent/che-core-git-impl-jgit/src/main/java/org/eclipse/che/git/impl/jgit/JGitConnection.java
@@ -389,7 +389,7 @@
     public List<Branch> branchList(BranchListRequest request) throws GitException {
         String listMode = request.getListMode();
         if (listMode != null && !BranchListRequest.LIST_ALL.equals(listMode) && !BranchListRequest.LIST_REMOTE.equals(listMode)) {
-            throw new IllegalArgumentException(String.format(ERROR_BRANCH_LIST_UNSUPPORTED_LIST_MODE, listMode));
+            throw new GitException(String.format(ERROR_BRANCH_LIST_UNSUPPORTED_LIST_MODE, listMode));
         }
 
         ListBranchCommand listBranchCommand = getGit().branchList();
@@ -777,7 +777,7 @@
         try {
             Ref ref = repository.findRef(request.getCommit());
             if (ref == null) {
-                throw new IllegalArgumentException("Invalid reference to commit for merge " + request.getCommit());
+                throw new GitException("Invalid reference to commit for merge " + request.getCommit());
             }
             // Shorten local branch names by removing '/refs/heads/' from the beginning
             String name = ref.getName();
@@ -1114,18 +1114,18 @@
     public void remoteAdd(RemoteAddRequest request) throws GitException {
         String remoteName = request.getName();
         if (isNullOrEmpty(remoteName)) {
-            throw new IllegalArgumentException(ERROR_ADD_REMOTE_NAME_MISSING);
+            throw new GitException(ERROR_ADD_REMOTE_NAME_MISSING);
         }
 
         StoredConfig config = repository.getConfig();
         Set<String> remoteNames = config.getSubsections("remote");
         if (remoteNames.contains(remoteName)) {
-            throw new IllegalArgumentException(String.format(ERROR_ADD_REMOTE_NAME_ALREADY_EXISTS, remoteName));
+            throw new GitException(String.format(ERROR_ADD_REMOTE_NAME_ALREADY_EXISTS, remoteName));
         }
 
         String url = request.getUrl();
         if (isNullOrEmpty(url)) {
-            throw new IllegalArgumentException(ERROR_ADD_REMOTE_URL_MISSING);
+            throw new GitException(ERROR_ADD_REMOTE_URL_MISSING);
         }
 
         RemoteConfig remoteConfig;
@@ -1139,7 +1139,7 @@
         try {
             remoteConfig.addURI(new URIish(url));
         } catch (URISyntaxException exception) {
-            throw new IllegalArgumentException("Remote url " + url + " is invalid. ");
+            throw new GitException("Remote url " + url + " is invalid. ");
         }
 
         List<String> branches = request.getBranches();
@@ -1222,13 +1222,13 @@
     public void remoteUpdate(RemoteUpdateRequest request) throws GitException {
         String remoteName = request.getName();
         if (isNullOrEmpty(remoteName)) {
-            throw new IllegalArgumentException(ERROR_UPDATE_REMOTE_NAME_MISSING);
+            throw new GitException(ERROR_UPDATE_REMOTE_NAME_MISSING);
         }
 
         StoredConfig config = repository.getConfig();
         Set<String> remoteNames = config.getSubsections(ConfigConstants.CONFIG_KEY_REMOTE);
         if (!remoteNames.contains(remoteName)) {
-            throw new IllegalArgumentException("Remote " + remoteName + " not found. ");
+            throw new GitException("Remote " + remoteName + " not found. ");
         }
 
         RemoteConfig remoteConfig;
@@ -1274,7 +1274,7 @@
             try {
                 remoteConfig.addURI(new URIish(url));
             } catch (URISyntaxException e) {
-                throw new IllegalArgumentException("Remote url " + url + " is invalid. ");
+                throw new GitException("Remote url " + url + " is invalid. ");
             }
         }
 
@@ -1292,7 +1292,7 @@
             try {
                 remoteConfig.addPushURI(new URIish(url));
             } catch (URISyntaxException e) {
-                throw new IllegalArgumentException("Remote push url " + url + " is invalid. ");
+                throw new GitException("Remote push url " + url + " is invalid. ");
             }
         }
 
@@ -1406,7 +1406,7 @@
             String tagName = request.getName();
             Ref tagRef = repository.findRef(tagName);
             if (tagRef == null) {
-                throw new IllegalArgumentException("Tag " + tagName + " not found. ");
+                throw new GitException("Tag " + tagName + " not found. ");
             }
 
             RefUpdate updateRef = repository.updateRef(tagRef.getName());
