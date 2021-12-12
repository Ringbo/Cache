diff --git a/reactor-core/src/main/java/reactor/core/publisher/MonoFlatMapMany.java b/reactor-core/src/main/java/reactor/core/publisher/MonoFlatMapMany.java
index be48079..0d8532a 100644
--- a/reactor-core/src/main/java/reactor/core/publisher/MonoFlatMapMany.java
+++ b/reactor-core/src/main/java/reactor/core/publisher/MonoFlatMapMany.java
@@ -215,7 +215,7 @@
 
 		@Override
 		public Context currentContext() {
-			return parent.currentContext();
+			return actual.currentContext();
 		}
 
 		@Override
