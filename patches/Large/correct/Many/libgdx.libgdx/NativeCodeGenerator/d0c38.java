diff --git a/extensions/gdx-jnigen/src/com/badlogic/gdx/jnigen/NativeCodeGenerator.java b/extensions/gdx-jnigen/src/com/badlogic/gdx/jnigen/NativeCodeGenerator.java
index fb49cb0..a2b6428 100644
--- a/extensions/gdx-jnigen/src/com/badlogic/gdx/jnigen/NativeCodeGenerator.java
+++ b/extensions/gdx-jnigen/src/com/badlogic/gdx/jnigen/NativeCodeGenerator.java
@@ -89,7 +89,7 @@
 			mergeJavaAndCMethod(buffer, javaMethods.get(i), cMethods.get(i));
 			buffer.append("\n");
 		}
-		cppFile.writeString(buffer.toString(), false);
+		cppFile.writeString(buffer.toString(), false, "UTF-8");
 	}
 	
 	private void mergeJavaAndCMethod(StringBuffer buffer, JavaMethod javaMethod, CMethod cMethod) {
