diff --git a/platform/util/testSrc/com/intellij/util/text/SemVerTest.java b/platform/util/testSrc/com/intellij/util/text/SemVerTest.java
index 00bdd74..00f39f1 100644
--- a/platform/util/testSrc/com/intellij/util/text/SemVerTest.java
+++ b/platform/util/testSrc/com/intellij/util/text/SemVerTest.java
@@ -47,7 +47,7 @@
   }
 
   private static void checkNotParsed(@NotNull String version) {
-    assertNull(SemVerMatcher.parseFromText(version));
+    assertNull(SemVer.parseFromText(version));
   }
 
   public void testCompare() throws Exception {
@@ -65,7 +65,7 @@
 
   @NotNull
   private static SemVer parseNotNull(@NotNull String text) {
-    SemVer semVer = SemVerMatcher.parseFromText(text);
+    SemVer semVer = SemVer.parseFromText(text);
     assertNotNull(semVer);
     return semVer;
   }
