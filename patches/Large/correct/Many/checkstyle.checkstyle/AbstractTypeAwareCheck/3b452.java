diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
index f8487b3..0c665d9 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractTypeAwareCheck.java
@@ -429,7 +429,7 @@
          * @param surroundingClass name of current surrounding class.
          * @param check the check we use to load class.
          */
-        public RegularClass(final Token name,
+        RegularClass(final Token name,
                              final String surroundingClass,
                              final AbstractTypeAwareCheck check) {
             super(name);
