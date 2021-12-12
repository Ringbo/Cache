diff --git a/core/src/test/java/org/elasticsearch/common/unit/ByteSizeValueTests.java b/core/src/test/java/org/elasticsearch/common/unit/ByteSizeValueTests.java
index d9010136..7cf96b4 100644
--- a/core/src/test/java/org/elasticsearch/common/unit/ByteSizeValueTests.java
+++ b/core/src/test/java/org/elasticsearch/common/unit/ByteSizeValueTests.java
@@ -208,7 +208,7 @@
         if (randomBoolean()) {
             ByteSizeUnit unit = randomFrom(ByteSizeUnit.values());
             long size = randomNonNegativeLong() / unit.toBytes(1);
-            if (size >= Long.MAX_VALUE / unit.toBytes(1)) {
+            if (size > Long.MAX_VALUE / unit.toBytes(1)) {
                 throw new AssertionError();
             }
             return new ByteSizeValue(size, unit);
