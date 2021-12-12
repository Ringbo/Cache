diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
index d2ffac3..e05f70a 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnVcs.java
@@ -578,7 +578,7 @@
   public SVNStatusClient createStatusClient() {
     SVNStatusClient client = new SVNStatusClient(getPool(), myConfiguration.getOptions(myProject));
     client.getOperationsFactory().setAuthenticationManager(myConfiguration.getAuthenticationManager(this));
-    client.setIgnoreExternals(true);
+    client.setIgnoreExternals(false);
     return client;
   }
 
