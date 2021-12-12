diff --git a/plugins/git4idea/tests/git4idea/repo/GitConfigTest.java b/plugins/git4idea/tests/git4idea/repo/GitConfigTest.java
index 5e50a82..fbbf060 100644
--- a/plugins/git4idea/tests/git4idea/repo/GitConfigTest.java
+++ b/plugins/git4idea/tests/git4idea/repo/GitConfigTest.java
@@ -83,7 +83,7 @@
       }
       String[] info = remString.split("\n");
       String name = info[0];
-      Collection<String> urls = getUrls(info[1]);
+      List<String> urls = getUrls(info[1]);
       Collection<String> pushUrls = getUrls(info[2]);
       String fetchSpec = getOrEmpty(info, 3);
       String pushSpec = getOrEmpty(info, 4);
@@ -93,7 +93,7 @@
     return remotes;
   }
 
-  private static Collection<String> getUrls(String line) {
+  private static List<String> getUrls(String line) {
     if (StringUtil.isEmptyOrSpaces(line)) {
       return Collections.emptyList();
     }
