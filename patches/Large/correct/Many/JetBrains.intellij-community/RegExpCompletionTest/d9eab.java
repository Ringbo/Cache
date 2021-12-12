diff --git a/RegExpSupport/test/org/intellij/lang/regexp/RegExpCompletionTest.java b/RegExpSupport/test/org/intellij/lang/regexp/RegExpCompletionTest.java
index 4240e0b..3ba88ab 100644
--- a/RegExpSupport/test/org/intellij/lang/regexp/RegExpCompletionTest.java
+++ b/RegExpSupport/test/org/intellij/lang/regexp/RegExpCompletionTest.java
@@ -60,7 +60,7 @@
     public void testBackSlashVariants() throws Throwable {
         List<String> nameList =
           new ArrayList<>(Arrays.asList("d", "D", "s", "S", "w", "W", "b", "B", "A", "G", "Z", "z", "Q", "E",
-                                        "t", "n", "r", "f", "a", "e", "h", "H", "v", "V", "R", "X"));
+                                        "t", "n", "r", "f", "a", "e", "h", "H", "v", "V", "R", "X", "b{g}"));
         for (String[] stringArray : DefaultRegExpPropertiesProvider.getInstance().getAllKnownProperties()) {
             nameList.add("p{" + stringArray[0] + "}");
         }
