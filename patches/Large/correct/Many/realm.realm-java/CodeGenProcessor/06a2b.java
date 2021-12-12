diff --git a/src/main/java/com/tightdb/generator/CodeGenProcessor.java b/src/main/java/com/tightdb/generator/CodeGenProcessor.java
index f092853..f0dffd9 100644
--- a/src/main/java/com/tightdb/generator/CodeGenProcessor.java
+++ b/src/main/java/com/tightdb/generator/CodeGenProcessor.java
@@ -290,7 +290,7 @@
 			String pkgName = pkg.getQualifiedName().toString();
 			return pkgName.isEmpty() ? "" : pkgName;
 		} else {
-			logger.error("Couldn't calculate the target package! Using default: "
+			logger.warn("Couldn't calculate the target package! Using default: "
 					+ DEFAULT_PACKAGE);
 			return DEFAULT_PACKAGE;
 		}
