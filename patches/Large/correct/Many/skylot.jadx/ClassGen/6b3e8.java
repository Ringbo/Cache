diff --git a/jadx-core/src/main/java/jadx/core/codegen/ClassGen.java b/jadx-core/src/main/java/jadx/core/codegen/ClassGen.java
index 9221370..dec89c9 100644
--- a/jadx-core/src/main/java/jadx/core/codegen/ClassGen.java
+++ b/jadx-core/src/main/java/jadx/core/codegen/ClassGen.java
@@ -341,7 +341,7 @@
 			});
 		}
 		if (!warns.isEmpty()) {
-			warns.forEach(warn -> code.startLine("/* JADX WARNING: ").add(warn.getWarn()).add(" */"));
+			warns.forEach(warn -> code.startLine("/* JADX WARNING: ").addMultiLine(warn.getWarn()).add(" */"));
 		}
 	}
 
