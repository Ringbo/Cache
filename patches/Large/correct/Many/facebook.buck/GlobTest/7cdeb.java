diff --git a/test/com/facebook/buck/skylark/function/GlobTest.java b/test/com/facebook/buck/skylark/function/GlobTest.java
index eff86c1..5b40eb2 100644
--- a/test/com/facebook/buck/skylark/function/GlobTest.java
+++ b/test/com/facebook/buck/skylark/function/GlobTest.java
@@ -74,7 +74,7 @@
     Path buildFile = root.getChild("BUCK");
     FileSystemUtils.writeContentAsLatin1(buildFile, "txts = glob(['*.txt'])");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of("bar.txt", "foo.txt"))));
   }
 
@@ -86,7 +86,7 @@
     Path buildFile = root.getChild("BUCK");
     FileSystemUtils.writeContentAsLatin1(buildFile, "txts = glob(include=['*.txt'])");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of("bar.txt", "foo.txt"))));
   }
 
@@ -98,7 +98,7 @@
     Path buildFile = root.getChild("BUCK");
     FileSystemUtils.writeContentAsLatin1(buildFile, "txts = glob(['*.txt'], exclude=['bar.txt'])");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of("foo.txt"))));
   }
 
@@ -109,7 +109,7 @@
     FileSystemUtils.writeContentAsLatin1(
         buildFile, "txts = glob(['some_dir'], exclude_directories=False)");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of("some_dir"))));
   }
 
@@ -120,7 +120,7 @@
     FileSystemUtils.writeContentAsLatin1(
         buildFile, "txts = glob(['some_dir'], exclude_directories=True)");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of())));
   }
 
@@ -130,7 +130,7 @@
     Path buildFile = root.getChild("BUCK");
     FileSystemUtils.writeContentAsLatin1(buildFile, "txts = glob(['some_dir'])");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of())));
   }
 
@@ -139,7 +139,7 @@
     Path buildFile = root.getChild("BUCK");
     FileSystemUtils.writeContentAsLatin1(buildFile, "txts = glob([])");
     assertThat(
-        assertEvaluate(buildFile).lookup("txts"),
+        assertEvaluate(buildFile).moduleLookup("txts"),
         equalTo(SkylarkList.createImmutable(ImmutableList.of())));
     Event event = Iterables.getOnlyElement(eventHandler);
     assertThat(event.getKind(), is(EventKind.WARNING));
