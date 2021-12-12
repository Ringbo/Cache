diff --git a/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java b/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
index 9eb8a0a..46d3b3e 100644
--- a/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
+++ b/modules/util/source-formatter/src/test/java/com/liferay/source/formatter/JavaSourceProcessorTest.java
@@ -189,7 +189,7 @@
 			},
 			new Integer[] {
 				32, 36, 44, 48, 48, 53, 56, 59, 62, 66, 69, 74, 78, 83, 87, 94,
-				105, 118, 123, 130, 140, 158
+				105, 118, 123, 130, 140, 160
 			});
 		test("IncorrectLineBreaks2.testjava");
 	}
@@ -217,7 +217,7 @@
 				"Line starts with '2' tabs, but '3' tabs are expected",
 				"Line starts with '3' tabs, but '4' tabs are expected"
 			},
-			new Integer[] {26, 30, 31, 32, 37});
+			new Integer[] {26, 32, 33, 34, 39});
 	}
 
 	public void testIncorrectVariableNames() throws Exception {
@@ -243,7 +243,7 @@
 				"Local non-final variable 'TestString' must match pattern " +
 					"'^[a-z0-9][_a-zA-Z0-9]*$'"
 			},
-			new Integer[] {26, 29});
+			new Integer[] {26, 31});
 	}
 
 	public void testIncorrectWhitespace() throws Exception {
