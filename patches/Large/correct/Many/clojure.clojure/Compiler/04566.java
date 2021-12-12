diff --git a/src/jvm/clojure/lang/Compiler.java b/src/jvm/clojure/lang/Compiler.java
index bc19538..1eaa9e8 100644
--- a/src/jvm/clojure/lang/Compiler.java
+++ b/src/jvm/clojure/lang/Compiler.java
@@ -5774,7 +5774,7 @@
 	catch(Throwable e)
 		{
 		if(!(e instanceof CompilerException))
-			throw new CompilerException((String) SOURCE.deref(), (Integer) LINE.deref(), e);
+			throw new CompilerException((String) SOURCE_PATH.deref(), (Integer) LINE.deref(), e);
 		else
 			throw (CompilerException) e;
 		}
@@ -5947,7 +5947,7 @@
 	catch(Throwable e)
 		{
 		if(!(e instanceof CompilerException))
-			throw new CompilerException((String) SOURCE.deref(), (Integer) LINE.deref(), e);
+			throw new CompilerException((String) SOURCE_PATH.deref(), (Integer) LINE.deref(), e);
 		else
 			throw (CompilerException) e;
 		}
@@ -6434,7 +6434,7 @@
 		}
 	catch(LispReader.ReaderException e)
 		{
-		throw new CompilerException(sourceName, e.line, e.getCause());
+		throw new CompilerException(sourcePath, e.line, e.getCause());
 		}
 	finally
 		{
@@ -6653,7 +6653,7 @@
 		}
 	catch(LispReader.ReaderException e)
 		{
-		throw new CompilerException(sourceName, e.line, e.getCause());
+		throw new CompilerException(sourcePath, e.line, e.getCause());
 		}
 	finally
 		{
