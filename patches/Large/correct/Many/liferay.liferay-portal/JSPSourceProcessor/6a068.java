diff --git a/modules/util/source-formatter/src/com/liferay/source/formatter/JSPSourceProcessor.java b/modules/util/source-formatter/src/com/liferay/source/formatter/JSPSourceProcessor.java
index bcc1d75..34c52bc 100644
--- a/modules/util/source-formatter/src/com/liferay/source/formatter/JSPSourceProcessor.java
+++ b/modules/util/source-formatter/src/com/liferay/source/formatter/JSPSourceProcessor.java
@@ -767,7 +767,7 @@
 								}
 								else if (Validator.isNull(
 											previousAttributeAndValue) &&
-										 (previousAttribute.compareTo(
+										 (previousAttribute.compareToIgnoreCase(
 											 attribute) > 0)) {
 
 									previousAttributeAndValue = previousLine;
@@ -801,8 +801,8 @@
 							currentException = line.substring(x, y);
 
 							if (Validator.isNotNull(previousException) &&
-								(previousException.compareTo(currentException) >
-									0)) {
+								(previousException.compareToIgnoreCase(
+									currentException) > 0)) {
 
 								currentException = line;
 								previousException = previousLine;
