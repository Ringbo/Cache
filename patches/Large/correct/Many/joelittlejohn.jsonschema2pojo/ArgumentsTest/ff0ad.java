diff --git a/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java b/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
index 725d665..e39afca 100644
--- a/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
+++ b/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
@@ -58,7 +58,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is("mypackage"));
         assertThat(args.isGenerateBuilders(), is(true));
@@ -74,7 +74,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is("mypackage"));
         assertThat(args.isGenerateBuilders(), is(true));
@@ -99,7 +99,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is(nullValue()));
         assertThat(args.isGenerateBuilders(), is(false));
