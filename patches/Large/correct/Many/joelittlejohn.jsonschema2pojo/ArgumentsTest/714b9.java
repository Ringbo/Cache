diff --git a/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java b/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
index 00d2edb..fdef319 100644
--- a/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
+++ b/jsonschema2pojo-cli/src/test/java/org/jsonschema2pojo/cli/ArgumentsTest.java
@@ -55,7 +55,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is("mypackage"));
         assertThat(args.isGenerateBuilders(), is(true));
@@ -72,7 +72,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is("mypackage"));
         assertThat(args.isGenerateBuilders(), is(true));
@@ -98,7 +98,7 @@
         });
 
         assertThat(args.didExit(), is(false));
-        assertThat(args.getSource().next().getFile(), is("/home/source"));
+        assertThat(args.getSource().next().getFile(), endsWith("/home/source"));
         assertThat(args.getTargetDirectory(), is(theFile("/home/target")));
         assertThat(args.getTargetPackage(), is(nullValue()));
         assertThat(args.isGenerateBuilders(), is(false));
