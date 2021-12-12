diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnChangeList.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnChangeList.java
index 1e6a086..2863237 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnChangeList.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnChangeList.java
@@ -527,7 +527,7 @@
     final Url becameUrl;
     Url wasUrl;
     try {
-      becameUrl = createUrl(Url.append(myRepositoryRoot, path));
+      becameUrl = createUrl(Url.append(myRepositoryRoot, path), false);
       wasUrl = becameUrl;
 
       if (change instanceof ExternallyRenamedChange && change.getBeforeRevision() != null) {
@@ -535,7 +535,7 @@
 
         if (originUrl != null) {
           // use another url for origin
-          wasUrl = createUrl(Url.append(myRepositoryRoot, originUrl));
+          wasUrl = createUrl(Url.append(myRepositoryRoot, originUrl), false);
         }
       }
     }
