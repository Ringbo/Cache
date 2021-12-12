diff --git a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
index d2f80fd..8a066a7 100644
--- a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
+++ b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
@@ -109,8 +109,7 @@
 			return matcher.group("className");
 		}
 
-		throw new RuntimeException(
-			"Unable to find className in " + classCommandName);
+		throw new RuntimeException();
 	}
 
 	public static String getClassNameFromFilePath(String filePath) {
@@ -133,8 +132,7 @@
 			return matcher.group("className");
 		}
 
-		throw new RuntimeException(
-			"Unable to find className in " + namespaceClassName);
+		throw new RuntimeException();
 	}
 
 	public static String getClassTypeFromFileExtension(String fileExtension) {
@@ -168,8 +166,7 @@
 			return commandName;
 		}
 
-		throw new RuntimeException(
-			"commandName invalid for classCommandName: " + classCommandName);
+		throw new RuntimeException();
 	}
 
 	public static String getExtendedTestCaseName() {
@@ -289,9 +286,7 @@
 			return namespace + "." + className;
 		}
 
-		throw new RuntimeException(
-			"Unable to find namespace and className for classCommandName: " +
-				classCommandName);
+		throw new RuntimeException();
 	}
 
 	public static String getNamespaceFromClassCommandName(
@@ -309,8 +304,7 @@
 			return namespace;
 		}
 
-		throw new RuntimeException(
-			"namespace invalid for classCommandName: " + classCommandName);
+		throw new RuntimeException();
 	}
 
 	public static String getNamespaceFromNamespaceClassName(
@@ -328,8 +322,7 @@
 			return namespace;
 		}
 
-		throw new RuntimeException(
-			"namespace invalid for namespaceClassName: " + namespaceClassName);
+		throw new RuntimeException();
 	}
 
 	public static String getProjectDirName() {
@@ -460,9 +453,7 @@
 			return matcher.group("className");
 		}
 
-		throw new RuntimeException(
-			"Unable to find className and commandName in classCommandName: " +
-				classCommandName);
+		throw new RuntimeException();
 	}
 
 	public static Object getVarMethodValue(String expression, String namespace)
