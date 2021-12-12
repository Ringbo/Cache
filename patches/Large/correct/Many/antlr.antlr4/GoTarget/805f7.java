diff --git a/tool/src/org/antlr/v4/codegen/target/GoTarget.java b/tool/src/org/antlr/v4/codegen/target/GoTarget.java
index e0d9929..ddf59b1 100644
--- a/tool/src/org/antlr/v4/codegen/target/GoTarget.java
+++ b/tool/src/org/antlr/v4/codegen/target/GoTarget.java
@@ -96,11 +96,11 @@
 	}
 
 	public boolean wantsBaseListener() {
-		return false;
+		return true;
 	}
 
 	public boolean wantsBaseVisitor() {
-		return false;
+		return true;
 	}
 
 	public boolean supportsOverloadedMethods() {
