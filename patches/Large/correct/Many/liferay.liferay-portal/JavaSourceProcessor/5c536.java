diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
index 22ab186..a42c2fa 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
@@ -2085,7 +2085,9 @@
 						TYPE_METHOD_PUBLIC);
 				}
 			}
-			else if (line.startsWith(StringPool.TAB + "public class ") ||
+			else if (line.startsWith(
+						StringPool.TAB + "public abstract class ") ||
+					 line.startsWith(StringPool.TAB + "public class ") ||
 					 line.startsWith(StringPool.TAB + "public enum")) {
 
 				return new Tuple(getClassName(line), TYPE_CLASS_PUBLIC);
@@ -2140,7 +2142,9 @@
 					}
 				}
 			}
-			else if (line.startsWith(StringPool.TAB + "protected class ") ||
+			else if (line.startsWith(
+						StringPool.TAB + "protected abstract class ") ||
+					 line.startsWith(StringPool.TAB + "protected class ") ||
 					 line.startsWith(StringPool.TAB + "protected enum ")) {
 
 				return new Tuple(getClassName(line), TYPE_CLASS_PROTECTED);
@@ -2199,7 +2203,9 @@
 						TYPE_METHOD_PRIVATE);
 				}
 			}
-			else if (line.startsWith(StringPool.TAB + "private class ") ||
+			else if (line.startsWith(
+						StringPool.TAB + "private abstract class ") ||
+					 line.startsWith(StringPool.TAB + "private class ") ||
 					 line.startsWith(StringPool.TAB + "private enum ")) {
 
 				return new Tuple(getClassName(line), TYPE_CLASS_PRIVATE);
