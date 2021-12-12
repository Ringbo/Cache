diff --git a/src/jorphan/org/apache/jorphan/util/Converter.java b/src/jorphan/org/apache/jorphan/util/Converter.java
index ad1a7ee..40e6dc2 100755
--- a/src/jorphan/org/apache/jorphan/util/Converter.java
+++ b/src/jorphan/org/apache/jorphan/util/Converter.java
@@ -57,7 +57,7 @@
 		} else if (toType.equals(long.class) || toType.equals(Long.class)) {
 			return new Long(getLong(value));
 		} else if (toType.equals(boolean.class) || toType.equals(Boolean.class)) {
-			return Boolean.valueOf(getBoolean(value));
+			return  JOrphanUtils.valueOf(getBoolean(value));//JDK1.4 was Boolean.valueOf()
 		} else if (toType.equals(java.util.Date.class)) {
 			return getDate(value);
 		} else if (toType.equals(Calendar.class)) {
