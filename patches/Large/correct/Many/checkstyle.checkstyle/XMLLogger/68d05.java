diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/XMLLogger.java b/src/main/java/com/puppycrawl/tools/checkstyle/XMLLogger.java
index f3316f2..19818f5 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/XMLLogger.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/XMLLogger.java
@@ -152,7 +152,7 @@
      * @return the escaped value if necessary.
      */
     public static String encode(String value) {
-        final StringBuilder sb = new StringBuilder();
+        final StringBuilder sb = new StringBuilder(256);
         for (int i = 0; i < value.length(); i++) {
             final char chr = value.charAt(i);
             switch (chr) {
