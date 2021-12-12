diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
index 0a7d9a8..2f83af7 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/MainTest.java
@@ -517,7 +517,7 @@
             @Override
             public void checkAssertion() throws IOException {
                 final String expectedPath = getFilePath("main/") + File.separator;
-                final StringBuilder sb = new StringBuilder();
+                final StringBuilder sb = new StringBuilder(28);
                 sb.append("Starting audit...").append(System.getProperty("line.separator"));
                 final String format = "[WARN] %s.java:%s: %s [FileLength]";
                 for (String[] outputValue : outputValues) {
